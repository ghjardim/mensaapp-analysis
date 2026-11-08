# 07 — Assessment

## Verdict

Based on static analysis of **Mensa Brasil 7.7.0**, this is **a conventional FlutterFlow +
Firebase membership app with a small, Google-only third-party footprint. It does not show
covert or out-of-bounds collection.** Its privacy problems are **configuration and hygiene
issues**, mostly inherited from FlutterFlow and Firebase defaults. One of them is a clear,
developer-introduced mistake: **sending users' email addresses to Google Analytics**.

Static analysis shows what the code *can* do. It does not show what happens on the wire or on the
server. Every finding below is "capability present" unless stated otherwise.

## Findings, ranked

| # | Finding | Severity | Origin | Report |
|---|---|---|---|---|
| 1 | **Email address sent to Google Analytics** as an event parameter in 4 login events, tied to membership status (expired / inactive / not registered / non-Mensa email) and the Firebase UID | **Medium** | Developer-added events | 05 |
| 2 | **Full clickstream to Google Analytics**: ~490 auto-generated screen/tap events, each tagged with the user's Firebase UID. No consent or opt-out code | Low-Medium | FlutterFlow default | 05 |
| 3 | **Ad-ID / attribution permissions and collection in an ad-free app** (`AD_ID`, `ACCESS_ADSERVICES_*`, install referrer). No opt-out meta-data | Low | Firebase Analytics default | 02 |
| 4 | **Backups not restricted**: `allowBackup` defaults to true, with no extraction rules. The Firestore cache (profile, certificate/wallet tokens) may be included in device backups | Low | Android default | 03, 05 |
| 5 | **Google Fonts downloaded at runtime** from `fonts.gstatic.com` (IP/User-Agent to Google) | Low | `google_fonts` default | 06 |
| 6 | **Unused plugins linked** (`sign_in_with_apple`, `device_info_plus`, `firebase_storage`, App Check SafetyNet/Debug registrars) | Info | Build hygiene | 06 |
| 7 | **No certificate pinning** (system trust store only) | Info | Common practice | 04 |

## What it does NOT do (reassuring negatives)

- **No out-of-bounds device access.** No location, contacts, microphone, SMS, call log, phone
  state, installed-app list or clipboard access. Runtime permissions are camera, legacy storage
  (capped at API 32) and notifications only (02).
- **No device fingerprinting in app code.** `device_info_plus` is not in the Dart snapshot (05).
- **No ad networks, attribution vendors, crash/APM vendors, session replay or Meta SDK** (06).
- **No unattributable hosts.** First-party code talks to Mensa's own domains, Google services,
  and links out to WhatsApp and imgur (04).
- **A minimal exported surface.** No exported content providers, and exported receivers/services are
  permission-guarded (03).
- **Cleartext HTTP blocked**, Firebase **App Check** active, short-lived Firebase ID tokens on
  every API call, no hard-coded API secrets in endpoint code (03, 04, 05).
- **Minimal local storage:** only the membership number and a cache timestamp (05).

## Context: the data at stake

The app is the gateway to a **registry of identifiable personal data**: CPF, birth date, gender,
home address with coordinates, phones, emails, profession, Facebook profile, and the **CPF and
contacts of legal representatives of minor members** (04). None of this is unusual for a
membership association. It does mean the parts that **cannot be assessed statically** carry
most of the real risk:

- **Server-side authorization** for the 44 REST endpoints, including admin endpoints shipped in
  every member's app.
- **Firestore security rules** for the `users` collection, which holds certificate and Wallet tokens.
- What the backend logs, retains or shares.

These were **deliberately not tested**. Doing so would mean sending requests to Mensa's
infrastructure, which needs the operator's authorization.

## Blind spots

- **Runtime behavior.** Whether the email-bearing events actually fire, and what Google keeps, was not
  observed. A MITM on a test device with one's own account would confirm finding 1.
- **blutter output is disassembly, not source.** HTTP methods were *inferred* from call names, and the
  Firestore collection name from FlutterFlow conventions (see log).
- **Three steps stopped by the AI assistant's safety classifier** and left for manual review
  ([`_notes/investigation-log.md`](_notes/investigation-log.md)):
  1. enum names for the HTTP methods;
  2. how the `app-api.mensa.org.br/certificado?MB=` link is built and opened;
  3. how pages treat route parameters supplied through the `carteirinhasmensa://` deep link
     (route inventory: [`_evidence/routes.md`](_evidence/routes.md)).
- **Server-pushed configuration** (Firebase Remote Config is not used, but backend responses drive the UI).

## Bottom line

Compared with the reference TikTok analysis (surveillance-grade collection, dozens of SDKs,
encrypted native telemetry), this app is **small, legible and mostly default-configured**. The
fixes are cheap: remove the email parameter from the four Analytics events, disable ad-ID
collection, add backup rules, bundle the fonts and drop unused plugins. See 08 (mitigation, pending).
