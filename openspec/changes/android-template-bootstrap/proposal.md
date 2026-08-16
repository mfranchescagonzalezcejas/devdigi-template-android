# Proposal: Android Template Bootstrap

## Intent

Give Android teams and solo developers a neutral, buildable starting point. Extend, rather than duplicate, the inherited decision contract.

## Scope

### In Scope

- A single `:app` Kotlin DSL Android skeleton with wrapper, version catalog, manifest, and neutral identifiers.
- Compose and Material 3 static sample screen, the canonical JVM test task, and an instrumented smoke test without a tautological starter JVM test.
- Android decision/evidence rows for tooling, validation, dependency review, hooks, CI, and releases.
- Document the approved compatible tuple: AGP 9.1.0, Gradle 9.3.1, Kotlin/KGP and Compose plugin 2.4.10, Compose BOM 2026.06.00, `compileSdk`/`targetSdk` 36, minSdk 23, and JDK 17. This planning reconciliation does not authorize implementation.

### Out of Scope

- Navigation, DI, networking, persistence, feature modules, product integrations, signing, publishing, or release automation.
- CI workflows, hooks, GitHub setting changes, Dependabot, Renovate, and other dependency-update automation in v1.

## Capabilities

### New Capabilities

- `android-template-bootstrap`: A minimal, neutral Compose Android application template with documented adoption and validation boundaries.

### Modified Capabilities

- `repository-template-baseline`: Permit this approved Android extension and narrowly revise the exact ignore-list/exclusion boundary where Android build artifacts require it.
- `repository-engineering`: Add Android-specific decision and evidence rows while retaining the existing contract as the sole canonical policy record.

## Approach

Adopt the minimal single-module approach: Gradle Kotlin DSL, a version catalog, Compose BOM, Material 3, Activity Compose, and test support. Use the approved tuple as one conservative unit: Kotlin 2.4.10 is fully supported only through AGP 9.1.0, so AGP 9.1.1 is excluded; BOM 2026.06.00 maps Compose core 1.11.3 and Material3 1.4.0, avoiding the Compose 1.12 direction that requires AGP 9.2+. Document scheduled manual catalog/wrapper review and Gradle validation. Preserve placeholders and defer release identity.

## Affected Areas

| Area | Impact | Description |
|---|---|---|
| `settings.gradle.kts`, `build.gradle.kts`, `gradle/**` | New | Verified toolchain, wrapper, and catalog |
| `app/**` | New | Single Compose app, manifest, static screen, JVM test-task wiring, and instrumented test source set |
| `docs/repository-engineering.md`, `BOOTSTRAP.md` | Modified | Android adoption decisions and evidence |
| `.gitignore`, baseline specs | Modified | Explicitly reconcile Android artifact ignores with baseline rules |

## Risks

| Risk | Likelihood | Mitigation |
|---|---|---|
| Tuple drift | Med | Keep the approved versions coupled; re-evaluate from official sources before changing any member. |
| Placeholder ID is published | Low | Retain adopter-owned rename/signing checklist |
| Emulator gate is unavailable locally | Med | Keep instrumentation separate from fast unit validation |

## Rollback Plan

Revert the bootstrap commit(s), including baseline-spec deltas and Android decision rows; the repository returns to its governance-only baseline with no secrets or remote changes.

## Dependencies

- The official evidence URLs recorded in the canonical engineering contract.
- An adopter-selected package/application name and device/emulator evidence; adopters may raise minSdk above 23.

## Success Criteria

- [x] A fresh clone builds the neutral debug app and renders the static Material 3 screen.
- [x] The approved compatibility tuple and canonical quality commands are documented before code is added.
- [x] Unit and instrumented smoke checks have evidence; automation and releases remain deferred or declined.
