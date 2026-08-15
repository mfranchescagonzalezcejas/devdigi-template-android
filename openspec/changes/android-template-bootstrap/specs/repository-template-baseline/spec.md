# Delta for Repository Baseline

## MODIFIED Requirements

### Requirement: Public Safety

Content MUST be English, neutral, public-safe, and contain no secrets, personal, organizational, infrastructure, environment, local-path, or remote-account data; placeholders mean unset decisions. `.gitignore` MUST retain base rules plus only `.gradle/`, `build/`, `local.properties`, `captures/`, `*.apk`, and `*.aab`. `docs` and OpenSpec placeholders/config remain unchanged.
(Previously: the ignore list permitted only the inherited technology-neutral entries.)

#### Scenario: Safety
- GIVEN pre-publication inspection
- WHEN content and ignores are checked
- THEN data and rules are permitted.

#### Scenario: Placeholders
- GIVEN adoption is incomplete
- WHEN structure is checked
- THEN placeholders remain unchanged.

### Requirement: Exclusions

The baseline MUST NOT add CI, dependency automation, hooks, packages/infrastructure, remote operations, default licensing, secrets/endpoints, or publishing. The approved bootstrap MAY add only specified neutral Android/Gradle artifacts.
(Previously: application code and stack tooling were entirely excluded.)

#### Scenario: Scope
- GIVEN proposed changes
- WHEN an unapproved artifact is found
- THEN it is rejected.

#### Scenario: In scope
- GIVEN approved Android artifacts
- WHEN added
- THEN scope remains bounded.
