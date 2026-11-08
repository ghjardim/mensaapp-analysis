# 08 — Mitigation Options

Builds on findings 02-07. Unlike the TikTok reference, where most collection is fused to the core
API and can't be removed, **almost everything worth fixing here is separable and cheap to
fix**. Most of it is a FlutterFlow or Firebase setting. The **developer** fixes matter far more than
anything a user can do.

Static-analysis caveat: these are configuration-level recommendations. Hostnames for Firebase
Analytics uploads come from Google's SDK documentation, not from traffic observed here.

## A. For Mensa Brasil's developers (ranked by privacy gain / effort)

| # | Fix | Addresses | How |
|---|---|---|---|
| 1 | **Stop sending email to Analytics** | Finding 1 (05) | In the 4 login-page actions (`usernotregistered`, `LoginExpiredUser`, `InactiveMember`, `NotMensaEmail`), remove the `Email` / `Param 1` parameter. Keep the event name, which is enough to count outcomes. If per-user follow-up is needed, use the backend's own logs, not Analytics. Consider asking Google to delete the already-collected data (Analytics data-deletion requests) |
| 2 | **Decide whether the clickstream is needed** | Finding 2 | FlutterFlow auto-logs page views and action events. Turn auto-logging off in the project's Firebase Analytics settings, or keep only `screen_view`. If kept, consider **not** attaching the UID (`user` param) to every event |
| 3 | **Turn off ad-ID collection and drop ad permissions** | Finding 3 (02) | `AndroidManifest.xml`: `<meta-data android:name="google_analytics_adid_collection_enabled" android:value="false"/>`, and remove `AD_ID`, `ACCESS_ADSERVICES_ATTRIBUTION`, `ACCESS_ADSERVICES_AD_ID` with `tools:node="remove"`. Optionally set `google_analytics_default_allow_ad_personalization_signals=false` |
| 4 | **Add consent / opt-out** | Findings 1-3 | Call `FirebaseAnalytics.setAnalyticsCollectionEnabled(false)` until the user agrees (or offer a settings toggle). Use `setConsent` for ad storage / ad user data = denied |
| 5 | **Restrict backups** | Finding 4 (03) | `android:allowBackup="false"`, or `dataExtractionRules` / `fullBackupContent` that exclude Firestore's cache and Firebase Auth state |
| 6 | **Bundle fonts** | Finding 5 (06) | Ship Outfit and Roboto as assets and set `GoogleFonts.config.allowRuntimeFetching = false` |
| 7 | **Remove unused plugins** | Finding 6 (06) | Drop `sign_in_with_apple` (Android), `device_info_plus`, `firebase_storage`, `file_picker` (if unused; it also removes Apache Tika). This shrinks the APK and the dependency surface |
| 8 | **Review server-side controls** | Context (07) | Not visible in the app: check API authorization for every endpoint (especially the admin routes shipped to all members), Firestore rules for `users` (which holds certificate and Wallet tokens), and logging/retention. This is the highest-value item that this analysis **could not** check |
| 9 | **Manual review of items the AI assistant left open** | Blind spots (07) | See [`_notes/investigation-log.md`](_notes/investigation-log.md): HTTP method enum names, the `certificado?MB=` link, and how pages validate route parameters arriving through the `carteirinhasmensa://` deep link |

Items 1, 3, 5 and 6 are each a few lines. Items 1-4 also directly support the LGPD reading in 17.

## B. For users (what you can do today)

| Action | Effect | Cost |
|---|---|---|
| **Delete or reset your Android advertising ID** (Settings → Privacy → Ads) | The Analytics SDK gets no usable GAID | None |
| **Block Firebase Analytics at DNS level** (e.g. Private DNS / NextDNS / Pi-hole blocking `app-measurement.com`) | Stops Analytics uploads, **including the email events and the clickstream**. Analytics uses its own hostnames, separate from Auth, Firestore and Mensa's API, so the app should keep working. *Inferred*: not tested here | Affects other apps that use Firebase Analytics too |
| **Deny the notification permission** if you don't want push | No FCM prompts. The token may still be registered | Lose event notices |
| Use the **Places search only if you want to**; you can type the address fields directly | Your typed address doesn't go to Google Places | Slightly more typing (if the form allows it) |
| Exclude the app from cloud backup (Settings → Google → Backup, where supported) | Cached profile data stays off backups | Restore after a phone change means logging in again |

**What users cannot change:** what the Mensa API and Firestore store about you (CPF, address,
legal representative) is the service itself. The rights to access, correct and delete it go through
Mensa Brasil as the data controller (LGPD Art. 18; see 17).

## What not to do

- **Don't repackage or modify the app.** It breaks Play Integrity / App Check (the backend would
  reject it), and it isn't needed. The DNS block covers the main issue.
- **Don't probe the API or Firebase project** to "check" the server side. Report concerns to
  Mensa Brasil or the ANPD instead.
