# Repository Engineering Contract

This is the durable, canonical record of repository-operating decisions and their evidence. It records decisions; it does not configure or implement them. Complete it during adoption and update it when an accepted decision changes.

## How to use this contract

1. Replace each unresolved placeholder with a decision, an explicit decline or deferral, or `N/A` where the decision is inapplicable.
2. Assign an owner, explain the rationale, and link or describe the evidence for every applicable row.
3. Keep the status current. `N/A` is a completed applicability decision, not unresolved work.

| Area | Decision | Choice | Owner | Rationale | Evidence | Status |
|---|---|---|---|---|---|---|
| Repository identity | Repository name and purpose | `<UNRESOLVED_IDENTITY_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Ownership | Maintainers and decision authority | `<UNRESOLVED_OWNERSHIP_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Escalation | Support and security escalation path | `<UNRESOLVED_ESCALATION_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Change governance | Branch, merge, commit, review, and traceability approach | `<UNRESOLVED_CHANGE_GOVERNANCE_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Dependencies | Update ownership, review cadence, security response, and compatibility evidence | `<UNRESOLVED_DEPENDENCY_POLICY>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Hooks | Choose, decline, or defer a local change-check mechanism | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Testing | Choose, decline, or defer testing expectations and evidence | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| CI | Choose, decline, or defer automated validation and exception handling | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Dependency automation | Choose, decline, or defer dependency-update automation | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Releases | Choose, decline, or defer versioning, approval, notes, rollback, and publication decisions | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| AI review | Choose, decline, or defer optional AI-assisted review | `<CHOOSE_DECLINE_OR_DEFER>` | `<UNRESOLVED_OWNER>` | `<NON_AI_FALLBACK_IF_CHOSEN_OR_RATIONALE_IF_DECLINED_OR_DEFERRED>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| Public readiness | Publication readiness, residual-risk acknowledgement, and private-channel readiness | `<UNRESOLVED_PUBLIC_READINESS_DECISION>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |

## Quality evidence

Add one row for every quality category the adopter declares applicable. Each row must contain exactly one canonical command, one documented procedure, or `N/A`; do not record more than one method in the same row. If `N/A` is selected, state why the category is inapplicable and retain the owner, rationale, evidence, and status.

| Area | Decision | Choice | Owner | Rationale | Evidence | Status |
|---|---|---|---|---|---|---|
| Quality evidence | `<QUALITY_CATEGORY>` | `<ONE_COMMAND_OR_ONE_DOCUMENTED_PROCEDURE_OR_N_A>` | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE_OR_N_A_REASON>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |

## OpenSpec lifecycle

| Area | Decision | Choice | Owner | Rationale | Evidence | Status |
|---|---|---|---|---|---|---|
| OpenSpec lifecycle | Enduring accepted specifications | `openspec/specs/` is the source of truth | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| OpenSpec lifecycle | Active phase-scoped work | `openspec/changes/` contains active changes | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |
| OpenSpec lifecycle | Completed change history | `openspec/changes/archive/` is immutable audit history and is not active editable work | `<UNRESOLVED_OWNER>` | `<UNRESOLVED_RATIONALE>` | `<UNRESOLVED_EVIDENCE>` | `<UNRESOLVED_STATUS>` |

## Stack-template extension

Stack templates inherit this contract. Resolve inherited decision values and append only stack-specific decision rows when needed; do not copy baseline policy sections or matrix rows.
