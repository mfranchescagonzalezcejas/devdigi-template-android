# Tasks: GitHub Template Baseline

## Review Workload Forecast

| Field | Value |
|-------|-------|
| Estimated changed lines | 280–360 authored lines |
| 400-line budget risk | Low |
| Chained PRs recommended | No |
| Suggested split | Single PR with one reviewable work unit |
| Delivery strategy | ask-on-risk |
| Chain strategy | pending |

Decision needed before apply: Yes
Chained PRs recommended: No
Chain strategy: pending
400-line budget risk: Low

### Suggested Work Units

| Unit | Goal | Likely PR | Focused test command | Runtime harness | Rollback boundary |
|------|------|-----------|----------------------|-----------------|-------------------|
| 1 | Add the nine approved documentation/form files without changing protected files or remote GitHub state | PR 1 | `ruby -e` YAML/content assertions plus `git diff --check` | N/A — static documentation and GitHub metadata only | Revert the nine-file baseline change; remove `README.md` and restore the eight prior empty files |

## Phase 1: Safety and Foundation

- [x] 1.1 Hash protected files and confirm the nine-file write allowlist before editing; preserve `.gitignore`, `docs/**`, `.gitkeep` files, and OpenSpec artifacts.
- [x] 1.2 Write `BOOTSTRAP.md` and `SECURITY.md` with adoption decisions, private reporting, sanitization, rotation, privacy, history review, and the exact unresolved security placeholder.

## Phase 2: Governance and Orientation

- [x] 2.1 Create `README.md` covering purpose, boundaries, assets, exclusions, adoption, placeholders, `BOOTSTRAP.md`, and post-bootstrap stack extension without product or runtime claims.
- [x] 2.2 Update `AGENTS.md` and `CONTRIBUTING.md` with inspection-first minimal changes, impact/duplicate checks, pragmatic SDD/TDD, issue-first branch-neutral contribution, evidence, review, and definition of done.

## Phase 3: GitHub Intake

- [x] 3.1 Set `.github/ISSUE_TEMPLATE/config.yml` to disable blank issues without contact links or remote identities.
- [x] 3.2 Update `.github/ISSUE_TEMPLATE/bug_report.yml` and `feature_request.yml` as valid native YAML forms with unique IDs, required diagnostics/problem fields, duplicate checks, and no-secrets guidance.
- [x] 3.3 Update `.github/pull_request_template.md` to request summary, rationale, issue, type, evidence, screenshots applicability, security/privacy impact, and checklist completion.

## Phase 4: Installation-Free Verification

- [x] 4.1 Run Ruby standard-library parsing and assertions for YAML syntax, required keys, unique IDs, required fields, disabled blank issues, content sections, placeholder allowlist, and English/public-safe text.
- [x] 4.2 Run fixed-file allowlist and pre/post hash checks, targeted scans for secrets, identity data, absolute paths, form URLs, and excluded artifacts; finish with `git diff --check` and manual spec-scenario review.
