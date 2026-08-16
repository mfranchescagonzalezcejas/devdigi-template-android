# Verification Report

```yaml
schema: gentle-ai.verify-result/v1
evidence_revision: sha256:23943c192f39b5d0a5fc1dd8b7d7c3255f1dd176bb0e52ac5ed94dff64d75262
verdict: pass
blockers: 0
critical_findings: 0
requirements: 8/8
scenarios: 16/16
test_command: ./gradlew testDebugUnitTest
test_exit_code: 0
test_output_hash: sha256:b9541eb0c5e9c1156eb8d0106b17844e95d9ede8c0c170a8074edfb73ce66ce1
build_command: ./gradlew assembleDebug
build_exit_code: 0
build_output_hash: sha256:4b98c6272682d159599fb61d09ce98c0a83cb2053ac997ddeec284283d7031a2
```


**Change**: `android-template-bootstrap` | **Mode**: Standard (`strict_tdd: false`) | **Store**: OpenSpec | **Verdict**: **PASS**

## Settled findings

| Finding | Truthful result |
|---|---|
| JDK contract | `gradle/gradle-daemon-jvm.properties` is absent; `./gradlew --version` reports launcher and daemon JVM JDK 17. |
| JVM test | The tautological JVM test is absent. No meaningful pure-JVM starter behavior exists, while `testDebugUnitTest` remains and exits 0. |
| Device privacy | Repository and OpenSpec scans find no persisted device serial. Instrumentation evidence uses non-identifying device wording. |
| TDD metadata | `openspec/config.yaml` is authoritative with `strict_tdd: false`; direct structural, configuration, documentation, and inspection evidence is recorded without historical test-first claims. |

## Commands

| Command | Exact result |
|---|---|
| `./gradlew --version` | Exit 0; Gradle 9.3.1; launcher and daemon JVM JDK 17. |
| `./gradlew assembleDebug` | Exit 0; `BUILD SUCCESSFUL`; 36 actionable tasks, all up-to-date. |
| `./gradlew lint` | Exit 0; `BUILD SUCCESSFUL`; 27 actionable tasks, 6 executed and 21 up-to-date. |
| `./gradlew testDebugUnitTest` | Exit 0; `BUILD SUCCESSFUL`; 24 actionable tasks, 3 executed and 21 up-to-date. |
| `./gradlew connectedDebugAndroidTest` | Exit 0; `BUILD SUCCESSFUL`; one instrumentation test completed on a configured connected device. |
| `git diff --check` | Exit 0. |

## Inspection evidence

- Repository mode check: `gradlew` is `100755`; `gradlew.bat`, manifests, and documentation-like files are `100644`.
- Public-safe, secret, Java-25, tautological-test, and device-serial scans found no matching retained content.
- No CI, hooks, dependency automation, signing, publishing, services, or remotes were introduced.
- The current Compose `createAndroidComposeRule` API is deprecated but functional; migration to `androidx.compose.ui.test.junit4.v2.createAndroidComposeRule` is deferred as non-blocking maintenance.

```json
{"schema":"gentle-ai.verification-evidence/v1","request_id":"android-template-truthful-evidence-remediation-20260814","authorization_token":"sha256:23943c192f39b5d0a5fc1dd8b7d7c3255f1dd176bb0e52ac5ed94dff64d75262","strict_tdd":false,"test_command":"./gradlew testDebugUnitTest","test_exit_code":0,"build_command":"./gradlew assembleDebug","build_exit_code":0,"lint_command":"./gradlew lint","lint_exit_code":0,"device_command":"./gradlew connectedDebugAndroidTest","device_exit_code":0,"diagnosis":"PASS: JDK 17 contract, public-safe device evidence, non-tautological test policy, and Standard-mode metadata are consistent.","cleanup_evidence":"No local SDK configuration, credentials, device identifiers, build outputs, or remote operations were persisted.","process_evidence":"Executed JDK 17 wrapper, build, lint, unit, and connected-device commands; ran diff, mode, public-safety, secret, device-serial, Java-25, and metadata scans."}
```

## Maintainer follow-up verification

Post-remediation manual verification confirmed the declared JDK 17 contract,
`assembleDebug`, `lint`, and `testDebugUnitTest`.

Connected instrumentation produced an earlier transient
`No compose hierarchies found` failure. Two subsequent full
`connectedDebugAndroidTest --rerun-tasks` executions passed, including a run
started with both application and test packages absent from the connected device.
The current instrumentation smoke test is therefore accepted for this bootstrap;
the observed transient failure remains a non-blocking maintenance signal and
should be revisited if it becomes reproducible.

A repository-candidate scan confirmed that the connected-device identifier is
absent from tracked and non-ignored files. Identifiers observed under ignored
build output and IDE-local state are not repository content.

## Post-review closure verification

After the CodeRabbit review findings were reconciled, maintainer verification
confirmed the final bootstrap state:

- `./gradlew assembleDebug`: exit 0; `BUILD SUCCESSFUL`.
- `./gradlew lint`: exit 0; `BUILD SUCCESSFUL`.
- `./gradlew testDebugUnitTest`: exit 0; `BUILD SUCCESSFUL`.
- `./gradlew connectedDebugAndroidTest`: exit 0; one instrumentation test passed.
- `git diff --check`: exit 0.

The final application handles edge-to-edge system insets, derives the visible
starter label from `R.string.app_name`, and retains the known Compose test-rule
deprecation warning as non-blocking maintenance.
