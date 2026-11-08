# Mensa Brasil (Android): Privacy and Data-Flow Analysis

Static analysis of the **Mensa Brasil** membership app (`com.mensabrasil.app` 7.7.0), following the
methodology of [akitaonrails/tiktok_analysis](https://github.com/akitaonrails/tiktok_analysis)
(@ `066e0cd`, adapted for Flutter).

> **Static only.** Every finding comes from the APK's code. **No request was ever sent to Mensa's
> API or Firebase project**, and server-side controls were not tested. Not legal advice, and not an
> accusation.

## TL;DR

A conventional **FlutterFlow + Firebase** app with a **Google-only** third-party footprint and **no
covert or out-of-bounds collection**. Its privacy issues are mostly default settings. One is a clear,
easily fixed mistake: **the app sends users' email addresses to Google Analytics**, together with their
membership status.

## Is it spyware?

**No evidence of spyware.** Static analysis cannot prove a negative, but none of the usual signs
are in the code: no access beyond what the app needs, no device fingerprinting, no hidden
destinations, no ad/tracking/crash/session-recording SDKs, and almost no on-device storage (see
[What it does NOT do](#what-it-does-not-do)).

**There is questionable collection.** Most of it comes from defaults, with one real problem:

1. **Email to Google Analytics (the real problem).** 4 login events send the user's email, with
   membership status and user ID. This goes against Google's terms and is hard to justify under LGPD.
   It is clear in the code but not yet confirmed on the wire.
2. **Clickstream.** ~490 screen/tap events with the user ID, no consent or opt-out (FlutterFlow default).
3. **Advertising ID** collected in an app with no ads (Firebase default, not turned off).
4. **Minor:** fonts fetched from Google at runtime. Typed addresses go to Google Places.

**Unknown:** whether Mensa's server properly protects the sensitive data it receives (CPF, address
with coordinates, guardians' CPF for minor members). It cannot be judged from the app and was not
tested. Three code paths also await manual review ([Open items](#open-items-manual-review)).

## Privacy findings

| # | Finding | Severity | Report |
|---|---|---|---|
| 1 | **Email address sent to Google Analytics** in 4 login events (`usernotregistered`, `LoginExpiredUser`, `InactiveMember`, `NotMensaEmail`), tied to membership status and the Firebase UID | **Medium** | [05](docs/05-data-collection.md) |
| 2 | **Full clickstream to Google Analytics**: ~490 auto-generated screen/tap events, each tagged with the user's UID. No consent or opt-out | Low-Medium | [05](docs/05-data-collection.md) |
| 3 | **Ad-ID and attribution permissions and collection** in an app with no ads (`AD_ID`, AdServices, install referrer). No opt-out | Low | [02](docs/02-permissions.md) |
| 4 | **Backups not restricted** (`allowBackup` default). The Firestore cache (profile, certificate/Wallet tokens) may be included in device backups | Low | [03](docs/03-manifest-components.md) |
| 5 | **Google Fonts downloaded at runtime** from `fonts.gstatic.com` (exposes IP to Google) | Low | [06](docs/06-third-party-sdks.md) |
| 6 | **No in-app account deletion or data export** (LGPD Art. 18 rights go through other channels) | Info | [09](docs/09-brazilian-law-compliance.md) |
| 7 | Unused plugins linked (`sign_in_with_apple`, `device_info_plus`, `firebase_storage`); no certificate pinning | Info | [06](docs/06-third-party-sdks.md), [04](docs/04-network-endpoints.md) |

### What the app handles about you

| Data | Where it goes |
|---|---|
| CPF, birth date, gender, pronouns, profession, Facebook profile | Mensa API (`api.mensan.org.br`) |
| Home address + coordinates (`latlong`) | Mensa API. The typed address also goes to **Google Places** (autocomplete) |
| Phones, emails | Mensa API. **Email also goes to Google Analytics** (finding 1) |
| Legal representative's CPF, name, email, phones (minor members) | Mensa API |
| Membership number, status, expiry; certificate and Wallet tokens | Firestore `users` document (read by the app) |
| Every screen and tap, with your Firebase UID | Google Analytics |
| Push token | Firestore + Firebase Cloud Messaging |

### What it does NOT do

- **No location, contacts, microphone, SMS, call log, phone state or installed-app list.** Runtime
  permissions are camera, legacy storage and notifications only.
- **No device fingerprinting** in app code (`device_info_plus` is not in the Dart snapshot).
- **No ad networks, attribution vendors, crash reporters, session replay or Meta SDK.** Every SDK is
  Google/Firebase.
- **No unattributable hosts.** It talks to Mensa's domains and Google, and links out to WhatsApp and imgur.
- No exported content providers, HTTPS only, Firebase App Check active, and almost nothing stored
  locally.

### Not assessable statically (server side, not tested)

Who can read the CPF, address and minors' guardian data through the **44 API endpoints** (admin
endpoints included) and the **Firestore rules** for `users`. This is where most of the real risk sits.
Testing it requires Mensa's authorization.

## Reports

| # | Report | Summary |
|---|---|---|
| 01 | [App overview](docs/01-app-overview.md) | FlutterFlow + Firebase, Dart 3.8.1 AOT. Features, architecture, limits |
| 02 | [Permissions](docs/02-permissions.md) | 13 permissions (+1 internal). No location/contacts/mic/phone. SDK-injected ad permissions |
| 03 | [Manifest components](docs/03-manifest-components.md) | No exported providers. `allowBackup` default. Custom-scheme deep link |
| 04 | [Network map](docs/04-network-endpoints.md) | One first-party API, 44 endpoints, Firebase ID-token auth, no pinning |
| 05 | [Data collection](docs/05-data-collection.md) | Email to Analytics. UID-tagged clickstream. Firestore user doc. Places |
| 06 | [Third-party SDKs](docs/06-third-party-sdks.md) | Google/Firebase only. Runtime Google Fonts. Tika via `file_picker` |
| 07 | [Assessment](docs/07-assessment.md) | Verdict, ranked findings, negatives, blind spots |
| 08 | [Mitigation](docs/08-mitigation-options.md) | Developer fixes (mostly one-line config) + user-side steps |
| 09 | [LGPD / ECA Digital](docs/09-brazilian-law-compliance.md) | Main tension: email to Analytics (Art. 6 I/III, Art. 10). Minors (Art. 14) |

**Evidence** (generated, static): [`api-calls.md`](docs/_evidence/api-calls.md) ·
[`analytics-events.md`](docs/_evidence/analytics-events.md) · [`routes.md`](docs/_evidence/routes.md) ·
[`apk-integrity.txt`](docs/_evidence/apk-integrity.txt)
**Working notes:** [`_notes/investigation-log.md`](docs/_notes/investigation-log.md)

## Open items (manual review)

Three analysis steps were **stopped by the AI assistant's safety classifier** and not retried. They
are left for a human reviewer (details in the log):
1. The HTTP-method enum names (methods in 04 are *inferred* from call names).
2. How the `app-api.mensa.org.br/certificado?MB=` link is built and opened.
3. How pages validate route parameters arriving through the `carteirinhasmensa://` deep link
   (route inventory in [`routes.md`](docs/_evidence/routes.md)).

## Disclosure

A private report for Mensa Brasil's DPO (pt-BR) is in
[`docs/disclosure/`](docs/disclosure/2026-11-08-relatorio-privacidade-mensa.md). **Keep this repo
private until Mensa has had a chance to fix finding 1.** Note also that `apk_mensabrasil/` holds the
original APKs (Mensa's copyright). Remove them before any publication and keep only the hashes.

## Method

- **Flutter changes the approach.** The Java tree (jadx) is only the Android shell. All app logic is
  Dart AOT in `lib/arm64-v8a/libapp.so` (snapshot `830f4f59e7969c70b595182826435c19`), recovered with
  [blutter](https://github.com/worawit/blutter) @ `4a60ac6`.
- Rules: cite `file:line`; separate app code from SDKs; "capability present" ≠ "proven behavior";
  mark anything not read directly from code as *inferred*; never contact the backend.

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

| Path | Contents | In git |
|---|---|---|
| `apk_mensabrasil/` | Original APKs (base + 4 splits), pulled 2026-11-08 from a moto g14 | yes (remove before publishing) |
| `decompiled/` | jadx output of `base.apk` (5,733 classes, `--deobf`) | yes |
| `docs/` | Reports, evidence, notes, disclosure | yes |
| `scripts/` | Pull, decompile and extractor scripts | yes |
| `tools/`, `_work/`, `tiktok_analysis/` | jadx, blutter, venv, blutter output, reference clone | no (git-ignored) |
