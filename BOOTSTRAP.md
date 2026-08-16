# Bootstrap Checklist

This file is temporary. Complete these decisions before publishing the adopted repository, record durable operating decisions in the [repository engineering contract](docs/repository-engineering.md), then close or delete this checklist.

## Ownership and identity

- [ ] Set `<PROJECT_NAME>` and `<PROJECT_OWNER>` where the adopted repository needs them.
- [ ] Confirm who maintains security, contributions, and publication decisions.
- [ ] Record `<LICENSE_DECISION>` and add a license only after that decision is approved.

## Working conventions

- [ ] Record `<PROJECT_CONVENTIONS>` for collaboration, review, and documentation.
- [ ] Record `<STACK_DECISION>` only after the adopter chooses a stack.
- [ ] Review the repository for duplicate guidance before adding new files or rules.

## Android adoption

- [ ] Replace the neutral app ID/namespace and display name before publishing.
- [ ] Confirm minSdk 23 or raise it for the product support policy; retain compileSdk/targetSdk 36 unless a compatible tuple is approved.
- [ ] Choose signing, distribution, CI provider, release/versioning, dependency-update, and hook policies; do not inherit template defaults for them.
- [ ] Keep the compatible tuple together: AGP 9.1.0, Gradle 9.3.1, Kotlin and Compose compiler plugin 2.4.10, Compose BOM 2026.06.00, JDK 17, compileSdk/targetSdk 36, and minSdk 23. Quail 2 is a compatible environment reference, not a project pin.
- [ ] Run `./gradlew assembleDebug`, `./gradlew lint`, and `./gradlew testDebugUnitTest`; run `./gradlew connectedDebugAndroidTest` separately with a configured device/emulator.

## Privacy and security

- [ ] Define `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>` and test it with a private report.
- [ ] Confirm that logs, screenshots, and examples are sanitized before publication.
- [ ] Review Git history and repository content for secrets, personal data, and local metadata.
- [ ] Keep local editor and AI-tool metadata fully ignored to reduce accidental publication of device-specific settings or identifiers.

## Completion

- [ ] Transfer every unresolved repository-engineering decision, owner, rationale, evidence, and status into the [repository engineering contract](docs/repository-engineering.md).
- [ ] Record the completed adoption decisions in the adopted repository.
- [ ] Close or delete this file after adoption.
