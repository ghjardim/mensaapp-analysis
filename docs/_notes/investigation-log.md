# Investigation log

Running notes, newest at the bottom. Rules for this project: **static analysis only, the Mensa
API / Firebase backend is never called**. Anything not read directly from code is marked *inferred*.
Steps stopped by an AI safety classifier are recorded here instead of being retried.

## 2026-11-08 — Setup
- Reference methodology: `tiktok_analysis/` @ `066e0cd` (git-ignored clone).
- Reports 02 (permissions) and 03 (manifest) written from `decompiled/resources/AndroidManifest.xml`.
- App is Flutter (FlutterFlow-generated). Dart 3.8.1, snapshot `830f4f59e7969c70b595182826435c19`.
- blutter `4a60ac6` built in `tools/blutter`. Output in `_work/blutter/` (git-ignored, 210 MB):
  `asm/<package>/…` (annotated disassembly per Dart file), `pp.txt` (object pool),
  `objs.txt`, `blutter_frida.js`.
- First-party package: `carteirinhas_mensa` (126 files). Key paths:
  `backend/api_requests/api_calls.dart` (9.4k lines), `api_manager.dart`,
  `backend/firebase_analytics/analytics.dart`, `auth/firebase_auth/*`,
  `custom_code/actions/register_f_c_m_token2.dart`.

## 2026-11-08 — Network map (04), part 1
- Every `*Call.call()` in `api_calls.dart` ends in `ApiManager.makeApiCall(...)` with: URL string,
  call name, an `Instance_ApiCallType` enum object (HTTP method), headers map, params map, body
  string, `Instance_BodyType`.
- Bodies are FlutterFlow string templates (`"{\n  \"title\": \"" + … `). `escapeStringForJson`
  (api_calls.dart:6) handles quotes/newlines/tabs.
- Auth: `Authorization: Bearer <token>` on almost every call. Some admin calls (`createEvent`,
  `createTags`) **also** send `"token"` inside the JSON body. Not yet clear whether it is the same
  token. To check in the page code that calls them.

### ⚠ Safeguard note
- While mapping the `Obj!ApiCallType@…` enum instances (5 distinct objects, used 7/2/4/20/11
  times) to their names, a lookup of those objects in blutter's object dump was **stopped by the
  AI assistant's safety classifier**. The step was not retried. Consequence: HTTP methods in
  report 04 are **inferred** from call names, body presence and FlutterFlow conventions, not read
  from the enum. To confirm manually: look up each `ApiCallType@<addr>` in `_work/blutter/pp.txt`
  or `objs.txt` and read its `_name` / index.

## 2026-11-08 — Network map (04), part 2
- `scripts/10-extract-api-calls.py` (static, local files only) → `docs/_evidence/api-calls.md`:
  44 `*Call` classes, all on `https://api.mensan.org.br`, all reaching `ApiManager.makeApiCall`.
- HTTP methods, **inferred**: FastAPI-style call names end in `__get`/`__post`/`__patch`/`__delete`,
  and each suffix lines up 1:1 with one `ApiCallType` object (`b597d1`=GET, `b597f1`=POST,
  `b597b1`=PATCH, `b59771`=DELETE). The fifth object `b59791` (used by `updateEmail`,
  `updateProfessionFB`) is PUT by elimination. Not read from the enum (see safeguard note above).
- The call names suggest the backend is **FastAPI** (default `generate_unique_id` naming). *Inferred*.
- Bearer token = Firebase ID token: `auth_util.dart:187-274` `jwtTokenStream` →
  `FirebaseAuth.idTokenChanges` → `User.getIdToken`.
- `api_manager.dart`: no certificate pinning, `HttpOverrides` or `SecurityContext` anywhere in
  `carteirinhas_mensa` (grep is empty). Uses the default `package:http` client plus system trust store.
- Other hosts in first-party code: `mensa.org.br` (links: manual PDF, partners, dues, `autorizar-zelador`),
  `wiki.mensa.org.br`, `i.imgur.com` (3 images), `api.whatsapp.com/send?phone=`
  (`pages/groups/authorization/authorization_widget.dart`), `app-api.mensa.org.br/certificado?MB=`
  (`pages/perfil/perfil_widget.dart:9346`). Near it are `queryUsersRecordOnce` (Firestore `users`)
  and a `logFirebaseEvent` analytics call.

### ⚠ Safeguard note (2nd)
- Reading the code around the `app-api.mensa.org.br/certificado?MB=` literal in
  `pages/perfil/perfil_widget.dart` (~line 9286-9386), to see how the URL is built and opened,
  was **stopped by the AI assistant's safety classifier**. Not retried. Open question for manual
  review: what value fills `MB=` and how the URL is opened (external browser vs. in-app WebView).
