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

## 2026-11-08 — Data collection (05), part 1
- Firestore: one schema, `backend/schema/users_record.dart` (FlutterFlow `users` collection; the
  collection-name literal was not found by grep, so the name is *inferred* from FlutterFlow convention).
  Fields: `uid`, `email`, `display_name`, `photo_url`, `phone_number`, `birthdate`, `created_time`,
  `updated_at`, `lastActive`, `MB`, `member_status`, `expiration_date`, `profile`, `fcm_token`,
  `CertificateToken`, `AWalletAuthenticationToken`.
- Client writes to Firestore found: 3 × `_JsonDocumentReference.update` with
  `FieldValue.arrayUnion` on `fcm_token` (`pages/carteirinha/carteirinha_widget.dart:5123,6264`,
  `pages/login/login_widget.dart:1227`). No other client-side writes found by grep.
- Analytics wrapper `backend/firebase_analytics/analytics.dart` (FlutterFlow template):
  `logFirebaseEvent` adds param `user` (line 53) = `currentUserUid` or `"unset"` (335-345) to
  **every** event, then `FirebaseAnalytics.logEvent` (261). `logFirebaseAuthEvent` (355) logs
  `sign_up`/`login` with `method` (450-464).
- `scripts/11-extract-analytics-events.py` → `docs/_evidence/analytics-events.md`: all 490
  `logFirebaseEvent` call sites in app code resolved (491st is inside the wrapper), 260 distinct names. Almost all are FlutterFlow
  auto-instrumentation (`screen_view` ×39, `<Widget>_<action>` taps).
- **Finding:** 4 developer-added custom events on the login page put the **user's email** in
  the event parameters (`pages/login/login_widget.dart`):
  - `usernotregistered`: param `Param 1` = `currentUserEmail` (543, 549, 569)
  - `LoginExpiredUser`: param `Email` = `currentUserEmail` (711, 717, 737)
  - `InactiveMember`: param `Email` = `currentUserEmail` (913, 919, 939)
  - `NotMensaEmail`: param `Email` = `currentUserEmail` (1328, 1334, 1354)
  These link an email address to a membership status (expired / inactive / not registered) in Google
  Analytics. Google Analytics terms prohibit sending PII such as email addresses.
  Capability is clear from the code. Whether the events fire depends on runtime login outcomes.

## 2026-11-08 — Data collection (05), part 2
- Analytics configuration: the only `FirebaseAnalytics` methods referenced by first-party code are
  `instance` and `logEvent`. **No** `setAnalyticsCollectionEnabled`, `setConsent`, `setUserId`,
  `setUserProperty` or ad-ID opt-out. SDK defaults apply (collection on).
- `device_info_plus`: **absent from the Dart snapshot** (no package dir, no references in blutter
  output). The Android plugin is registered (03), but the Dart API was tree-shaken out, so the app code
  does not call it.
- Google Places: `flutter_flow/flutter_flow_place_picker.dart` → `PlacesAutocomplete.show` →
  `GoogleMapsPlaces.getDetailsByPlaceId` (with `GoogleApiHeaders`). Used only by
  `pages/create_address/create_address_widget.dart`. User-initiated. The typed address goes to Google
  Places, and `latlong` plus address components (`postal_code`, `country`,
  `administrative_area_level_1`, `locality`, `sublocality`) come back.
- FCM: `custom_code/actions/register_f_c_m_token2.dart` → `requestPermission` → `getToken`. The token
  is appended to Firestore `users.fcm_token` (see part 1). On denial it just prints a message.
- `firebase_storage`: no references in the Dart snapshot (tree-shaken). Activity media uploads go
  to `api.mensan.org.br` as multipart (04).
- Local persistence (`app_state.dart`): only `ff_MB` (membership number, int) and
  `ff_timecached` in SharedPreferences. sqflite only appears via `flutter_cache_manager` (image cache).
  Firestore's offline cache is not configured explicitly, so the SDK default (on) applies. *Inferred*.
- App Check: `flutter_flow/firebase_app_check_util.dart:18` calls `FirebaseAppCheck.activate()` at
  startup (`main.dart`), with no provider override seen. The provider is the plugin default. *Inferred*.
