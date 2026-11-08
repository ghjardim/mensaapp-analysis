# 02 — Permission Analysis

Source: `decompiled/resources/AndroidManifest.xml` (merged manifest from `base.apk`, v7.7.0 / versionCode 141).
The app declares **13 `<uses-permission>` entries** plus one app-defined signature permission. That
is a small set. Each one is grouped and assessed below.

> Context: Mensa Brasil is a **Flutter** app (`flutterEmbedding=2`, AndroidManifest.xml:78-80;
> `libapp.so` + `libflutter.so` in `split_config.arm64_v8a.apk`). Permissions in the merged manifest
> come from both the app's own `AndroidManifest.xml` and the manifests of bundled plugins/SDKs.
> Where a permission is clearly SDK-injected, that is noted.

## Runtime ("dangerous") permissions

| Permission | Line | Likely source / feature | Verdict |
|---|---|---|---|
| `CAMERA` | 16 | `image_picker` plugin (take a photo, e.g. profile picture) | Expected. No QR/barcode-scanner plugin is registered (`io/flutter/plugins/GeneratedPluginRegistrant.java`), so camera use is most plausibly image capture only |
| `READ_EXTERNAL_STORAGE` (`maxSdkVersion=32`) | 17-19 | `image_picker` / `file_picker` on Android ≤ 12 | Expected; inert on Android 13+ |
| `WRITE_EXTERNAL_STORAGE` (`maxSdkVersion=32`) | 20-22 | Legacy file saving | Expected; inert on Android 13+ |
| `POST_NOTIFICATIONS` | 23 | Firebase Cloud Messaging push | Expected |

**Absent** (this is evidence too): no location (`ACCESS_FINE/COARSE_LOCATION`), no `READ_CONTACTS`,
no `RECORD_AUDIO`, no `READ_PHONE_STATE`, no SMS/call-log/calendar, no `GET_ACCOUNTS`, no
`READ_MEDIA_*` (Android 13+ media access goes through the system photo picker instead, see
`photopicker_activity:0:required`, line 177-179), no Bluetooth/Wi-Fi scanning, no
`QUERY_ALL_PACKAGES`, no `SYSTEM_ALERT_WINDOW`, no `ACCESS_MEDIA_LOCATION`.

## Normal / install-time permissions

| Permission | Line | Note |
|---|---|---|
| `INTERNET`, `ACCESS_NETWORK_STATE` | 15, 30 | Standard |
| `WAKE_LOCK` | 31 | Firebase Messaging / Analytics background work |
| `com.google.android.c2dm.permission.RECEIVE` | 32 | FCM push |
| `com.google.android.providers.gsf.permission.READ_GSERVICES` | 37 | Injected by Google Play services measurement (Analytics) |
| `com.mensabrasil.app.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | 38-41 | AndroidX-generated, `protectionLevel="signature"`. Protects runtime-registered receivers. Benign |

## Advertising / attribution

| Permission | Line | Note |
|---|---|---|
| `com.google.android.gms.permission.AD_ID` | 34 | Read the Google Advertising ID (GAID) |
| `ACCESS_ADSERVICES_ATTRIBUTION`, `ACCESS_ADSERVICES_AD_ID` | 35-36 | Android Privacy Sandbox attribution / ad ID |
| `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE` | 33 | Play Install Referrer (where the install came from) |

These four are **automatically merged in by the Firebase Analytics / `play-services-measurement`
SDK**. The app is a membership-card and association app with no ads (no ad SDK is registered among the
Flutter plugins). Shipping them is still a real choice: Google documents how to remove them
(`tools:node="remove"`) and how to disable ad-ID collection (meta-data
`google_analytics_adid_collection_enabled=false`). **Neither opt-out is present** in the manifest
(no such `<meta-data>` under `<application>`, lines 42-384).

→ **Capability present:** Firebase Analytics can read the GAID and install referrer. **Not yet
proven:** whether the Dart code enables Analytics collection, sets user properties or user IDs, or
changes consent defaults at runtime. That lives in `libapp.so` and is pending (see
"Next steps" in the README).

## What the permission set tells us

**Reassuring:**
- A minimal runtime-permission surface: camera, legacy storage, notifications. No location,
  contacts, microphone, telephony identifiers or app enumeration.
- The one `<queries>` entry (lines 24-29) is `GET_CONTENT` with `*/*`. That is the file picker,
  not a list of apps to detect.
- Storage permissions are capped at API 32.

**Worth noting:**
- **Ad/attribution permissions in an ad-free member app.** These are low-severity but
  avoidable. They are the default side effect of adding Firebase Analytics without opting out. For a
  service that holds members' personal data, turning off ad-ID collection is the expected privacy-by-default posture
  under LGPD Art. 6 (necessity principle). This is a technical observation, not a legal conclusion.
- `requestLegacyExternalStorage="true"` (line 47) has no effect on Android 11+ with
  `targetSdkVersion=35`. It is leftover configuration, not a risk.
