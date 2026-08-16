# Design: Android Template Bootstrap

## Technical Approach

Extend the inherited governance-only baseline with the smallest buildable native Android project: one `:app` module, Kotlin DSL, a Gradle wrapper, a version catalog, one Compose/Material 3 activity, and one instrumented smoke test. The repository-engineering contract remains canonical; automation and product architecture remain absent. No tautological JVM starter test is retained when there is no meaningful pure-JVM behavior.

## Version-Selection Gate

This planning-only reconciliation records the approved tuple in `docs/repository-engineering.md`: AGP 9.1.0, Gradle 9.3.1, JDK 17, Kotlin/KGP and `org.jetbrains.kotlin.plugin.compose` 2.4.10, Compose BOM 2026.06.00, `compileSdk`/`targetSdk` 36, and minSdk 23. Record official source URLs and access date with the tuple. Kotlin 2.4.10 full support ends at AGP 9.1.0, so AGP 9.1.1 is not implied. BOM 2026.06.00 maps Compose core 1.11.3 and Material3 1.4.0; exclude the newer Compose 1.12 direction because it requires AGP 9.2+. Android Studio Quail 2 is compatible development-environment guidance, not a build pin. No build files may be added by this reconciliation.

## Architecture Decisions

| Decision | Choice | Rejected alternative and rationale |
|---|---|---|
| Structure | Single `:app`; activity owns one static composable | Modules, navigation, DI, data/domain layers: no product behavior exists to justify them. |
| Toolchain | AGP 9.1.0, Gradle 9.3.1, JDK 17, Kotlin/KGP and Compose plugin 2.4.10, BOM 2026.06.00, API 36, minSdk 23 | AGP 9.1.1 and the Compose 1.12 direction: Kotlin's fully supported range and AGP 9.2+ requirement do not justify either upgrade. |
| Dependencies | Compose BOM plus Activity Compose, Material 3, Compose UI/test, AndroidX test, and JUnit only | No convenience libraries; Gradle-native catalog is sufficient. |
| Updates | Manual monthly catalog/wrapper review and immediate advisory review; validate the full tuple | Dependabot/Renovate deferred: automation ownership and provider policy are unresolved. |
| Quality | AGP Android Lint, unit wiring, and device smoke test; no formatter, detekt, or coverage threshold | ktlint/detekt/coverage deferred until real Kotlin logic creates a measurable need. |
| Hooks/CI | Decline hooks; publish provider-neutral Gradle commands only | Lefthook/pre-commit, GitHub Actions, GitLab, and Jenkins deferred to adopters. |
| Safety/releases | `com.example.androidtemplate` / `Android Template`; no signing, publishing, credentials, services, or release automation | Release identity, store policy, keys, versioning, provenance, and rollback remain adopter decisions. |

## Data Flow

    Official sources -> compatibility evidence -> pinned catalog/wrapper -> :app -> Gradle checks

## File Changes

| Files | Action | Purpose |
|---|---|---|
| `settings.gradle.kts`, `build.gradle.kts`, `gradle.properties`, `gradle/libs.versions.toml`, `gradle/wrapper/gradle-wrapper.properties`, `gradle/wrapper/gradle-wrapper.jar`, `gradlew`, `gradlew.bat` | Create | Central repositories, verified plugins/dependencies, reproducible wrapper. |
| `app/build.gradle.kts`, `app/src/main/AndroidManifest.xml`, `app/src/main/java/com/example/androidtemplate/MainActivity.kt`, `app/src/main/res/values/strings.xml` | Create | Minimal neutral debug application and static Material 3 screen. |
| `app/src/androidTest/java/com/example/androidtemplate/MainActivityTest.kt` | Create | Visible-screen instrumentation smoke proof; no tautological JVM starter test is retained when there is no meaningful pure-JVM behavior. |
| `README.md`, `BOOTSTRAP.md`, `docs/repository-engineering.md`, `.gitignore` | Modify | Describe Android scope, adoption decisions, canonical evidence, detected tests, and the approved Android/Gradle local-output and signing-material exclusions: `.gradle/`, `.kotlin/`, `**/build/`, `local.properties`, `captures/`, `*.apk`, `*.aab`, `*.jks`, `*.keystore`, and `keystore.properties`. |
| `openspec/changes/android-template-bootstrap/specs/{android-template-bootstrap,repository-template-baseline,repository-engineering}/spec.md` | Create | Define the new capability and narrowly permit stack files, Android ignores, and contract rows. |

## Contracts and Testing

Canonical commands are `./gradlew assembleDebug`, `./gradlew lint`, `./gradlew testDebugUnitTest`, and `./gradlew connectedDebugAndroidTest`; device testing stays a separate slow gate. A fresh clone must work with only JDK and Android SDK prerequisites. `local.properties`, signing material, `google-services.json`, endpoints, accounts, and personal/local data MUST remain untracked. The instrumented test asserts the starter text is visible. `testDebugUnitTest` remains the canonical JVM quality command, but no tautological JVM starter test is retained when there is no meaningful pure-JVM behavior.

## Reference Repository Classifications

Reuse `devdigi-music-android` Kotlin DSL, wrapper/catalog, Compose BOM, Activity Compose, UI, and Material 3 shapes; adapt its SDK/JDK/test-runner values after verification. Adapt InkScroller's fast/slow command and public-readiness patterns. Defer its hook managers, AI-review commands, and CI configurations. Reject Navidrome, Media3, Firebase, Tailscale/private networking, product endpoints/IDs, release credentials, Flutter/Dart/FVM, and Python/Ruff/mypy/pytest tooling.

## Threat Matrix

| Boundary | Applicability | Safe/failure behavior | Planned RED test |
|---|---|---|---|
| Documentation-like paths | Applicable: wrapper introduces executable classification | Only `gradlew` is POSIX-executable; fail on executable Markdown/MDX, `README.sh`, or build manifests | Repository-mode assertion: `gradlew` is `100755`; `gradlew.bat` and documentation-like files are `100644`. |
| Git repository selection | N/A: no repository-selection command | No `git -C` or path routing | None. |
| Commit state | N/A: no commit automation | No index mutation | None. |
| Push state | N/A: no push automation | No remote resolution | None. |
| PR commands | N/A: no PR automation | No command composition | None. |

## Migration / Rollout

No data migration. The completed bootstrap is delivered as one coherent PR containing the verified Android skeleton, compatible toolchain, adoption contract, OpenSpec specification, and verification evidence. Phase boundaries remain visible in the task history and commits; release remains deferred.

## Open Questions

None; exact stable versions and SDK numbers are the approved planning tuple, not authorization to create build files.
