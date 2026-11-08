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

## Status: COMPLETE (static analysis; items left for manual review in the log)

Done:
- [x] Step 1 — APKs obtained via adb (`apk_mensabrasil/`: base + 4 splits)
- [x] Step 2 — jadx 1.5.1 (`scripts/00-setup-jadx.sh`)
- [x] Step 4 — decompiled `base.apk` into `decompiled/` (5,733 classes, 10 with errors; used `--deobf`)
- [x] [01 — App overview](docs/01-app-overview.md): FlutterFlow + Firebase app; Dart 3.8.1 AOT; features, architecture, limits
- [x] [02 — Permissions](docs/02-permissions.md): small set; no location/contacts/mic/phone; Firebase-injected ad-ID/attribution permissions with no opt-out
- [x] [03 — Manifest components](docs/03-manifest-components.md): no exported providers; exported receivers guarded; `allowBackup` defaults to true; custom-scheme deep link
- [x] blutter decode of `libapp.so` (Dart 3.8.1; `tools/blutter` @ `4a60ac6`, output in git-ignored `_work/blutter/`)
- [x] [04 — Network map](docs/04-network-endpoints.md): one first-party API (`api.mensan.org.br`, 44 endpoints, Firebase ID token auth); no pinning; CPF/address+latlong/legal-rep data flows
- [x] [05 — Data collection](docs/05-data-collection.md): **email sent to Google Analytics** in 4 login events; FlutterFlow clickstream tagged with UID; no device fingerprinting/location/contacts
- [x] [06 — Third-party SDKs](docs/06-third-party-sdks.md): Google/Firebase only (no ad, attribution or crash vendors); runtime Google Fonts; Tika via `file_picker`; several plugins linked but unused
- [x] Route inventory ([`_evidence/routes.md`](docs/_evidence/routes.md)): 40 routes, 38 require auth; deep-link parameter handling left for manual review
- [x] [07 — Assessment](docs/07-assessment.md): no covert/out-of-bounds collection; ranked findings (top: email sent to Google Analytics); server side untested by design
- [x] [08 — Mitigation](docs/08-mitigation-options.md): ranked developer fixes (mostly config one-liners) + user-side steps (ad-ID reset, DNS-block Analytics)
- [x] [09 — LGPD / ECA Digital](docs/09-brazilian-law-compliance.md): main tension = email + membership status to Google Analytics (Art. 6 I/III, Art. 10); minors' data (Art. 14); no in-app account deletion

Working notes (incl. steps stopped by the AI assistant's safety classifier): [`docs/_notes/investigation-log.md`](docs/_notes/investigation-log.md).
**This analysis is static only. No request is ever sent to Mensa's API or Firebase project.**

**Key methodology difference from the reference:** this is a **Flutter** app. The Java tree is only
the Android shell (Firebase, plugins). All first-party logic is Dart AOT in
`lib/arm64-v8a/libapp.so` (Dart snapshot `830f4f59e7969c70b595182826435c19`). jadx can't read it.
It needs a Dart snapshot tool (e.g. blutter) or string/xref analysis of `libapp.so`.

Reports go in `docs/NN-*.md`, evidence in `docs/_evidence/`.

## Reproduce
```sh
scripts/00-setup-jadx.sh      # downloads jadx into tools/jadx (not versioned)
scripts/01-pull-apk.sh        # phone connected with USB debugging enabled
scripts/02-decompile.sh
# Dart side (needs: sudo apt install ninja-build libcapstone-dev libicu-dev)
git clone https://github.com/worawit/blutter.git tools/blutter   # pinned: 4a60ac6
python3 -m venv tools/venv && tools/venv/bin/pip install pyelftools requests
unzip -o apk_mensabrasil/split_config.arm64_v8a.apk 'lib/*' -d _work/so/
tools/venv/bin/python tools/blutter/blutter.py _work/so/lib/arm64-v8a _work/blutter
# Evidence tables (static, local files only)
python3 -I scripts/10-extract-api-calls.py _work/blutter/asm/carteirinhas_mensa/backend/api_requests/api_calls.dart > docs/_evidence/api-calls.md
python3 -I scripts/11-extract-analytics-events.py _work/blutter/asm/carteirinhas_mensa > docs/_evidence/analytics-events.md
python3 -I scripts/12-extract-routes.py _work/blutter/asm/carteirinhas_mensa/flutter_flow/nav/nav.dart > docs/_evidence/routes.md
```
Analysis rules: cite `file:line`; separate app code from SDKs; "capability present" ≠ "proven behavior".

> Technical research for educational purposes; not legal advice nor an accusation.
