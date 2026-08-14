# Repository Engineering Specification

## Purpose

Provide one durable, provider-neutral decision and evidence contract for adopters without imposing tooling or duplicating operational guidance.

## Requirements

### Requirement: Canonical Decision Contract

`docs/repository-engineering.md` MUST be the canonical, table-led record for repository identity; ownership, maintainership, and escalation; change governance; dependencies; quality evidence; CI; releases; public readiness; optional AI; and OpenSpec. Each applicable decision MUST record a choice or explicit unresolved placeholder, owner, evidence, and status; the record MUST NOT imply implementation.

#### Scenario: Unresolved adoption decision
- GIVEN an adopter has not selected a practice
- WHEN the contract is reviewed
- THEN the decision is visibly unresolved with its required record fields.

#### Scenario: Canonical reference
- GIVEN guidance needs operational detail
- WHEN a reader follows its reference
- THEN the contract is the authoritative detail rather than duplicated guidance.

### Requirement: Quality Evidence Contract

Each applicable quality category MUST declare exactly one canonical command, documented procedure, or `N/A`, with owner, rationale, evidence, and status. An `N/A` entry MUST state why it is inapplicable and MUST NOT conceal an unmade decision.

#### Scenario: Procedure-selected quality check
- GIVEN no command is selected for an applicable category
- WHEN the adopter records a procedure
- THEN the procedure and its evidence satisfy the category without a stack command.

#### Scenario: Inapplicable quality category
- GIVEN a category is not applicable
- WHEN it is marked `N/A`
- THEN owner, rationale, evidence, and status remain recorded.

### Requirement: Explicit Practice Choices

Hooks, CI, dependency automation, testing, releases, and AI review MUST each be explicitly chosen, declined, or deferred. AI review MUST remain optional and, when chosen, MUST record a non-AI fallback; when declined or deferred, it MUST record a rationale. These entries MUST be decisions and evidence contracts, not automation or configuration.

#### Scenario: Deferred automation
- GIVEN an adopter postpones CI or hooks
- WHEN the decision is recorded
- THEN the status is deferred and no implementation is introduced.

#### Scenario: AI-free review
- GIVEN AI review is not chosen
- WHEN review expectations are assessed
- THEN a documented non-AI approach or skip rationale is available.

### Requirement: OpenSpec Lifecycle

The contract MUST define `openspec/specs/` as the enduring source of truth, `openspec/changes/` as active phase-scoped work, and `openspec/changes/archive/` as immutable audit history. It MUST NOT treat archived changes as editable active work.

#### Scenario: Archived change lookup
- GIVEN a completed change
- WHEN its lifecycle location is reviewed
- THEN it is retained as immutable audit history under `openspec/changes/archive/`.

### Requirement: Provider-Neutral Public Safety

The contract and its references MUST NOT contain stack- or provider-specific commands or content, personal data, named contacts, default licensing, remote settings, or automation/configuration artifacts.

#### Scenario: Excluded detail review
- GIVEN the contract is prepared for publication
- WHEN its content is inspected
- THEN it contains no stack/provider content, personal data, or named contacts.

#### Scenario: No default automation or license
- GIVEN an adopter has not made implementation choices
- WHEN the contract is inspected
- THEN it contains no default license, automation, remote setting, or configuration artifact.
