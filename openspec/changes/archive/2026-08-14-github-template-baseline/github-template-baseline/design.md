# Design: GitHub Template Baseline

## Technical Approach

Populate the eight empty baseline files and add `README.md`. Use GitHub's native issue-form and pull-request-template formats; add no scripts, dependencies, automation, remote configuration, or default license.

## Architecture Decisions

| Option | Tradeoff | Decision |
|---|---|---|
| Populate only declared missing/empty files | Requires manual adoption decisions but creates no speculative surface | Chosen: smallest implementation satisfying the proposal and spec |
| Add validation scripts, CI, or schema dependencies | Repeatable, but creates tooling and maintenance outside scope | Rejected: run local, non-persisted checks with Git and Ruby standard libraries |
| Use organization-specific labels, assignees, links, or contacts | More turnkey for one owner, but unsafe and non-reusable | Rejected: omit remote identities and use explicit unresolved placeholders |

## Data Flow

    Adopter -> README -> BOOTSTRAP checklist -> resolve decisions
                                              -> test private channel
                                              -> close/delete BOOTSTRAP

    Contributor -> CONTRIBUTING / AGENTS -> issue form -> focused PR template
    Security reporter -> SECURITY.md -> private channel (never a public issue)

## File Changes

| Order | File | Action | Content |
|---:|---|---|---|
| 1 | `BOOTSTRAP.md` | Modify | Temporary checklist for identity, ownership, license decision, conventions, stack choice, privacy review, and a defined/tested private security channel; instruct adopters to close or delete it afterward. |
| 2 | `SECURITY.md` | Modify | Private reporting policy using `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>`; prohibit public secret disclosure; require rotation, sanitized evidence, privacy protection, and Git-history review. Mention Security Advisories only as an optional adoption decision. |
| 3 | `README.md` | Create | Explain template purpose, boundaries, included assets, exclusions, adoption path, placeholders, and how to add stack-specific content only after bootstrap. Avoid product/runtime language. |
| 4 | `AGENTS.md` | Modify | Require inspection-first, architecture-respecting minimal changes, duplicate/impact checks, relevant validation, documented decisions, pragmatic SDD/TDD, skeptical AI review, and privacy protection. |
| 5 | `CONTRIBUTING.md` | Modify | Define issue-first significant work, focused branch-neutral changes, Conventional Commits, small linked PRs, evidence, documentation, review, and definition of done. |
| 6 | `.github/ISSUE_TEMPLATE/config.yml` | Modify | Set only `blank_issues_enabled: false`; omit contact links. |
| 7 | `.github/ISSUE_TEMPLATE/bug_report.yml` | Modify | Native issue form for summary, actual/expected behavior, reproduction, environment, sanitized logs/screenshots, context, duplicate confirmation, and no-secrets confirmation. |
| 8 | `.github/ISSUE_TEMPLATE/feature_request.yml` | Modify | Native issue form ordered problem, desired outcome, optional solution, alternatives, scope, context, and duplicate confirmation. |
| 9 | `.github/pull_request_template.md` | Modify | Request summary, rationale, related issue, type, tests/evidence, optional screenshots, security/privacy impact, and completion checklist. |

Leave `.gitignore`, `docs/**`, `.gitkeep` files, and other OpenSpec artifacts unchanged.

## Interfaces / Contracts

- Placeholders use `<UPPER_SNAKE_CASE>` and always mean unresolved adoption decisions, never sample production values. Allowed placeholders are `<PROJECT_NAME>`, `<PROJECT_OWNER>`, `<LICENSE_DECISION>`, `<PROJECT_CONVENTIONS>`, `<STACK_DECISION>`, and `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>`.
- Publication is blocked while the security placeholder remains or the private channel has not been tested.
- Issue forms contain required `name`, `description`, and `body`; body controls use unique IDs and GitHub-native `markdown`, `input`, `textarea`, or `checkboxes` types. Omit labels, assignees, projects, external URLs, and organization issue types.
- Optional fields are explicitly marked; security/duplicate acknowledgements and core diagnostic/problem fields are required.

## Implementation Order

1. Hash protected files and confirm the nine-file write allowlist.
2. Write safety/adoption documents, then orientation/governance documents.
3. Write issue chooser, forms, and PR template.
4. Validate and review the diff; do not mutate GitHub remotely.

## Testing Strategy

| Layer | What to Test | Installation-free approach |
|---|---|---|
| Syntax | Three YAML files parse | `ruby -e` with standard-library `yaml` and `YAML.safe_load_file` |
| Contract | Required keys, unique IDs, required fields, disabled blank issues | One non-persisted Ruby assertion command over parsed YAML |
| Content | Required sections, exact security placeholder, placeholder allowlist, English text | Ruby standard-library text assertions plus manual review |
| Safety | No secrets, identity data, absolute local paths, URLs in forms, excluded files, or protected-file changes | Fixed-file allowlist, targeted text scan, pre/post hashes, and `git diff --check` |

No unit, integration, or E2E runner exists; adding one would violate scope.

## Security / Public-Safe Analysis

The trust boundary is authored public text. Failures are an unresolved channel at publication, public vulnerability disclosure, identity-bearing defaults, external routing, or leaked local/infrastructure data. Reject such content, direct reports privately, require sanitization and secret rotation, and preserve the publication blocker. Embed no secrets or real contacts.

## Threat Matrix

N/A — no routing, shell, subprocess, VCS/PR automation, executable-file classification, or process-integration boundary.

## Migration / Rollout

No migration required. Rollout is a single local documentation/template change; rollback removes `README.md` and restores the eight previously empty files.

## Open Questions

None.
