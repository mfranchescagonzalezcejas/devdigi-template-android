# Tasks: Repository Engineering Maturity

## Review Workload Forecast

| Field | Value |
|---|---|
| Estimated changed lines | 280–380 authored lines |
| 400-line budget risk | Medium |
| Chained PRs recommended | No |
| Suggested split | Single PR, two reviewable work units |
| Delivery strategy | ask-on-risk |
| Chain strategy | pending |

Decision needed before apply: No
Chained PRs recommended: No
Chain strategy: pending
400-line budget risk: Medium

### Suggested Work Units

| Unit | Goal | Likely PR | Focused test command | Runtime harness | Rollback boundary |
|---|---|---|---|---|---|
| 1 | Add the durable decision contract | PR 1 | `git diff --check` plus manual schema review | N/A: documentation-only | Revert `docs/repository-engineering.md` |
| 2 | Add progressive references and final consistency checks | PR 1 | `git diff --check`; link and public-safe review | N/A: no executable runtime | Revert edits to the five guide files |

## Phase 1: Durable Contract

- [x] 1.1 Create `docs/repository-engineering.md` with the area/decision/choice/owner/rationale/evidence/status schema; record identity, ownership/escalation, change governance, dependencies, quality command/procedure/`N/A`, hooks, testing, CI, dependency automation, releases, AI fallback/rationale, public readiness, OpenSpec lifecycle, and stack-template extension decisions. Validate every row has required fields and no default tooling/provider; rollback: delete this new file.

## Phase 2: Progressive Guidance

- [x] 2.1 Modify `README.md` and `BOOTSTRAP.md` to discover the contract, preserve BOOTSTRAP as temporary sequencing, and avoid copied decisions. Validate orientation and adoption scenarios; rollback: revert only these two files.
- [x] 2.2 Modify `CONTRIBUTING.md`, `AGENTS.md`, and `SECURITY.md` with brief contextual references while preserving their separate roles and existing safety/workflow requirements. Validate links and no duplicated contract rows; rollback: revert only these three files.

## Phase 3: Verification

- [x] 3.1 Review duplication across `docs/repository-engineering.md`, `README.md`, `BOOTSTRAP.md`, `CONTRIBUTING.md`, `AGENTS.md`, and `SECURITY.md`; confirm references point to the authority and stack templates extend rows without copying policy. Validate all repository-engineering and baseline scenarios; rollback: revert the offending document edit.
- [x] 3.2 Run final public-safe, whitespace, and OpenSpec consistency review across the six documents and `openspec/changes/repository-engineering-maturity/`; confirm no personal data, named contacts, defaults, tooling/configuration, trailing whitespace, or premature main-spec/archive edits. Validate with `git diff --check` and a manual path/status audit; rollback: revert the complete documentation change atomically.
