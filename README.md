# Android Template Baseline

This repository is a public-safe, minimal Android starting point: one neutral Compose app plus the inherited governance and intake templates. It is not a product architecture or release-ready application.

## Included assets

- `BOOTSTRAP.md` for temporary adoption decisions.
- [`docs/repository-engineering.md`](docs/repository-engineering.md) for durable repository-operating decisions and evidence.
- `SECURITY.md` for private vulnerability reporting expectations.
- `AGENTS.md` and `CONTRIBUTING.md` for change and review practices.
- The Gradle version catalog and wrapper for the approved Android toolchain.
- GitHub issue forms and a pull request template for structured intake.

## Boundaries

This baseline deliberately excludes product architecture, CI provider configuration, hooks, dependency bots, signing, publishing, infrastructure, remote configuration, and a default license. Add those only after the adopter records the relevant decisions.

## Adopt this template

1. Complete `BOOTSTRAP.md`, including ownership, identifiers, signing/release decisions, and `<LICENSE_DECISION>`.
2. Record unresolved repository-operating decisions and evidence in the [repository engineering contract](docs/repository-engineering.md).
3. Define and test `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>` before publication.
4. Close or remove `BOOTSTRAP.md` after the decisions are recorded.
5. Run the canonical local checks: `./gradlew assembleDebug`, `./gradlew lint`, and `./gradlew testDebugUnitTest`. Run `./gradlew connectedDebugAndroidTest` separately when a device or emulator is available.

## Placeholders

Placeholders use uppercase names in angle brackets and mean an unresolved adoption decision. They are not sample values. Keep public text free of secrets, personal data, local paths, and account details.

## Local metadata

Editor and AI-tool metadata directories are ignored in full. This favors privacy and prevents device-specific settings from entering the template; shared project settings should be added deliberately after review.
