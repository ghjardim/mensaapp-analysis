# Mensa Brasil (Android) — Privacy and data-flow analysis

Static analysis of the **Mensa Brasil** app, following the methodology of
<https://github.com/akitaonrails/tiktok_analysis> (guide: `docs/11-diy-reproduce-guide.md` in that repo).

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

Pending (in the guide's order): manifest/permissions/components, host and endpoint map, strings from
`.dex`/`.so`, privacy sink search, third-party SDKs, native libs (`split_config.arm64_v8a`),
assessment, mitigation, LGPD. Reports will go in `docs/NN-*.md`, evidence in `docs/_evidence/`.

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
