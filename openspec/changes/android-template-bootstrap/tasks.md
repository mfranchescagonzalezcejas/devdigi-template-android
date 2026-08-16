# Tasks: Android Template Bootstrap

## Final Review Workload

| Field | Value |
|---|---|
| Observed text scope | ~1,250 lines across changed/new text files; wrapper JAR excluded |
| Exact staged diff | 28 files changed, 1164 insertions, 5 deletions; Gradle wrapper JAR included as binary |
| 400-line budget risk | High — explicit size exception required |
| Chained PRs recommended | No |
| Suggested review structure | Single coherent bootstrap PR; phase boundaries may be preserved as review sections or commits |
| Delivery strategy | explicit-size-exception |
| Chain strategy | N/A — single PR |

Decision needed before apply: No — apply is complete
Chained PRs recommended: No
Chain strategy: N/A — single PR
400-line budget risk: High — explicit size exception

**Size exception rationale:** the Android skeleton, compatible Gradle toolchain,
adoption contract, OpenSpec specification, task evidence, and verification report
form one coherent bootstrap. Splitting them now would create intermediate review
states where implementation and its governing specification/evidence are separated.

### Implementation Work Units

| Unit | Goal | Review focus | Focused test command | Runtime harness | Rollback boundary |
|---|---|---|---|---|---|
| 1 | Approved tuple and planning reconciliation | Documentation and policy | `git diff --check` | N/A: documentation/policy only | The scoped planning documents |
| 2 | Verified wrapper/catalog and root Gradle setup | Toolchain and foundation | `./gradlew --version` | `./gradlew tasks` / fresh-checkout validation | Root Gradle files and `gradle/wrapper/**` |
| 3 | Minimal Compose app, smoke wiring, and adoption documentation | App, tests, and adoption contract | `./gradlew testDebugUnitTest` | `./gradlew connectedDebugAndroidTest` with a configured device/emulator | `app/**` and Android adoption documentation |

## Phase 1: Documentation-Only Compatibility Reconciliation

- [x] 1.1 Record official primary-source evidence for the approved AGP 9.1.0, Gradle 9.3.1, JDK 17, Kotlin/KGP and Compose plugin 2.4.10, BOM 2026.06.00, API 36, and minSdk 23 tuple; state the AGP 9.1.1 and Compose 1.12 exclusions.
- [x] 1.2 Reconcile only `exploration.md`, `proposal.md`, the active capability spec, `design.md`, `tasks.md`, and `docs/repository-engineering.md`; preserve inherited universal material and implementation prohibition.
- [x] 1.3 Record Android Studio Quail 2 as compatible development-environment guidance only, not a dependency pin.
- [x] 1.4 Inspect the scoped documentation diff; do not run builds, tests, or implementation commands.

## Phase 2: Blocking Compatibility Gate and Foundation

- [x] 2.1 **BLOCKING:** Reconfirm the approved official evidence before implementation; stop if it no longer supports the tuple.
- [x] 2.2 Assert repository modes for `gradlew` (`100755`), `gradlew.bat`, Markdown/MDX, `README.sh`, and build manifests (`100644`); fail on executable documentation-like files.
- [x] 2.3 Create `settings.gradle.kts`, `build.gradle.kts`, `gradle.properties`, `gradle/libs.versions.toml`, `gradle/wrapper/gradle-wrapper.properties`, `gradle/wrapper/gradle-wrapper.jar`, `gradlew`, and `gradlew.bat` from the approved tuple.
- [x] 2.4 Reconcile `.gitignore` and `openspec/changes/android-template-bootstrap/specs/{android-template-bootstrap,repository-template-baseline,repository-engineering}/spec.md` with the approved Android-only boundary.

## Phase 3: Minimal Application and Test Wiring

- [x] 3.1 Keep `./gradlew testDebugUnitTest` as the JVM quality command; do not retain a tautological JVM test when the static starter has no meaningful pure-JVM behavior.
- [x] 3.2 Create `app/build.gradle.kts`, `app/src/main/AndroidManifest.xml`, and `app/src/main/res/values/strings.xml` with one neutral `:app`, no release/signing/services, and approved dependencies only.
- [x] 3.3 Implement the static Material 3 launch screen in `app/src/main/java/com/example/androidtemplate/MainActivity.kt`, with no navigation, DI, networking, persistence, or feature modules.
- [x] 3.4 Add `app/src/androidTest/java/com/example/androidtemplate/MainActivityTest.kt` asserting starter text visibility; then verify `assembleDebug`, `lint`, and connected instrumentation separately.

## Phase 4: Adoption Documentation and Verification

- [x] 4.1 Update `README.md`, `BOOTSTRAP.md`, and `docs/repository-engineering.md` with neutral adoption placeholders, canonical Gradle commands, manual review cadence, no hooks, deferred CI/publishing/signing, and emulator prerequisites.
- [x] 4.2 Run fresh-clone checks: `./gradlew assembleDebug`, `./gradlew lint`, `./gradlew testDebugUnitTest`, and `./gradlew connectedDebugAndroidTest`; record unavailable-device evidence separately.
- [x] 4.3 Inspect `git diff --check`, tracked files, executable modes, forbidden secrets/local data, and absence of CI, hooks, dependency automation, remotes, credentials, and release artifacts.
