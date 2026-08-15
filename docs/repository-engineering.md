# Repository Engineering Contract

This is the durable, canonical record of repository-operating decisions and their evidence. It records decisions; it does not configure or implement them. Complete it during adoption and update it when an accepted decision changes.

## How to use this contract

1. Replace each unresolved placeholder with a decision, an explicit decline or deferral, or `N/A` where the decision is inapplicable.
2. Assign an owner, explain the rationale, and link or describe the evidence for every applicable row.
3. Keep the status current. `N/A` is a completed applicability decision, not unresolved work.

| Area | Decision | Choice | Owner | Rationale | Evidence | Status |
|---|---|---|---|---|---|---|
| Repository identity | Repository name and purpose | `<UNRESOLVED_IDENTITY_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Ownership | Maintainers and decision authority | `<UNRESOLVED_OWNERSHIP_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Escalation | Support and security escalation path | `<UNRESOLVED_ESCALATION_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Change governance | Branch, merge, commit, review, and traceability approach | `<UNRESOLVED_CHANGE_GOVERNANCE_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Dependencies | Update ownership, review cadence, security response, and compatibility evidence | `<UNRESOLVED_DEPENDENCY_POLICY>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Hooks | Choose, decline, or defer a local change-check mechanism | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Testing | Choose, decline, or defer testing expectations and evidence | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| CI | Choose, decline, or defer automated validation and exception handling | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Dependency automation | Choose, decline, or defer dependency-update automation | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Releases | Choose, decline, or defer versioning, approval, notes, rollback, and publication decisions | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| AI review | Choose, decline, or defer optional AI-assisted review | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<NON_AI_FALLBACK_IF_CHOSEN_OR_RATIONALE_IF_DECLINED_OR_DEFERRED>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Public readiness | Publication readiness, residual-risk acknowledgement, and private-channel readiness | `<UNRESOLVED_PUBLIC_READINESS_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |

## Quality evidence

Add one row for every quality category the adopter declares applicable. Each row must contain exactly one canonical command, one documented procedure, or `N/A`; do not record more than one method in the same row. If `N/A` is selected, state why the category is inapplicable and retain the owner, rationale, evidence, and status.

| Area | Decision | Choice | Owner | Rationale | Evidence | Status |
|---|---|---|---|---|---|---|
| Quality evidence | `<QUALITY_CATEGORY>` | `<ONE_COMMAND_OR_ONE_DOCUMENTED_PROCEDURE_OR_N_A>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE_OR_N_A_REASON>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |

## OpenSpec lifecycle

| Area | Decision | Choice | Owner | Rationale | Evidence | Status |
|---|---|---|---|---|---|---|
| OpenSpec lifecycle | Enduring accepted specifications | `openspec/specs/` is the source of truth | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| OpenSpec lifecycle | Active phase-scoped work | `openspec/changes/` contains active changes | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| OpenSpec lifecycle | Completed change history | `openspec/changes/archive/` is immutable audit history and is not active editable work | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |

## Stack-template extension

Stack templates inherit this contract. Resolve inherited decision values and append only stack-specific decision rows when needed; do not copy baseline policy sections or matrix rows.

## Android template evidence

These rows extend the universal contract; they do not select an adopter's product, provider, account, or release policy.

| Area | Decision | Choice | Owner | Rationale | Evidence | Status |
|---|---|---|---|---|---|---|
| Android tooling | Compatible tuple | AGP 9.1.0; Gradle 9.3.1; JDK 17; Kotlin and Compose compiler plugin 2.4.10; BOM 2026.06.00; compileSdk/targetSdk 36; minSdk 23 | `<UNRESOLVED_OWNER>` | Built-in Kotlin is intentional: do not add `org.jetbrains.kotlin.android` by default; the Compose plugin matches Kotlin. Use a legacy plugin only with future official justification. Keep the tuple compatible rather than chasing latest. | Kotlin: https://kotlinlang.org/docs/gradle-configure-project.html; AGP: https://developer.android.com/build/releases/gradle-plugin#9-1-0; Compose: https://kotlinlang.org/docs/compose-compiler-migration-guide.html; BOM: https://developer.android.com/develop/ui/compose/bom/bom-mapping | Accepted template baseline |
| Android environment | Compatible IDE reference | Quail 2 | `<UNRESOLVED_OWNER>` | Verified compatibility reference only; it is not a dependency or project pin. | https://developer.android.com/studio/releases#quail-2-0 | Accepted template baseline |
| Android quality | Source-of-truth commands | `assembleDebug`; `lint`; `testDebugUnitTest`; separate `connectedDebugAndroidTest` | `<UNRESOLVED_OWNER>` | JVM unit tests do not need a device; instrumented tests do. No arbitrary coverage threshold. Android Lint, compiler, and unit validation are the minimum coherent v1 stack. | Run each command; record unavailable device/emulator prerequisites separately. | Accepted template baseline |
| Android static tooling | Formatter/static-analysis policy | No ktlint, Spotless, Detekt, or Kover in v1 | `<UNRESOLVED_OWNER>` | Avoid overlapping maintenance until product logic demonstrates a need. | Android Lint/compiler/unit validation row. | Deferred by design |
| Android dependencies | Review policy | Version catalog is authoritative; no Dependabot/Renovate in v1 | `<UNRESOLVED_OWNER>` | Review catalog and wrapper monthly and immediately after an advisory; preserve the compatible tuple. | Recorded review cadence. | Adopter executes |
| Android hooks and CI | Local and automated validation | No hook files; provider-neutral commands only | `<UNRESOLVED_OWNER>` | Lefthook is cross-platform and Node-free, but clone-local installation adds friction; Husky requires Node/npm; native hooks are unmanaged. Future projects may choose hooks. GGA is optional only if project-local, unavailable-safe, credential-free, and never baseline-required. CI provider and device capability remain adopter choices. | No hook, CI, formatter, or provider configuration exists. | Deferred by design |
| Android releases | Adoption-owned release controls | Replace app ID/namespace, display name, minSdk if needed, signing, distribution, CI, release/versioning, dependency updates, and hook policy | `<UNRESOLVED_OWNER>` | Keep template identities and release controls neutral/public-safe. | `BOOTSTRAP.md` adoption checklist. | Unresolved adoption work |
