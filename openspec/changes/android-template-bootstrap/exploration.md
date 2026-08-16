# Exploration: android-template-bootstrap

### Current State

This repository is an unchanged, public-safe inheritance of `mfranchescagonzalezcejas/devdigi-template-base` v1.0.0 (single initial commit). It deliberately contains governance and intake artifacts only: no Gradle wrapper, Android module, Kotlin source, manifest, SDK configuration, tests, formatter, linter, CI, hooks, dependency automation, release configuration, or runtime tooling.

The inherited universal decisions remain authoritative:

| Source | Universal decision already provided | Android implication |
|---|---|---|
| `README.md` | Stack tooling is excluded until an adopter records a justified stack choice. | Add Android-only guidance without turning the README into an application/product document. |
| `BOOTSTRAP.md` | Identity, owner, license, conventions, stack, and a tested private security channel remain unresolved adoption decisions. | Keep neutral identifiers and placeholders; do not invent an organization, store account, signing identity, or endpoint. |
| `docs/repository-engineering.md` | The table is the canonical decision/evidence record; each quality category has one canonical command/procedure/N/A. | Record Android commands, update policy, hooks, CI, release stance, and safety decisions there rather than duplicate policy. |
| `CONTRIBUTING.md` / `AGENTS.md` | Focused, evidence-backed, privacy-safe changes; Conventional Commits; inspection-first; pragmatic SDD/TDD. | Keep the initial skeleton small, validate it, and document only Android-specific additions. |
| `SECURITY.md` | Private reporting channel is unresolved and blocks public readiness; no secrets or sensitive evidence in public. | Do not add signing keys, `google-services.json`, credentials, or release automation. |
| `openspec/specs/*` | Baseline and repository-engineering specs are enduring source of truth; active work lives under `openspec/changes/`. | This exploration is an active change artifact; baseline specs must not be altered during exploration. |

### Affected Areas

- `openspec/changes/android-template-bootstrap/exploration.md` — active exploration artifact (this file).
- `docs/repository-engineering.md` — later proposal should resolve Android-specific quality, dependency, hooks, CI, and release decisions.
- `README.md`, `BOOTSTRAP.md`, `AGENTS.md`, `CONTRIBUTING.md`, `SECURITY.md` — preserve universal policy; make only minimal stack-extension references if required by the proposal.
- `settings.gradle.kts`, `build.gradle.kts`, `gradle/libs.versions.toml`, `gradle/wrapper/*`, `gradlew`, `gradlew.bat`, `gradle.properties` — candidate root build skeleton files.
- `app/build.gradle.kts`, `app/src/main/AndroidManifest.xml`, `app/src/main/java/<neutral-package>/MainActivity.kt`, `app/src/main/res/**` — candidate single-module Compose skeleton.
- `app/src/test/**`, `app/src/androidTest/**` — candidate unit and instrumented test support only.
- `.gitignore` — candidate Android/Gradle additions require an explicit baseline-spec decision because the inherited ignore list is intentionally exact.

### Gap Matrix

| Practice | Base provides | Android needs | Proposed implementation | Rationale |
|---|---|---|---|---|
| Project structure | Governance-only root | One application module | `:app` only, Kotlin DSL settings/build files, wrapper, catalog, manifest, one Compose activity | Smallest buildable native Android skeleton. |
| Toolchain/version strategy | No stack versions | Compatible AGP/Gradle/Kotlin/JDK/SDK set | Pin the approved tuple as one unit: AGP 9.1.0, Gradle 9.3.1, JDK 17, Kotlin/KGP and Compose plugin 2.4.10, and Compose BOM 2026.06.00 | Kotlin 2.4.10 is fully supported through AGP 9.1.0; version members must not be independently upgraded. |
| SDK levels | No platform policy | `compileSdk`, `targetSdk`, `minSdk` | Use `compileSdk` 36, `targetSdk` 36, and minSdk 23; adopters may raise minSdk for their support policy | Android 16 is API 36; minSdk 23 is an AndroidX-aligned baseline, not a ceiling. |
| UI | No runtime | Modern native starter | Compose + Material 3 + AndroidX Activity only; a static starter screen | Matches official Android guidance without a navigation or feature framework. |
| Dependency declarations | No dependency policy | Central, reviewable versions | Version catalog with Android application and Kotlin Compose plugins, Compose BOM, Activity Compose, Material 3, test libraries | Gradle-native catalog is central and low-cost. |
| Build/lint/test commands | Generic evidence contract | Stable local/CI contract | `./gradlew assembleDebug`, `./gradlew testDebugUnitTest`, `./gradlew connectedDebugAndroidTest`, and one `./gradlew check` aggregate after tasks exist | Explicit layer commands keep emulator-dependent checks separate. |
| Static analysis / formatting | No tools selected | Consistent Kotlin style | v1: Android Lint only via `./gradlew lint`; defer ktlint and detekt | Lint is supplied by AGP; adding two overlapping toolchains before app logic is unnecessary. |
| Tests | No test runner | Baseline test proof | One instrumented AndroidX/Compose smoke test; retain `testDebugUnitTest` as the JVM quality command without a tautological starter JVM test when no meaningful pure-JVM behavior exists; no coverage threshold | Proves the Android runner/UI wiring without inventing product or pure-JVM behavior. |
| Dependency updates | Decision placeholder | Reproducible review cadence | Manual, scheduled review of catalog and wrapper; validate `./gradlew check` plus `:app:dependencies`; no bot in v1 | Version catalog and wrapper make manual updates cheap; automation is a separate governance decision. |
| Hooks | Explicit choose/decline/defer row | Contributor feedback | Decline hooks in v1; document canonical commands in the contract | Hooks add install/runtime variability and CI must remain authoritative. |
| CI | Explicit choose/decline/defer row | Provider-neutral validation contract | Define the command contract only; defer provider implementation and do not add workflows | Meets policy without selecting GitHub Actions, Jenkins, or another provider. |
| Public safety | Privacy and security rules | Neutral identifiers and non-secret project metadata | Use neutral placeholders such as `com.example.androidtemplate` and `Android Template`; require adopters to replace both before publication | Prevents template identity from becoming a shipping package ID. |
| Bootstrap | Temporary decision checklist | Android adoption checklist | Add stack decision, chosen compatibility tuple, SDK policy, app/package naming, test device/emulator evidence, release/signing stance to the existing bootstrap/contract path | Resolves decisions progressively and keeps private data out of the template. |
| Releases | Explicit decision placeholder | APK/AAB, signing, versioning stance | Defer publishing and signing; allow only debug builds. Later release decision must address `versionCode`, `versionName`, upload key custody, Play policy, notes, rollback, and provenance | A template must never embed credentials or assume a store account. |

### Approved Tooling Evidence and Policy Decisions

The following approved tuple is documentation-only planning evidence; it does not authorize implementation or any project dependency change.

| Concern | Approved decision | Official primary source | Conservative rationale |
|---|---|---|---|
| Kotlin and AGP | Kotlin/KGP 2.4.10 with AGP 9.1.0 | https://kotlinlang.org/docs/gradle-configure-project.html | Kotlin 2.4.0–2.4.10 is fully supported through AGP 9.1.0. Do not infer support for AGP 9.1.1. |
| AGP runtime | AGP 9.1.0, Gradle 9.3.1, JDK 17 | https://developer.android.com/build/releases/gradle-plugin#9-1-0 | Use AGP 9.1's documented Gradle and JDK requirements as a matched base. |
| Compose compiler | `org.jetbrains.kotlin.plugin.compose` 2.4.10 | https://kotlinlang.org/docs/compose-compiler-migration-guide.html | Use Kotlin's matching Compose compiler plugin model; do not introduce a separate compiler-extension version. |
| Compose libraries | `androidx.compose:compose-bom:2026.06.00` | https://developer.android.com/develop/ui/compose/bom/bom-mapping | This stable BOM maps Compose core to 1.11.3 and Material3 to 1.4.0. Do not select the newer Compose 1.12 direction because it requires AGP 9.2+. |
| Android SDK | `compileSdk` 36 and `targetSdk` 36 | https://developer.android.com/about/versions/16/setup-sdk | Android 16 is API 36; compile and target the current platform level together. |
| Minimum SDK | minSdk 23 | https://developer.android.com/jetpack/androidx/releases | AndroidX-aligned default; adopters may raise it for their own support policy. |
| Development environment | Android Studio Quail 2 (2026.1.2) | https://developer.android.com/studio/releases#quail-2-0 | Quail 2 supports AGP 7.1–9.3, which covers AGP 9.1.0. This is development-environment guidance, not a project dependency pin. |

**Policy decisions proposed for v1:** one `:app` module; the approved tuple is pinned and updated as a unit; manual dependency reviews; no hooks; provider-neutral CI contract; no release signing/publishing.

### Reference Repository Assessment

References were inspected as examples only; none supplies template policy.

| Practice observed | Source | Classification | Treatment |
|---|---|---|---|
| Kotlin DSL, `:app`, repository centralization, wrapper, version catalog | `devdigi-music-android` | Reuse | Recreate the structural pattern with newly verified compatible versions and neutral identifiers. |
| Compose BOM, Activity Compose, Compose UI, Material 3 | `devdigi-music-android` | Reuse | Keep only this minimal UI dependency set. |
| `compileSdk`/`targetSdk`, JDK 17 toolchain, Android test runner | `devdigi-music-android` | Adapt | Re-verify versions/SDK values; retain the shape, not its historical values or package ID. |
| Single `check`-style quality contract and documentation of fast/slow checks | InkScroller frontend/backend | Adapt | Use Gradle commands and separate local unit from emulator instrumentation checks. |
| Local hook managers and AI-review commands | InkScroller frontend/backend | Defer | Their Lefthook/pre-commit implementations are language/tool specific and exceed a minimal Android template. |
| CI configuration | InkScroller frontend/backend | Defer | Preserve a provider-neutral command contract; do not copy GitLab/Jenkins workflows. |
| Detailed public-readiness documentation | InkScroller frontend/backend | Adapt | Existing baseline `SECURITY.md` and engineering contract already cover the principle; avoid duplicated documents. |
| Navidrome, Media3, Jenkins, Tailscale/private networking, Firebase, product endpoints/package IDs, release credentials | Music/InkScroller examples | Reject | Product/provider/security-specific and explicitly out of scope. |
| Flutter/Dart/FVM and Python/Ruff/mypy/pytest tooling | InkScroller examples | Reject | Wrong language and runtime for a native Kotlin template. |

### Approaches

1. **Minimal single-module Compose bootstrap** — Add only the native Android build skeleton, static Material 3 screen, canonical JVM test task, and instrumented smoke-test wiring.
   - Pros: Fits the inherited template boundary; low maintenance; easy to verify; no premature architecture.
   - Cons: Adopters add their own navigation, data, and domain patterns later.
   - Effort: Medium.

2. **Opinionated application starter** — Include modules, DI, navigation, networking, persistence, and automated operations.
   - Pros: Faster for one known product.
   - Cons: Violates scope, carries product decisions into every adopter, and creates tool/version maintenance debt.
   - Effort: High.

### Recommendation

Use Approach 1. Plan one neutral `:app` Compose application with Kotlin DSL, a catalog, wrapper, Material 3, AndroidX, manifest, JVM test-task wiring, and an instrumented test source set. The approved tuple is AGP 9.1.0, Gradle 9.3.1, Kotlin/KGP and Compose plugin 2.4.10, Compose BOM 2026.06.00, API 36 compile/target SDK, minSdk 23, and JDK 17. Keep repository operations as documented decisions and commands, not installed automation.

### Risks

- Kotlin 2.4.10 full support ends at AGP 9.1.0; AGP 9.1.1 compatibility must not be inferred.
- The newer Compose 1.12/BOM direction requires AGP 9.2+ and is intentionally excluded from this conservative tuple.
- The inherited baseline's exact `.gitignore` requirement conflicts with normal Android/Gradle ignore entries; resolve this explicitly in the proposal/spec before changing it.
- A neutral placeholder application ID must never be published; a real reverse-domain ID and signing policy are adopter-owned bootstrap decisions.
- Instrumented tests require an emulator/device, so `connectedDebugAndroidTest` cannot be the only fast local gate.
- Overengineering risk: copying hooks, CI providers, dependency bots, release automation, or reference-app features would turn a template into a product starter.

### Ready for Proposal

Yes — subject to a proposal that preserves inherited baseline specifications, records this approved tuple without implementing it, and explicitly records the `.gitignore`, toolchain, test, hooks, CI, dependency-update, identifier, and release decisions.
