# Repository Baseline

## Requirements

### Requirement: README

`README.md` MUST explain purpose, boundaries, assets, exclusions, adoption, stack extension, `BOOTSTRAP.md`, the repository-engineering contract, and placeholders; MUST NOT resemble an application README. It MUST link progressively to the canonical contract without repeating its decisions.

#### Scenario: Orientation
- GIVEN an adopter views `README.md`
- WHEN they review it
- THEN purpose, boundaries, assets, and bootstrap path are clear.

#### Scenario: No product claim
- GIVEN the generic template
- WHEN its README is reviewed
- THEN it contains no product, endpoint, runtime, or stack instruction.

#### Scenario: Contract discovery
- GIVEN an adopter needs repository operating decisions
- WHEN they follow the README reference
- THEN they reach the canonical contract without duplicated policy.

### Requirement: Adoption Guidance

`BOOTSTRAP.md` MUST be a temporary checklist for identity, ownership, license, conventions, stack, tested private channel, and unresolved repository-engineering decisions; close or delete after adoption. `AGENTS.md` MUST require inspection-first, architecture-respecting minimal changes; impact/duplicate/validation checks; documented decisions; pragmatic SDD/TDD; AI skepticism; privacy protection; and reference the contract. `CONTRIBUTING.md` MUST require issue-first significant work, focused branches, Conventional Commits, small PRs, issue links, evidence, documentation, review, a definition of done without GitFlow, and reference the contract without duplicating it.

#### Scenario: Adoption completion
- GIVEN public-release preparation
- WHEN BOOTSTRAP is completed
- THEN license and tested private-channel decisions are recorded and the checklist is closed.

#### Scenario: Contribution without GitFlow
- GIVEN significant proposed work
- WHEN a contributor follows CONTRIBUTING
- THEN it is issue-linked, focused, evidence-backed, and branch-model neutral.

### Requirement: Security

`SECURITY.md` MUST use `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>` and require private reporting, secret rotation, sanitized logs, privacy protection, Git-history review before publication, and a progressive reference to the public-readiness decision; it MUST NOT duplicate the canonical contract. A private disclosure mechanism MAY be an adopter option, never configured infrastructure.

#### Scenario: Safe disclosure
- GIVEN a vulnerability report
- WHEN SECURITY is read
- THEN it directs private reporting and prohibits public secret disclosure.

#### Scenario: Unconfigured channel
- GIVEN the contact placeholder remains
- WHEN publication readiness is assessed
- THEN release is blocked until a private channel is defined and tested.

#### Scenario: Readiness reference
- GIVEN security readiness needs wider repository context
- WHEN SECURITY is reviewed
- THEN it links to the canonical decision without restating it.

#### Scenario: Provider-neutral disclosure
- GIVEN SECURITY is reviewed before adoption
- WHEN disclosure options are described
- THEN no provider-specific mechanism or configuration is imposed.

### Requirement: Public Safety

All authored content MUST be English, neutral, and public-safe: no secrets, personal, organizational, infrastructure, environment, absolute-local-path, or remote-account data; placeholders MUST mean unset decisions. `.gitignore` MUST contain only `.DS_Store`, `Thumbs.db`, `.idea/`, `.vscode/`, `.cursor/`, `.atl/`, `.codegraph/`, `.env`, `.env.*`, `!.env.example`, `*.log`, `*.tmp`, and `*.swp`, plus comments. `docs` and OpenSpec placeholders/config MUST remain unchanged.

#### Scenario: Public-safety review
- GIVEN pre-publication inspection
- WHEN content and ignore rules are checked
- THEN no sensitive or identity-bearing data and only specified rules are present.

#### Scenario: Placeholder documentation
- GIVEN adoption has not added architecture or decision content
- WHEN repository structure is checked
- THEN placeholder paths and OpenSpec bootstrap remain unchanged.

### Requirement: Issues

GitHub MUST disable blank issues and provide valid English YAML bug/feature forms without external links. Bug fields MUST cover summary, actual/expected behavior, reproduction, environment, sanitized logs/screenshots, context, duplicate acknowledgement, and no-secrets reminder. Feature fields MUST cover problem before solution, outcome, optional solution, alternatives, scope, context, and duplicate search.

#### Scenario: Bug submission
- GIVEN a reporter selects the bug form
- WHEN required fields are completed
- THEN the issue captures reproducible, sanitized diagnostics.

#### Scenario: Blank issue
- GIVEN new-issue intake
- WHEN no form is selected
- THEN a blank issue cannot be created.

### Requirement: PR Template

The PR template MUST request summary, rationale, related issue, type, tests/evidence, applicable screenshots, security/privacy impact, and a checklist.

#### Scenario: Evidence-backed pull request
- GIVEN a pull request
- WHEN its template is applied
- THEN rationale, validation, linkage, and security/privacy impact are recorded.

#### Scenario: Non-visual change
- GIVEN no visual result
- WHEN the PR template is completed
- THEN screenshots are not applicable and other evidence remains required.

### Requirement: Exclusions

The baseline MUST NOT add CI, GitHub Actions, Jenkins, Dependabot, hooks, packages, infrastructure, application code, stack tooling, remote GitHub configuration, pushes, pull requests, a default `LICENSE`, secrets, endpoints, or publishing operations.

#### Scenario: Scope review
- GIVEN proposed baseline changes
- WHEN an excluded artifact is found
- THEN it is rejected from this change.

#### Scenario: In-scope content
- GIVEN required assets
- WHEN added
- THEN they are documentation or forms only.
