## Exploration: Repository Engineering Maturity

### Current State

#### Current-state audit

The published template is intentionally a small, technology-agnostic governance baseline. `main` is clean at the two-commit baseline; all 24 tracked paths are documentation, GitHub issue/PR intake, OpenSpec artifacts, or placeholder directories. There are no runtime files, dependency manifests, CI definitions, hooks, release files, changelog, license, remote-enforced policies, or configured quality commands. Local ignored editor/agent/index metadata exists but is not part of the template and must remain private.

Existing guidance is deliberately narrow:

- `README.md` describes the template boundary and adoption sequence.
- `BOOTSTRAP.md` captures identity, owner, license, conventions, stack, and private security-channel decisions, then asks adopters to close/delete it.
- `CONTRIBUTING.md` defines issue-first significant work, Conventional Commits, focused PRs, validation evidence, and review without a branch-model mandate.
- `AGENTS.md` requires inspection-first, minimal, evidence-backed, privacy-safe changes and skeptical AI review.
- `SECURITY.md` blocks publication until a private reporting channel is decided and tested.
- GitHub issue forms and the PR template already provide safe, structured intake; blank issues are disabled.
- `openspec/specs/repository-template-baseline/spec.md` is the current source-of-truth baseline. The prior complete change is preserved under `openspec/changes/archive/2026-08-14-github-template-baseline/`; `openspec/changes/` has no active change yet.

The base therefore has a sound policy foundation, but no explicit repository-engineering decision contract for maintainership, Git governance, quality-command categories, hook posture, dependency updates, evidence, CI portability, version/release policy, optional AI tooling, or OpenSpec lifecycle semantics.

#### InkScroller practices discovered

Read-only GitHub inspection found the following in both reference repositories:

| Practice | Evidence | Classification |
|---|---|---|
| Structured issue intake, duplicate checks, and PR evidence checklists | Native issue forms, disabled blank issues, PR templates, issue/PR history | universal principle |
| Work is traceable through focused issue/branch/PR units and conventional commit messages | Issue labels, focused PR titles, release and sync PR history | universal principle |
| Local checks are documented and grouped by speed/cost | `AGENTS.md`, hook configurations, CI definitions | universal principle |
| Tests, lint/format, type checks, and security/compliance checks produce merge/release evidence | CI and test trees in both repositories | universal principle |
| Release quality gates precede publication, and releases are traceable by versions/tags/changelogs | workflows, release docs, tags/releases, backend changelog | universal principle |
| Public-readiness guidance includes secret handling, history review, rotation, sanitized logs, and explicit residual risks | `SECURITY_PUBLIC_READINESS.md` in both repositories | universal principle |
| AI review is optional, auditable, and does not replace human verification | CodeRabbit disabled by default; optional local GGA fallback/skip in backend | universal principle |
| Active OpenSpec changes coexist with archived, reviewable change evidence | OpenSpec folders in both repositories | universal principle |
| Native GitHub issue forms, labels, assignees, GitHub Projects, branch protection, and GitHub-hosted workflows | GitHub metadata/workflows/forms | technology-dependent implementation |
| Dependabot schedules and GitHub Actions dependency-audit job | frontend `dependabot.yml` and CI workflow | technology-dependent implementation |
| Lefthook/pre-commit stages, FVM/Flutter commands, Ruff/mypy/pytest commands, and numeric coverage gate | hook/tool configurations | technology-dependent implementation |
| Tag-triggered APK/AAB builds, Firebase distribution, Google Play publishing, Railway deployment, secret injection, and provider-specific smoke checks | release/deploy workflows and docs | technology-dependent implementation |
| `main`/`develop` promotion and post-release sync PRs | reference PR history and release workflows | project-dependent decision |
| Assigned intake, taxonomy labels, project-board status, Jira/GitLab mirror flow, and product-area dropdowns | issue forms, labels, PR templates | project-dependent decision |
| Version format, release-note selection rules, build-number policy, and exact test subsets | release docs/workflows | project-dependent decision |
| Commit-time AI review or mandatory numeric coverage as a template default | reference hooks and CI | not appropriate for base template |
| Provider-bound workflows, deployment/publishing, secret names, remote policy, default license, stack files, or runtime architecture | reference repositories | not appropriate for base template |

The references are mature applications, not reusable base templates. Their useful lesson is the decision sequence and evidence model; their concrete automation and product workflow must not be copied.

### Affected Areas

- `README.md` — add a short pointer to the adopted repository-engineering contract, without turning the template into a tool guide.
- `BOOTSTRAP.md` — add unresolved decisions for maintainership, Git governance, local validation, dependency policy, release/versioning, and OpenSpec lifecycle.
- `CONTRIBUTING.md` — clarify focused change units, evidence categories, and how an adopter follows the chosen governance policy.
- `AGENTS.md` — define AI/tool neutrality, evidence expectations, and no-assumed-runtime behavior for agents.
- `SECURITY.md` — link public-readiness decision evidence without adding provider, secret, or deployment instructions.
- `docs/repository-engineering.md` — justified as one concise, decision-oriented contract shared by maintainers, contributors, and agents; avoids duplicating a large policy into four existing documents.
- `openspec/specs/repository-template-baseline/spec.md` — evolve the source-of-truth capability with the documented maturity contract after a delta spec is approved.
- `openspec/changes/repository-engineering-maturity/` — holds only active phase artifacts; archive moves completed evidence and main specs retain enduring requirements.

### Approaches

1. **Decision-oriented documentation contract** — Extend existing guidance and add one small cross-cutting repository-engineering document with placeholders, decision tables, evidence expectations, and adoption gates.
   - Pros: Preserves technology neutrality; gives adopters a usable operating model; adds no executable surface or provider commitment.
   - Cons: Decisions remain manual until an adopting repository chooses its stack and platform.
   - Effort: Medium

2. **Tooling-first baseline** — Add workflows, dependency bots, hooks, coverage gates, or AI integrations modeled after InkScroller.
   - Pros: Immediate automation for one assumed stack/platform.
   - Cons: Violates the template boundary, creates maintenance obligations, and wrongly treats project choices as universal defaults.
   - Effort: High and out of scope

### Recommendation

Choose Approach 1. Add only a decision-oriented repository-engineering contract, linked from the existing documents. It should require each adopter to choose and record—not inherit—the following:

1. repository identity, maintainers, decision authority, and support/security ownership;
2. branch/merge/commit/change workflow, with focused review units and traceability;
3. a local quality-command contract divided into applicable categories (format, lint, type, test, build, security, docs), explicitly allowing `not applicable`;
4. a conscious hooks decision: none, local hooks, or another mechanism, with documented AI-review fallback/skip behavior when AI is optional;
5. dependency-update ownership, review cadence, security response, and compatibility evidence;
6. testing evidence expectations and the fact that thresholds/layers are stack/project decisions;
7. a provider-neutral CI contract that says what must be validated and reported, not which provider executes it;
8. versioning, release approval, changelog/release-note, rollback, and publication-readiness decisions;
9. public-readiness evidence, including secret/history review and residual-risk acknowledgement; and
10. optional AI tools as non-authoritative assistants whose findings require human verification.

Document OpenSpec semantics precisely: `specs/` is enduring source of truth; `changes/<name>/` is active, phase-scoped work; `changes/archive/<date>-<name>/` is immutable audit history. Do not prescribe a workflow runner or modify `openspec/config.yaml` unless a later approved design identifies a genuinely enduring, stack-neutral rule.

### Gap Matrix

| Practice | Current base | Desired base | Classification | Change needed | Rationale |
|---|---|---|---|---|---|
| Repository identity and maintainership | Temporary owner placeholder only | Named adoption decision: maintainers, authority, support/security ownership | universal principle | Enrich `BOOTSTRAP.md` and central contract | Accountability must be explicit before process is enforceable. |
| Git governance | Focused changes and Conventional Commits; branch-neutral | Record chosen branch/merge/review policy and exceptions | project-dependent decision | Enrich `CONTRIBUTING.md` and central contract | A template must not choose GitFlow, trunk, or `develop` for adopters. |
| Commit/change workflow | Issue-first significant work, PR evidence | Define proportional change records, commit-to-change traceability, and decision capture | universal principle | Enrich `CONTRIBUTING.md` | Retains focused, reviewable work without forcing an issue tracker. |
| Local quality commands | “smallest relevant validation” only | Table of optional categories and one adopter-owned canonical command per applicable category | universal principle | Central contract plus `AGENTS.md` reference | Evidence needs a discoverable contract, not assumed tooling. |
| Hooks | No policy/configuration | Explicit choose/decline/defer decision; hooks cannot be assumed | project-dependent decision | `BOOTSTRAP.md` and central contract | Hooks depend on language, tooling, developer environment, and team tolerance. |
| AI review | AI output is a draft | Optional assistant; human accountable; unavailable/failed tool has a documented fallback | universal principle | `AGENTS.md` and central contract | Preserves review quality without requiring a provider/runtime. |
| Dependency updates | No policy | Record owner, cadence, security urgency, compatibility evidence, and automation decision | universal principle | Central contract | Dependabot is an implementation, not the policy. |
| Testing evidence | Relevant tests or validation evidence | Define evidence by risk and applicability; no default runner/layer/threshold | universal principle | `CONTRIBUTING.md`, `AGENTS.md`, central contract | The base cannot truthfully mandate tests it cannot run. |
| CI/gates | None by design | Provider-neutral required checks, evidence publication, and failure/exception handling | universal principle | Central contract | Keeps the future CI contract portable and auditable. |
| Release/version/changelog | No policy | Choose version scheme, approval, release notes/changelog, rollback, and publication gate | project-dependent decision | `BOOTSTRAP.md` and central contract | SemVer and tag automation fit some projects, not all. |
| Public readiness | Security channel and generic hygiene only | Periodic readiness checklist: current tree/history, secrets, sensitive metadata, license decision, residual risks | universal principle | `SECURITY.md` link and central contract | Extends the existing publication blocker without copying product secrets guidance. |
| GitHub issue/PR forms | Already complete and safe | Keep as current intake; do not add labels, assignees, or links | technology-dependent implementation | No change required | Baseline already captures the universal intake principle safely. |
| Provider automation | Absent | Remain absent; adopters decide after stack/platform selection | not appropriate for base template | Explicit non-goal | Avoids CI, bots, actions, Jenkins, remotes, and deployment coupling. |
| OpenSpec lifecycle | Config and one archived baseline exist, but semantics are implicit | State source-of-truth, active-change, and immutable-archive roles | universal principle | Central contract and README pointer | Prevents treating archived artifacts as editable requirements. |

#### Proposal-ready scope ideas

- Establish a single, English, provider-neutral repository-engineering decision contract.
- Integrate it by reference into existing orientation, bootstrap, contribution, agent, and security guidance.
- Extend baseline specifications with requirements/scenarios for decision recording, evidence, optional quality categories, AI fallback, release/public readiness, and OpenSpec lifecycle.
- Keep all automation, dependencies, hook frameworks, coverage targets, provider configuration, remote settings, licenses, product architecture, URLs, and secrets out of scope.

#### Acceptance criteria candidates

- An adopter can identify every required decision, its owner, completion evidence, and whether it is currently unresolved.
- The contract distinguishes universal principles from chosen implementations and labels non-applicable quality categories explicitly.
- No document mandates CI provider, hook framework, dependency bot, AI provider/runtime, coverage threshold, branch model, release mechanism, or default license.
- Contributors and agents can locate the canonical validation/evidence expectation without inventing commands or treating AI output as approval.
- Release/public readiness requires recorded decisions and evidence, not a copied deployment procedure.
- OpenSpec source, active-change, and archive semantics are unambiguous and archive immutability is preserved.
- The change remains documentation/specification only and stays within the 400-line review budget; split only if the forecast exceeds it.

#### Design direction

Use progressive disclosure: `README.md` remains an orientation page; `BOOTSTRAP.md` is the short unresolved-decision checklist; `docs/repository-engineering.md` is the canonical matrix; `CONTRIBUTING.md`, `AGENTS.md`, and `SECURITY.md` link to the relevant sections rather than duplicate them. Design every row as “decision, owner, evidence, status” and use `<UPPER_SNAKE_CASE>` placeholders only for unresolved adoption values. The proposal/design should forecast the authored documentation diff before apply and preserve the user’s `interactive`, `ask-on-risk`, and 400-line review controls.

#### Exact potential file paths

```text
README.md
BOOTSTRAP.md
CONTRIBUTING.md
AGENTS.md
SECURITY.md
docs/repository-engineering.md
openspec/changes/repository-engineering-maturity/proposal.md
openspec/changes/repository-engineering-maturity/specs/repository-engineering/spec.md
openspec/changes/repository-engineering-maturity/design.md
openspec/changes/repository-engineering-maturity/tasks.md
openspec/specs/repository-template-baseline/spec.md
```

### Risks

- Copying reference automation would make the base stack/provider-specific and violate the declared exclusions.
- A large central document could duplicate existing guidance; mitigate by making it the canonical decision table and linking to it tersely.
- “Optional” quality checks can become meaningless unless each adopter records applicability, canonical command, owner, and evidence location.
- Reference repositories have unprotected `main` branches and disabled GitHub security scanning; those remote states are observations, not defaults to reproduce or remediate in this template change.
- Existing local ignored metadata includes an old CodeGraph database; it was not used or modified, and it must not be treated as committed project state.

### Ready for Proposal

Yes — propose only the decision-oriented documentation/specification contract. Tell the user that no automation or remote configuration will be introduced; the proposal should ask for approval only if a new canonical `docs/repository-engineering.md` is accepted as the justified single source for cross-cutting decisions.
