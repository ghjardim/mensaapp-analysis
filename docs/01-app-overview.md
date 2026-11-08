# 01 — App Overview

| | |
|---|---|
| App | **Mensa Brasil**, the official membership app of Mensa Brasil (membership card, profile, groups, events, volunteer program) |
| Package | `com.mensabrasil.app` |
| Version | 7.7.0 (versionCode 141), minSdk 23, targetSdk 35 |
| Source | Pulled with `adb` from a moto g14, 2026-11-08 (Play Store install; `com.android.stamp.source=https://play.google.com/store`, AndroidManifest.xml:372-377) |
| Integrity | SHA-256 + signer certificate in [`_evidence/apk-integrity.txt`](_evidence/apk-integrity.txt) |
| Bundle | `base.apk` (11.7 MB) + `split_config.arm64_v8a.apk` (28.4 MB) + `es`, `pt`, `xxhdpi` splits |

## Architecture

```
┌──────────────────────────── Android shell (Java/Kotlin, base.apk, 3 dex, ~5.7k classes) ─┐
│ MainActivity (empty Flutter host)  ·  Flutter plugins  ·  Firebase / Play services SDKs   │
└───────────────────────────────────────────────┬──────────────────────────────────────────┘
                                                │ platform channels
┌──────────────────────── Dart AOT snapshot (libapp.so, 17 MB, split_config.arm64_v8a) ────┐
│ carteirinhas_mensa (126 files, FlutterFlow-generated): 40 routes, 44 REST calls,          │
│ Firestore `users` doc, Analytics wrapper  ·  + ~99 Dart packages                          │
└──────────────────────────────────────────────────────────────────────────────────────────┘
  libflutter.so (11 MB, engine)   libdatastore_shared_counter.so (7 KB, AndroidX)
```

- **Built with FlutterFlow** (low-code Flutter builder): the `flutter_flow/` folder, `FFRoute`,
  `FFAppState`, `logFirebaseEvent`, auto-named analytics events. A lot of the behavior described
  in reports 05-06 comes from **FlutterFlow defaults**, not hand-written code.
- **Dart 3.8.1** (snapshot `830f4f59e7969c70b595182826435c19`, product build, arm64, compressed
  pointers).
- **Backends:** a first-party REST API at `api.mensan.org.br` (FastAPI-style operation names,
  *inferred*) plus the Firebase project `carteirinhasmensa` (Auth, Firestore, FCM, Analytics, App Check).

## Features (from routes and pages)

| Area | Pages |
|---|---|
| Membership card | `Carteirinha` (digital card, Google Wallet pass, certificate link), `ManualAssociado` (bundled member-manual PDF) |
| Profile | `Perfil`, `editProfile`, emails, phones, addresses (Google Places), legal representative, `setMissingFields` (CPF, birth date) |
| Groups | `MainGroups`, `JoinGroups`, `MyGroups`, `PendingGroups`, `FailedGroups`, `Authorization` |
| Events | Event list, details, plus admin create/update/tag management |
| Volunteer program | Activity submission, points, leaderboard, plus admin evaluation and category management |

Full route list: [`_evidence/routes.md`](_evidence/routes.md). API list: [`_evidence/api-calls.md`](_evidence/api-calls.md).

## Analysis approach and limits

- **Static only.** No traffic was captured, and **no request was ever sent to Mensa's API or the
  Firebase project**. Server-side behavior (access control, Firestore rules, what the backend
  stores or shares) is out of scope.
- Methodology follows [akitaonrails/tiktok_analysis](https://github.com/akitaonrails/tiktok_analysis)
  @ `066e0cd`. It was adapted for Flutter: jadx for the Android shell, **blutter** (`4a60ac6`) to recover
  Dart names, strings and call targets from `libapp.so`.
- blutter output is annotated disassembly, not source. Claims cite the blutter file and line
  (`_work/blutter/asm/…`, git-ignored, reproducible with `scripts/` + `tools/blutter`). Where a
  value was not read directly from code, it is marked *inferred*.
- **Three analysis steps were stopped by the AI assistant's safety classifier** and were not
  retried. They are recorded, with what remains to be checked manually, in
  [`_notes/investigation-log.md`](_notes/investigation-log.md).
