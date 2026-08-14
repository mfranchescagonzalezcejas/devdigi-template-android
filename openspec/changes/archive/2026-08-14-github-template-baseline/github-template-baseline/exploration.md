## Exploration: GitHub Template Repository Baseline

### Current State
The repository is an unborn `main` branch with no commits. All visible repository files are untracked. It contains the requested directory skeleton, a minimal OpenSpec bootstrap, and no application code, dependencies, workflows, hooks, infrastructure, or stack-specific files.

`openspec/config.yaml` is sufficient for the stated minimal bootstrap: it contains no absolute paths, user data, environment values, or stack references. `openspec/specs/` intentionally contains only `.gitkeep`, so it is not a completed source-of-truth specification set.

### Affected Areas
Exact gap status against the target:

- `.github/ISSUE_TEMPLATE/bug_report.yml` — **Exists, empty.** Must become a valid form covering summary, current/expected behavior, reproduction, environment, sanitized logs/screenshots, additional context, duplicate-search acknowledgement, and a no-secrets reminder.
- `.github/ISSUE_TEMPLATE/feature_request.yml` — **Exists, empty.** Must ask for problem/need before solution, desired outcome, optional solution, alternatives, scope, context, and duplicate search.
- `.github/ISSUE_TEMPLATE/config.yml` — **Exists, empty.** Must minimally set `blank_issues_enabled: false`, because the two structured forms cover supported submissions; it must not add external links.
- `.github/pull_request_template.md` — **Exists, empty.** Must cover summary, why, related issue, change type, tests/evidence, screenshots when applicable, security/privacy impact, and checklist.
- `docs/architecture/.gitkeep` — **Matches target.** No additional documentation is required by the requested structure.
- `docs/decisions/.gitkeep` — **Matches target.** No additional documentation is required by the requested structure.
- `openspec/config.yaml` — **Matches minimal-bootstrap requirement.** Retain it unchanged unless a later SDD phase needs project-specific rules.
- `openspec/specs/.gitkeep` — **Matches target.**
- `openspec/changes/.gitkeep` — **Matches target.**
- `openspec/changes/archive/.gitkeep` — **Matches target.**
- `.gitignore` — **Matches the exact requested ignore set.** It contains only `.DS_Store`, `Thumbs.db`, `.idea/`, `.vscode/`, `.cursor/`, `.atl/`, `.codegraph/`, `.env`, `.env.*`, `!.env.example`, `*.log`, `*.tmp`, and `*.swp` (plus explanatory comments).
- `AGENTS.md` — **Exists, empty.** Must define inspection-first behavior, architecture respect, minimal tooling, impact review, small changes, duplicate checks, relevant validation, decision documentation, pragmatic SDD/TDD, AI-output skepticism, and privacy/local-data protection.
- `BOOTSTRAP.md` — **Exists, empty.** Must be a temporary adoption checklist covering all listed project decisions and explicitly instructing deletion/closure after adoption.
- `CONTRIBUTING.md` — **Exists, empty.** Must define issue-first significant work, focused branches, Conventional Commits, small PRs, issue links where applicable, evidence, docs, review, and a general definition of done without mandating GitFlow.
- `SECURITY.md` — **Exists, empty.** Must include a contact placeholder, safe reporting, rotation guidance, log sanitization, privacy protection, and Git-history review before publishing.
- `README.md` — **Missing.** Must explain the template purpose and problem, technology-agnostic boundary, included/excluded items, safe template adoption, conceptual stack-specific extension, no product logic, `BOOTSTRAP.md`, and placeholders without resembling an application README.

### Approaches
1. **Complete only the declared repository baseline** — Populate the missing README and empty requested documents/forms while leaving the matching skeleton and OpenSpec bootstrap unchanged.
   - Pros: Meets the exact scope with no product or stack coupling.
   - Cons: Requires careful public-safety review of every placeholder and example.
   - Effort: Low

2. **Add automation or stack presets** — Add workflows, dependency automation, runtime files, hooks, or infrastructure.
   - Pros: None for this stated baseline.
   - Cons: Violates the absolute exclusions and weakens technology agnosticism.
   - Effort: Out of scope

### Recommendation
Use Approach 1. Write only the missing/empty target files in English and retain the already-correct placeholder directories, OpenSpec bootstrap, and exact generic `.gitignore`. Do not add CI, Jenkins, GitHub Actions, Dependabot, remote GitHub settings, packages, application code, stack tooling, infrastructure, endpoints, secrets, or publishing operations.

Narrow implementation plan:
1. Add the neutral `README.md`, `BOOTSTRAP.md`, `AGENTS.md`, `CONTRIBUTING.md`, and `SECURITY.md` content from the stated requirements.
2. Add the two valid GitHub issue forms, minimal issue-template configuration, and PR template; disable blank issues because structured forms are intentionally provided.
3. Leave `.gitignore`, OpenSpec, and `.gitkeep` paths unchanged; explain the editor-directory tradeoff in the README or bootstrap guidance.
4. Review all new text for placeholders, absence of personal/infrastructure data, and compliance with every absolute exclusion.

### Risks
- Ignoring `.vscode/`, `.idea/`, and `.cursor/` protects local state and editor-specific metadata, but prevents intentionally shared editor settings; a future project may opt in explicitly after template adoption.
- `.atl/` is ignored, but its current local registry includes absolute home-directory paths and a Railway reference; it must remain uncommitted.
- `.git/config` contains an account-specific SSH remote. It is local Git metadata, not template content, and must not be copied into documentation.
- Empty YAML issue-form files are nonfunctional until populated.
- The baseline has no initial commit, so no Git history currently makes the template reproducible.

### Ready for Proposal
Yes. The exact requirements now map to the current state, and the scope is narrow enough for a proposal limited to the declared documentation and GitHub template baseline.
