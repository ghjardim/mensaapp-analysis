# 03 — Manifest Components, Exported Surfaces & App Configuration

Source: `decompiled/resources/AndroidManifest.xml`. Counts were computed by parsing the manifest
(`<application>` children):

| Type | Total | Exported | Exported without a permission guard |
|---|---|---|---|
| activity | 8 | 3 | 3 |
| service | 11 | 1 | 0 |
| receiver | 5 | 3 | 0 |
| provider | 4 | 0 | 0 |

For comparison, the reference TikTok analysis counted 494 activities and 8 exported providers. This is
a small, framework-generated surface.

## First-party vs. SDK code

The only first-party Java is `com/mensabrasil/app/MainActivity.java`, which is an empty subclass
of the Flutter host activity, plus `R.java`. **All app logic is Dart, AOT-compiled into
`lib/arm64-v8a/libapp.so`** (Dart snapshot hash `830f4f59e7969c70b595182826435c19`, product
build, arm64, compressed pointers). Every other component in the manifest belongs to Flutter
plugins, Firebase or AndroidX.

Registered Flutter plugins (`decompiled/sources/io/flutter/plugins/GeneratedPluginRegistrant.java:38-143`):

| Area | Plugins |
|---|---|
| Firebase | `firebase_core`, `firebase_auth`, `cloud_firestore`, `firebase_storage`, `firebase_messaging`, `firebase_analytics`, `firebase_app_check` |
| Sign-in | `google_sign_in_android`, `sign_in_with_apple`, `google_api_headers` |
| Device / app info | `device_info_plus`, `package_info_plus` |
| Files / media | `image_picker_android`, `file_picker`, `pdfx`, `video_player_android`, `path_provider_android` |
| Storage | `shared_preferences_android`, `sqflite` |
| Other | `url_launcher_android`, `add_to_google_wallet`, `flutter_plugin_android_lifecycle` |

No ad, attribution (AppsFlyer/Adjust), crash-reporting (Crashlytics/Sentry) or session-replay SDK is
registered. `device_info_plus` gives the Dart side access to device model, OS and hardware details.
Whether and where that data is sent is a question for the `libapp.so` analysis.

## Exported components

| Component | Line | Guard | Assessment |
|---|---|---|---|
| `com.mensabrasil.app.MainActivity` | 48-77 | none (launcher) | Required. Also handles the deep link `carteirinhasmensa://carteirinhasmensa.com` (lines 69-76) with `flutter_deeplinking_enabled=true` (66-68). See note below |
| `com.google.firebase.auth.internal.GenericIdpActivity` | 209-224 | none | Standard Firebase Auth OAuth redirect (`genericidp://firebase.auth/`) |
| `com.google.firebase.auth.internal.RecaptchaActivity` | 225-240 | none | Standard Firebase Auth reCAPTCHA redirect (`recaptcha://firebase.auth/`) |
| `…signin.RevocationBoundService` | 261-265 | `REVOCATION_NOTIFICATION` | Google Sign-In, guarded |
| `…messaging.FlutterFirebaseMessagingReceiver` | 196-203 | `c2dm.permission.SEND` | FCM, guarded (only Play services can send) |
| `com.google.firebase.iid.FirebaseInstanceIdReceiver` | 266-276 | `c2dm.permission.SEND` | FCM, guarded |
| `androidx.profileinstaller.ProfileInstallReceiver` | 331-349 | `android.permission.DUMP` | AndroidX baseline profiles, guarded (adb/shell only) |

**No `ContentProvider` is exported.** The four providers (image picker `FileProvider`, Firebase
init, FCM init, AndroidX startup) are all `exported="false"`. The `FileProvider` only shares the
cache dir (`res/xml/flutter_image_picker_file_paths.xml`) via `grantUriPermissions`.

### Deep link note
The custom-scheme deep link sets `android:autoVerify="true"` (line 69), but App Links verification
only applies to `http`/`https`. For `carteirinhasmensa://` it does nothing. **Any app or web page
can fire this link** and it will route into the Flutter router. That is normal for custom schemes and
not a vulnerability by itself. The open question is what routes the Dart code accepts from it (for
example whether a link can trigger an action or open an arbitrary URL in the in-app
`WebViewActivity`, line 181-184). That is pending the `libapp.so` analysis.

## App-level configuration (`<application>`, lines 42-47)

| Setting | Value | Assessment |
|---|---|---|
| `allowBackup` | **not set → defaults to `true`** | App data (`shared_preferences`, `sqflite` DB, Firestore offline cache, Firebase Auth session) is eligible for Android cloud backup. No `dataExtractionRules`/`fullBackupContent` limit what is included. Low severity. It is a common default, but explicit backup rules are better practice for an app holding member data and auth sessions |
| `networkSecurityConfig` / `usesCleartextTraffic` | not set | With `targetSdkVersion=35`, **cleartext HTTP is blocked by default** and only system CAs are trusted. Reassuring |
| `extractNativeLibs` | `false` | Libraries are loaded straight from the APK. Normal |
| `requestLegacyExternalStorage` | `true` | No effect at target 35 (see 02) |

## Firebase project (from `res/values/strings.xml`)

| Key | Value | Line |
|---|---|---|
| `project_id` | `carteirinhasmensa` | 61 |
| `google_storage_bucket` | `carteirinhasmensa.appspot.com` | 58 |
| `google_app_id` | `1:10031360798:android:fc65181c596950e085370f` | 56 |
| `gcm_defaultSenderId` | `10031360798` | 54 |
| `default_web_client_id` | `10031360798-u2lasgkt…apps.googleusercontent.com` | 48 |
| `google_api_key` | `AIzaSy…` (in file) | 55 |

Firebase API keys in Android apps are **public identifiers by design**. They are not secrets, and
including them is not a finding. Firebase data is protected by **Firestore/Storage security rules
and App Check**, which are server-side and **cannot be assessed statically**. Probing the
project's rules would mean actively testing Mensa's backend, which is **out of scope** for
this analysis without the operator's authorization.

App Check is wired with the Play Integrity, SafetyNet (deprecated) and **Debug** provider
registrars (`ComponentDiscoveryService` meta-data, lines 109-117). The plugin registers all three
unconditionally. Which provider is actually activated is decided in Dart. Capability present,
activation unknown.

## Minor
- `res/xml/image_share_filepaths.xml` (`files-path image_provider/`) is not referenced by any
  manifest provider. It is a leftover resource, probably from a removed share plugin.

## Summary
The Android shell is **minimal and conventionally configured**: no exported providers, all
exported receivers/services permission-guarded, cleartext blocked, a small permission set. The
substantive privacy questions (what Analytics events and user properties are sent, what
`device_info_plus` data leaves the device, what the backend APIs receive, deep-link route handling)
all live in the **Dart AOT snapshot** and need the next phase. A preliminary `strings` pass over
`libapp.so` shows first-party hosts `api.mensan.org.br` (27 references), `app-api.mensa.org.br`,
`mensa.org.br` and `wiki.mensa.org.br`, plus `maps.googleapis.com` and `api.whatsapp.com`. This
is unverified until the network-map report (04).
