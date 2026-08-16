# Android Template Bootstrap Specification

## Purpose

Android bootstrap.

## Requirements

### Requirement: Official Compatibility Gate

Before implementation, the template MUST retain the approved compatible tuple as one unit: AGP 9.1.0, Gradle 9.3.1, Kotlin/KGP 2.4.10, `org.jetbrains.kotlin.plugin.compose` 2.4.10, Compose BOM 2026.06.00, `compileSdk`/`targetSdk` 36, minSdk 23, and JDK 17. The canonical contract MUST link the official primary-source evidence. This planning reconciliation does not authorize implementation.

#### Scenario: Verification

- GIVEN the canonical contract records official evidence
- WHEN the approved tuple is reviewed
- THEN Kotlin support is limited to AGP 9.1.0, the Compose compiler plugin matches Kotlin 2.4.10, BOM 2026.06.00 maps Compose core 1.11.3 and Material3 1.4.0, and API 36 is used for compile/target SDK.

#### Scenario: Missing source

- GIVEN a proposed tuple change
- WHEN it would infer AGP 9.1.1 support or select the Compose 1.12 direction requiring AGP 9.2+
- THEN implementation is blocked pending a newly approved, officially evidenced tuple.

### Requirement: Minimal Compose Application

The template MUST provide one buildable app with a Compose Material 3 launch screen, without navigation, DI, networking, persistence, feature modules, or integrations.

#### Scenario: Debug build

- GIVEN a clone
- WHEN debug app is built and launched
- THEN Material 3 screen renders.

#### Scenario: Scope

- GIVEN the module is reviewed
- WHEN starter scope is assessed
- THEN only declared behavior exists.

### Requirement: Quality and Test Wiring

The template MUST name `assembleDebug`, `lint`, `testDebugUnitTest`, and separate `connectedDebugAndroidTest` as source-of-truth commands. JVM and instrumented tests MUST remain distinct; instrumentation MAY require a device/emulator. No arbitrary coverage threshold or additional test tool is required.

#### Scenario: Fast

- GIVEN local prerequisites are available
- WHEN fast commands run
- THEN each reports reproducibly.

#### Scenario: Device unavailable

- GIVEN no device is available
- WHEN instrumentation is requested
- THEN its prerequisite is reported separately.

### Requirement: Neutral Adoption and Delivery Decisions

Defaults MUST be neutral/public-safe. `BOOTSTRAP.md` MUST temporarily list identity, SDK, tuple, tests, signing/release, distribution, CI, dependency-update, and hook choices. The canonical contract MUST record intentional AGP Built-in Kotlin (no default `org.jetbrains.kotlin.android`), a matching Compose plugin, catalog/wrapper monthly and advisory review, no v1 update bot, hook, formatter, or additional static-analysis tooling beyond Android Lint, provider-neutral CI commands, deferred CI/publishing/signing, and Quail 2 as a compatible environment reference only. minSdk 23 is the AndroidX-aligned default and adopters MAY raise it.

#### Scenario: Unadopted

- GIVEN adoption decisions are absent
- WHEN the template is inspected
- THEN placeholders remain unset and releases disabled.

#### Scenario: CI

- GIVEN CI is assessed
- WHEN the contract is read
- THEN commands and deferral are explicit.
