# 05 — Data Collection

What personal data the app handles, where each item goes, and what it does **not** collect.
Static analysis of the Dart snapshot (blutter output, `_work/blutter/asm/carteirinhas_mensa/…`;
paths below are relative to that). **No request was sent to any Mensa or Firebase server.**
Line-level notes: [`_notes/investigation-log.md`](_notes/investigation-log.md).

## Data flows at a glance

| Destination | What goes there | Trigger | Evidence |
|---|---|---|---|
| **Mensa API** `api.mensan.org.br` | CPF, birth date, address (+ `latlong`), phones, emails, legal representative (CPF, name, contacts), pronouns, profession, Facebook, volunteer activity logs + media | User fills a form | 04, `_evidence/api-calls.md` |
| **Firestore** (`users` doc) | Read: profile, `MB`, `member_status`, `expiration_date`, certificate/wallet tokens. Written by the client: only `fcm_token` | Login / card screen | `backend/schema/users_record.dart`; writes at `pages/login/login_widget.dart:1227`, `pages/carteirinha/carteirinha_widget.dart:5123,6264` |
| **Google Analytics for Firebase** | 490 event call sites (+1 inside the wrapper). Every event carries `user` = Firebase UID. **4 login events carry the email address** | Navigation, button taps, login outcomes | `backend/firebase_analytics/analytics.dart:53,261,335-345`; `_evidence/analytics-events.md` |
| **Google Places** | The address being typed in "add address" | User opens the place picker | `flutter_flow/flutter_flow_place_picker.dart` (only caller: `pages/create_address/…`) |
| **Firebase Cloud Messaging** | Push token | After notification permission | `custom_code/actions/register_f_c_m_token2.dart` |
| **Firebase Auth** (Google / Apple / email) | Sign-in identity | Login | `auth/firebase_auth/*` |
| Device (SharedPreferences) | `ff_MB` (membership number), `ff_timecached` | — | `app_state.dart` |

## Finding: email address sent to Google Analytics

Four **developer-added** Analytics events on the login page put the signed-in user's email in
an event parameter (`pages/login/login_widget.dart`):

| Event | Param | Value | Lines |
|---|---|---|---|
| `usernotregistered` | `Param 1` | `currentUserEmail` | 543, 549, 569 |
| `LoginExpiredUser` | `Email` | `currentUserEmail` | 711, 717, 737 |
| `InactiveMember` | `Email` | `currentUserEmail` | 913, 919, 939 |
| `NotMensaEmail` | `Email` | `currentUserEmail` | 1328, 1334, 1354 |

The wrapper also adds the Firebase UID (`user`) to each. Together these tie an **identifiable
email address** to a **membership status** (expired, inactive, not registered, not a Mensa email)
inside Google Analytics.

- **Why it matters:** Google's Analytics terms forbid sending personally identifiable
  information such as email addresses. Under LGPD it is a disclosure of personal data to an
  operator (Google) for analytics. That needs a legal basis and transparency, and it runs
  against the necessity principle (Art. 6 III), because the login-failure counts don't need the
  address itself.
- **Calibration:** the code path is clear. Whether and how often it fires depends on runtime login
  outcomes, and Google may drop or redact the parameter server-side. Not proven on the wire.
- **Easy fix:** drop the parameter, or log a non-identifying reason code instead.

## Analytics: the rest

- **All 490** `logFirebaseEvent` call sites in app code (the 491st is inside the wrapper itself) resolved to **260 event names**
  ([`_evidence/analytics-events.md`](_evidence/analytics-events.md)). Almost all are
  **FlutterFlow auto-instrumentation**: `screen_view` (39) and `<Widget>_<action>` tap events
  (`IconButton_navigate_back`, `Button_backend_call`, …). This gives a near-complete **clickstream
  per user UID**. That is a FlutterFlow default, not something the developers wrote by hand.
- No `setAnalyticsCollectionEnabled`, `setConsent`, `setUserId` or `setUserProperty` calls, and no
  ad-ID opt-out (see 02). The SDK defaults apply: collection is on, and the advertising ID is collected
  where available.

## Firestore user document

Schema `backend/schema/users_record.dart` (FlutterFlow `users` collection; the name is *inferred*):
`uid`, `email`, `display_name`, `photo_url`, `phone_number`, `birthdate`, `created_time`,
`updated_at`, `lastActive`, `MB`, `member_status`, `expiration_date`, `profile`, `fcm_token`,
`CertificateToken`, `AWalletAuthenticationToken`.

The client only **writes** `fcm_token`. Everything else is populated server-side and read by the
app. Two consequences:
- The user's own doc holds **access tokens** (certificate, wallet). Who else can read a `users`
  doc is decided by Firestore security rules, which are server-side and **not tested** (out of
  scope).
- The Firestore SDK caches documents on the device by default. Together with `allowBackup`
  defaulting to true (03), cached profile data and tokens may end up in device backups. *Inferred*
  from defaults.

## Not collected (reassuring negatives)

- **No device fingerprinting by app code.** `device_info_plus` is registered as an Android
  plugin, but its Dart API is **absent from the snapshot** (tree-shaken), so the app code never calls it.
- **No location access.** There is no location permission (02), and `latlong` comes only from
  Google Places for an address the user types.
- **No contacts, microphone, SMS, call log, installed-app list or clipboard collection** (no
  permissions, and no such plugins).
- **Firebase Storage** is linked in the Android shell but not used from Dart. Media uploads go to
  Mensa's API.
- **Little local storage:** only the membership number and a cache timestamp in SharedPreferences.
- **App Check** is activated at startup (`flutter_flow/firebase_app_check_util.dart:18`), which
  helps protect the Firebase backend from non-app clients.

## Open items
- Firestore security rules and server-side access control for the 44 API endpoints: not
  assessable statically. Testing them needs Mensa's authorization.
- How `certificado?MB=` is opened (see log, safeguard note).
- Runtime confirmation (MITM on a test device with one's own account) of the Analytics email
  parameter.
