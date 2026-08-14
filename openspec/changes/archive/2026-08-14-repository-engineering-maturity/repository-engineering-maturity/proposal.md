# Proposal: Repository Engineering Maturity

## Intent

Give each adopter one concise, provider-neutral decision contract for operating the repository without inventing maintainers, commands, platforms, or tooling.

## Scope

### In Scope
- Add a canonical `docs/repository-engineering.md` decision matrix: identity; ownership, maintainership, and escalation; Git/change governance; dependencies; evidence; CI; releases; public readiness; optional AI; and OpenSpec.
- Require every applicable quality category to state a canonical command, documented procedure, or `N/A`, plus owner, evidence, and status.
- Link the contract progressively from `README.md`, `BOOTSTRAP.md`, `CONTRIBUTING.md`, `AGENTS.md`, and `SECURITY.md`.
- Define hooks as an explicit choose/decline/defer decision and AI review as optional with a documented non-AI fallback or skip rationale.
- State `openspec/specs/` as enduring source of truth, `openspec/changes/` as active phase-scoped work, and `openspec/changes/archive/` as immutable audit history.

### Out of Scope
- CI, hooks, bots, dependencies, provider configuration, remote settings, coverage targets, release automation, licenses, or runtime architecture.
- Named people, contacts, security channels, commands, branch models, or AI providers.

## Capabilities

### New Capabilities
- `repository-engineering`: Provider-neutral decision and evidence contract for adopters.

### Modified Capabilities
- `repository-template-baseline`: Integrate and reference the new contract across existing adoption, contribution, agent, security, and orientation requirements.

## Approach

Use progressive disclosure: short references in existing guidance and one canonical, table-led contract. Each decision remains visible as unresolved until an adopter records its owner, evidence, and status; no implementation is implied.

## Affected Areas

| Area | Impact | Description |
|------|--------|-------------|
| `docs/repository-engineering.md` | New | Canonical decision matrix. |
| `README.md`, `BOOTSTRAP.md` | Modified | Orientation and unresolved adoption decisions. |
| `CONTRIBUTING.md`, `AGENTS.md`, `SECURITY.md` | Modified | Governance, evidence, AI, and readiness references. |
| `openspec/specs/repository-template-baseline/spec.md` | Modified | Enduring baseline requirements. |

## Risks

| Risk | Likelihood | Mitigation |
|------|------------|------------|
| Tool-specific policy leaks into the template | Medium | Require decisions, never defaults. |
| Contract duplicates guidance | Medium | Keep it canonical; link rather than repeat. |
| `N/A` hides missing checks | Medium | Require owner, rationale, evidence, and status. |

## Rollback Plan

Revert the documentation links, contract, and approved spec deltas together; no runtime, remote, or automation state requires recovery.

## Dependencies

- Adopters must later record their own ownership, process, and quality decisions.

## Success Criteria

- [ ] Every required decision has an owner, evidence, status, or explicit unresolved placeholder.
- [ ] Quality categories use command, procedure, or `N/A` without assumed tooling.
- [ ] AI remains optional and OpenSpec lifecycle roles are unambiguous.
