# Repository Template Baseline

This repository is a public-safe starting point for adopting project governance and GitHub intake templates. It is not an application, product description, or runtime guide.

## Included assets

- `BOOTSTRAP.md` for temporary adoption decisions.
- [`docs/repository-engineering.md`](docs/repository-engineering.md) for durable repository-operating decisions and evidence.
- `SECURITY.md` for private vulnerability reporting expectations.
- `AGENTS.md` and `CONTRIBUTING.md` for change and review practices.
- GitHub issue forms and a pull request template for structured intake.

## Boundaries

This baseline deliberately excludes application code, stack tooling, automation, infrastructure, remote configuration, and a default license. Add those only after the adopter has made and recorded the relevant decisions.

## Adopt this template

1. Complete `BOOTSTRAP.md`, including ownership, `<LICENSE_DECISION>`, `<PROJECT_CONVENTIONS>`, and `<STACK_DECISION>`.
2. Record unresolved repository-operating decisions and evidence in the [repository engineering contract](docs/repository-engineering.md).
3. Define and test `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>` before publication.
4. Close or remove `BOOTSTRAP.md` after the decisions are recorded.
5. Add stack-specific guidance only when it is chosen and justified by the adopted repository.

## Placeholders

Placeholders use uppercase names in angle brackets and mean an unresolved adoption decision. They are not sample values. Keep public text free of secrets, personal data, local paths, and account details.

## Local metadata

Editor and AI-tool metadata directories are ignored in full. This favors privacy and prevents device-specific settings from entering the template; shared project settings should be added deliberately after review.
