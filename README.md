# Mensa Brasil (Android) — Privacy and data-flow analysis

Static analysis of the **Mensa Brasil** app, following the methodology of
<https://github.com/akitaonrails/tiktok_analysis> (guide: `docs/11-diy-reproduce-guide.md` in that repo), pinned at commit
`066e0cdcc56b127ed557e02b63853a4a140061e0` (2026-11-04). Local clone in `tiktok_analysis/` (git-ignored).

| | |
|---|---|
| Package | `com.mensabrasil.app` |
| Version | 7.7.0 (versionCode 141), minSdk 23 / targetSdk 35 |
| APK source | `adb pull` from the phone (moto g14), 2026-11-08 |
| Integrity | `docs/_evidence/apk-integrity.txt` (SHA-256 + certificate) |

## Status: PARTIAL (in progress)

Done:
- [x] Step 1 — APKs obtained via adb (`apk_mensabrasil/`: base + 4 splits)
- [x] Step 2 — jadx 1.5.1 (`scripts/00-setup-jadx.sh`)
- [x] Step 4 — decompiled `base.apk` into `decompiled/` (5,733 classes, 10 with errors; used `--deobf`)
- [x] [02 — Permissions](docs/02-permissions.md): small set; no location/contacts/mic/phone; Firebase-injected ad-ID/attribution permissions with no opt-out
- [x] [03 — Manifest components](docs/03-manifest-components.md): no exported providers; exported receivers guarded; `allowBackup` defaults to true; custom-scheme deep link
- [x] blutter decode of `libapp.so` (Dart 3.8.1; `tools/blutter` @ `4a60ac6`, output in git-ignored `_work/blutter/`)
- [x] [04 — Network map](docs/04-network-endpoints.md): one first-party API (`api.mensan.org.br`, 44 endpoints, Firebase ID token auth); no pinning; CPF/address+latlong/legal-rep data flows

Working notes (incl. steps stopped by the AI assistant's safety classifier): [`docs/_notes/investigation-log.md`](docs/_notes/investigation-log.md).
**This analysis is static only. No request is ever sent to Mensa's API or Firebase project.**

**Key methodology difference from the reference:** this is a **Flutter** app. The Java tree is only
the Android shell (Firebase, plugins). All first-party logic is Dart AOT in
`lib/arm64-v8a/libapp.so` (Dart snapshot `830f4f59e7969c70b595182826435c19`). jadx can't read it.
It needs a Dart snapshot tool (e.g. blutter) or string/xref analysis of `libapp.so`.

Pending: 01 overview, 05 data collection (Firestore collections, Places autocomplete, Analytics events,
`device_info_plus`), 06 third-party SDKs, deep-link route handling, assessment,
mitigation, LGPD. Reports go in `docs/NN-*.md`, evidence in `docs/_evidence/`.

## Initial observations (not yet verified)
- Dependencies seen in `decompiled/resources/`: Firebase (Auth, Analytics, Messaging), Play Integrity,
  reCAPTCHA, Google Pay. This is capability present, not proven behavior.

## Reproduce
```sh
scripts/00-setup-jadx.sh      # downloads jadx into tools/jadx (not versioned)
scripts/01-pull-apk.sh        # phone connected with USB debugging enabled
scripts/02-decompile.sh
```
Analysis rules: cite `file:line`; separate app code from SDKs; "capability present" ≠ "proven behavior".

> Technical research for educational purposes; not legal advice nor an accusation.
