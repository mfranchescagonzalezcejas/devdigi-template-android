# Delta for Repository Baseline

## MODIFIED Requirements

### Requirement: README

`README.md` MUST explain purpose, boundaries, assets, exclusions, adoption, stack extension, `BOOTSTRAP.md`, the repository-engineering contract, and placeholders; MUST NOT resemble an application README. It MUST link progressively to the canonical contract without repeating its decisions.

(Previously: README required purpose, boundaries, assets, exclusions, adoption, stack extension, BOOTSTRAP, and placeholders.)

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

(Previously: Adoption guidance did not reference the repository-engineering contract or unresolved adoption decisions.)

#### Scenario: Adoption completion
- GIVEN public-release preparation
- WHEN BOOTSTRAP is completed
- THEN license and tested private-channel decisions are recorded and the checklist is closed.

#### Scenario: Contribution without GitFlow
- GIVEN significant proposed work
- WHEN a contributor follows CONTRIBUTING
- THEN it is issue-linked, focused, evidence-backed, and branch-model neutral.

#### Scenario: Temporary bootstrap
- GIVEN adoption decisions are complete
- WHEN the repository is reassessed
- THEN BOOTSTRAP is closed or removed rather than retained as durable policy.

### Requirement: Security

`SECURITY.md` MUST use `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>` and require private reporting, secret rotation, sanitized logs, privacy protection, Git-history review before publication, and a progressive reference to the public-readiness decision; it MUST NOT duplicate the canonical contract. A private disclosure mechanism MAY be an adopter option, never configured infrastructure.

(Previously: Security did not reference the public-readiness decision.)

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
