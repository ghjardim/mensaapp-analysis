# 17 — Brazilian Law: LGPD (and ECA Digital) — Technical Reading

How the findings in 02-07 map onto Brazil's **LGPD** (Lei 13.709/2018), plus a note on the
**ECA Digital / "Lei Felca"** (Lei 15.211/2025). (Numbered 17 to match the reference repo.)

> **Not legal advice, and not a legal verdict.** Whether a practice infringes the law is decided by
> the **ANPD** and the courts, weighing Mensa Brasil's privacy policy, consent flows, legal bases
> and server-side behavior. None of that is in the APK. This report shows **where the app's
> behavior creates tension with specific provisions**, i.e. "where a regulator would look," not
> "proven violation."

**One-line answer:** Most of the app's processing is what a membership association plausibly
needs (Art. 7 V/IX). The clearest point of tension is **sending members' email addresses, with
their membership status, to Google Analytics**, which is hard to square with the **necessity**
and **purpose** principles. The rest are privacy-by-default gaps (Art. 46 §2) rather than
evident infringements.

## 1. Roles and data

- **Controller:** Mensa Brasil (decides purposes; operates `api.mensan.org.br` and the Firebase
  project `carteirinhasmensa`).
- **Operator(s) (Art. 5 VII, Art. 39):** Google, as Firebase (Auth, Firestore, FCM, Analytics, App
  Check) and Places/Fonts provider.
- **Personal data handled (04, 05):** name, CPF, birth date, gender, pronouns, profession, Facebook
  profile, addresses with coordinates, phones, emails, membership number/status/expiry, photo, push
  token, Firebase UID, in-app behavior (Analytics), and **CPF and contacts of legal
  representatives** (relevant to minor members).
- **Sensitive data (Art. 5 II):** none of the fields matches the Art. 5 II list (racial/ethnic
  origin, religion, political opinion, union membership, health, sex life, genetic, biometric). Gender
  and pronouns are personal data but not in that list. If the app processed IQ-test or health
  results, that would change; **no such field appears in the client** (04).

## 2. LGPD: where the app's behavior creates tension

| Provision | Technical finding | Tension |
|---|---|---|
| **Art. 6 I, III — purpose & necessity** | 4 login events send the **email address** to Google Analytics, tagged with membership status (`pages/login/login_widget.dart:543-1354`, 05) | **Strongest point.** Counting login outcomes doesn't need the address. Sending it to a third party for analytics goes beyond what the purpose requires |
| **Art. 6 III — necessity** | Auto-logged clickstream (~490 events) tied to the Firebase UID; ad-ID collection enabled in an ad-free app (02, 05) | Moderate. Usage analytics can have a legitimate-interest basis (Art. 7 IX, Art. 10), but ad-ID collection has no evident purpose here |
| **Art. 6 VI, Art. 9 — transparency** | Analytics, Places and Fonts calls to Google aren't visible to the user in-app. **No consent/opt-out code** (05) | Depends on the privacy policy, which is not part of this analysis. The app itself gives no in-context notice |
| **Art. 7 / Art. 10 — legal basis** | Registry data (CPF, address, contacts): plausibly membership contract / legitimate interest. Analytics: legitimate interest at best | Art. 10 requires legitimate interest to be balanced against the data subject's expectations. **A member wouldn't expect their email to go to Google Analytics** |
| **Art. 14 — children & adolescents** | The app collects **legal-representative** data (`/legal_representative/`, 04), which implies minor members. Minors' activity also flows into the same Analytics pipeline | Processing must be in the minor's **best interest**. For children under 12, specific parental consent is required (§1). Collecting guardian details is a positive sign. Sending minors' behavioral data and emails to Analytics deserves particular scrutiny |
| **Art. 33 — international transfer** | Firebase/Google services process data outside Brazil (Google's infrastructure) | Typically covered by Google's contractual clauses. The controller should document the basis (Art. 33 II / ANPD Res. 19/2024). Not decidable from the APK |
| **Art. 46 §2 — security / privacy by design** | Backups unrestricted (03); unused SDKs linked (06); fonts fetched at runtime (06) | Hygiene gaps, low weight individually. Privacy-by-default would close them (see 08) |
| **Art. 18 — data-subject rights** | No in-app delete-account or data-export flow found among the 40 routes / 44 endpoints (`_evidence/routes.md`, `_evidence/api-calls.md`). There are only per-item deletes (address/email/phone/representative). No `User.delete`/`deleteUser` call survives in the Dart snapshot (FlutterFlow's delete-account helper was tree-shaken, i.e. unused) | Rights can be exercised through other channels (e.g. email to the DPO). Not a violation by itself, but worth noting |
| **Art. 37 — records of processing** | — | Outside the APK |

**Reassuring for LGPD:** no hidden collection, no device fingerprinting, no location tracking, no
ad/data-broker SDKs, a minimal permission set, TLS-only traffic, and App Check. The registry fields are
consistent with running a membership association.

## 3. ECA Digital / "Lei Felca" (Lei 15.211/2025)

The law protects children and adolescents on digital products and services directed at them or
likely to be accessed by them. It was sanctioned 17 Sep 2025, with main duties in force after a
vacatio legis (reported as ~March 2026; per secondary sources cited in the reference repo; **verify
against the official text**).

- **Applicability is uncertain.** This is a membership-card and association app, not a social
  network, game or content platform. It does have group, event and volunteer features, and it
  clearly serves minor members (legal-representative records). Whether it falls within the law's
  scope is a legal question.
- **What the app shows:** a guardian-data mechanism (positive), **no profiling for advertising**
  (no ad SDKs; but ad-ID collection by the Analytics SDK is on by default, see 02), and no
  age-specific minimization path. Everyone gets the same Analytics pipeline.
- If in scope, the most relevant duties would be **no targeted advertising based on minors' data**
  (disabling ad-ID collection removes even the appearance of it) and **protection by design**,
  meaning minimized analytics for minors.

## 4. Bottom line

- **LGPD:** one **clear, easily fixed tension** (email + membership status sent to Google Analytics,
  against necessity/purpose), plus privacy-by-default gaps (ad-ID collection, clickstream with no
  opt-out, unrestricted backups). No evidence of covert or excessive collection on the device.
- **Decisive facts are outside the APK:** the privacy policy, the legal bases claimed, the DPO
  channel, and above all **server-side access control** for CPF, address and minors' guardian data
  (not tested; see 07).
- **ECA Digital:** applicability unclear. If it applies, disabling ad-ID collection and minimizing
  analytics for minors are the relevant, cheap steps.

## 5. Caveats

- Static analysis of **one APK (7.7.0)**. Behavior may differ by version or server configuration.
- Article mapping is a technical reading by a non-lawyer. Legal bases (Art. 7/10) and transfer
  mechanisms (Art. 33) depend on documents not reviewed here.
- ECA Digital dates and scope come from secondary sources (see the reference repo's
  `tiktok_analysis/docs/17-brazilian-law-compliance.md` sources). Verify against Planalto/ANPD.
- Three analysis steps were stopped by the AI assistant's safety classifier and remain open
  ([`_notes/investigation-log.md`](_notes/investigation-log.md)). They could affect the Art. 46
  (security) reading.
