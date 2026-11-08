# 06 — Third-Party SDKs

Inventory of bundled third-party code, from two layers:
- **Dart** (the app logic). Packages whose code survived AOT tree-shaking, as recovered by
  blutter (`_work/blutter/asm/<package>/`). Unused packages leave no code, so this list reflects what
  can actually run.
- **Android** (the shell). Library versions from `decompiled/resources/*.properties` and
  `META-INF/*.version`, plus plugin registration in
  `decompiled/sources/io/flutter/plugins/GeneratedPluginRegistrant.java`.

Static only. Notes: [`_notes/investigation-log.md`](_notes/investigation-log.md).

## SDKs that talk to third parties

| SDK | Operator | Talks to / does | Used by app code? | Privacy weight |
|---|---|---|---|---|
| Firebase Analytics (`firebase_analytics`; `play-services-measurement` 22.4.0) | Google | Event stream, GAID where available, install referrer | **Yes**, 490 call sites (05) | **High**: clickstream tagged with UID; email in 4 events |
| Firebase Auth 23.2.0 + `google_sign_in` (`play-services-auth` 21.0.0) + reCAPTCHA 18.6.1 | Google | Sign-in, ID tokens, bot checks | Yes (`auth/firebase_auth/*`) | Expected for login |
| Cloud Firestore | Google | `users` document | Yes (05) | Holds profile and tokens. Rules are server-side |
| Firebase Cloud Messaging | Google | Push token, notifications | Yes | Low |
| Firebase App Check + Play Integrity 1.3.0 (SafetyNet 18.0.0 linked) | Google | Device/app attestation for Firebase calls | Yes, `activate()` at startup | Sends integrity verdicts. Protects the backend |
| Google Places (`google_maps_webservice`, `flutter_flow_place_picker`, `google_api_headers`) | Google | Typed address → place details + coordinates | Yes, add-address page only | Medium, user-initiated |
| **Google Fonts** (`google_fonts`) | Google | Downloads **Outfit** and **Roboto** from `fonts.gstatic.com` at runtime | Yes, the app theme | Low: exposes IP/User-Agent to Google on first launch. Avoidable by bundling the fonts |
| Google Wallet (`add_to_google_wallet`; `play-services-pay` 16.5.0) | Google | Saves the membership card as a Wallet pass | Yes (`custom_code/widgets/google_wallet_button.dart`) | User-initiated |
| `url_launcher` | — | Opens links (mensa.org.br, WhatsApp, certificate) | Yes | — |
| `cached_network_image` | — | Loads remote images (profile photo, imgur) | Yes | Low |

**Every external SDK is Google/Firebase.** There is **no** ad network, attribution vendor
(AppsFlyer, Adjust, Branch), crash/APM vendor (Crashlytics, Sentry), session replay, social SDK
(Facebook/Meta SDK) or data broker. The app links to WhatsApp but bundles no Meta SDK.

## Local-only libraries (no network of their own)

`pdfx` (PDF viewer), `image_picker`, `file_picker` (+ **Apache Tika** for MIME detection, see below),
`video_player_android`, `shared_preferences`, `sqflite` (via `flutter_cache_manager`), `path_provider`,
`go_router`, `provider`, `rxdart`, `intl`, `flutter_svg`, `font_awesome_flutter`, `flutter_animate`,
`photo_view`, `timeago`, `uuid`, `crypto`, `xml`, `json_path` and other UI and utility packages (full list:
`ls _work/blutter/asm`).

### Note: Apache Tika
An Android app carrying Apache Tika (`decompiled/sources/org/apache/tika/`) looks odd. It comes
from the **`file_picker` plugin**, which uses `new Tika().detect(bytes)` to guess the MIME type of a
picked file (`decompiled/sources/p315p4/C6139f.java:34-38,545-554`). It runs locally. The
`pipes-fork-server-default-log4j2.xml` resource is unused Tika baggage. Some other classes appear to
import Tika only because R8 shares constants between classes. Not a privacy concern. It does add
size and dependency surface.

## Linked but not used by app code

| Component | Evidence |
|---|---|
| `sign_in_with_apple` | Android plugin registered, **no Dart code in the snapshot** |
| `device_info_plus` | Android plugin registered, **no Dart code in the snapshot** (05) |
| `firebase_storage` | Android SDK + registrar in the manifest, **no Dart references** |
| SafetyNet / App Check Debug registrars | Registered by the plugin. Activation is the plugin default (03) |
| `play-services-ads-identifier` 18.0.0 | Pulled in by Analytics. Ad ID read by the SDK, not by app code |

Linked-but-unused native code is **inert** unless something calls it. The Dart side cannot call it,
because the code is not in the snapshot.

## Assessment
- A **small, single-vendor SDK footprint**. Everything third-party is Google. That is typical
  for a FlutterFlow + Firebase app, and much smaller than commercial apps. (The reference TikTok
  analysis found Adjust, AppsFlyer, Facebook, ThreatMetrix and more.)
- Privacy weight is concentrated in **Firebase Analytics**. That comes from how it is used
  (auto-clickstream, UID, email parameters; see 05), not from the SDK being unusual.
- Low-cost hardening: bundle the Google Fonts and disable runtime fetching; turn off ad-ID
  collection and remove the ad/attribution permissions (02); remove unused plugins
  (`sign_in_with_apple`, `device_info_plus`, `firebase_storage`, `file_picker` if unused).
