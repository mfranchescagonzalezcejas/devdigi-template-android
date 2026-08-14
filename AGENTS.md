# Change Guidance

## Before changing

- Inspect the relevant files and architecture before proposing an edit.
- Prefer the smallest change that preserves existing decisions and patterns.
- Check for duplicate guidance and assess the impact on related files.
- Protect privacy: never add secrets, personal data, local paths, or account details.

## Evidence and decisions

- Run the smallest relevant validation and record its result.
- Follow the adopted [repository engineering contract](docs/repository-engineering.md) for canonical validation evidence and optional AI-review decisions.
- Document decisions and deviations where future contributors need context.
- Use SDD or TDD pragmatically when the change benefits from explicit acceptance criteria or test-first feedback.
- Treat AI output as a draft: verify claims, security implications, and repository fit before accepting it.
