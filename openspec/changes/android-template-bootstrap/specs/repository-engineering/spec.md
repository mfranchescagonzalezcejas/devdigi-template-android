# Delta for Repository Engineering

## ADDED Requirements

### Requirement: Android Decision Evidence

The contract MUST record Android quality commands, manual review, no hooks, provider-neutral deferred CI, and deferred releases with evidence.

#### Scenario: Recorded

- GIVEN Android decisions are reviewed
- WHEN the contract is inspected
- THEN choices/status are explicit.

#### Scenario: Deferred

- GIVEN no provider is selected
- WHEN CI and releases are reviewed
- THEN they are deferred without configuration.

## MODIFIED Requirements

### Requirement: Provider-Neutral Public Safety

The contract MUST exclude personal data, named contacts, default licensing, remotes, and automation. It MAY name neutral Android tooling/local commands, never CI implementation.
(Previously: stack-specific commands and content were prohibited without an Android exception.)

#### Scenario: Safety

- GIVEN publication review
- WHEN the contract is inspected
- THEN prohibited details are absent.

#### Scenario: Defaults

- GIVEN choices are unmade
- WHEN the contract is inspected
- THEN no default automation/license exists.
