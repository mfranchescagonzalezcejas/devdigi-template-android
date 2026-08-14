# Design: Repository Engineering Maturity

## Technical Approach

Add one durable decision contract at `docs/repository-engineering.md`. Existing guides keep their responsibilities and gain contextual links to that authority. `BOOTSTRAP.md` remains disposable and directs adopters to record decisions in the contract. This adds no tooling, automation, dependencies, hooks, CI, bots, or stack/provider configuration.

## Architecture Decisions

| Option | Tradeoff | Decision |
|---|---|---|
| Expand existing guides | Duplicates decisions and leaves no authority after bootstrap removal. | Reject. Create one durable canonical contract. |
| Keep decisions in `BOOTSTRAP.md` | Knowledge disappears or makes bootstrap permanent. | Reject. Bootstrap contains only adoption work. |
| Link from each guide | Adds small navigation edits while preserving responsibilities. | Adopt one contextual link, no copied matrix rows. |
| Prescribe baseline practices | Faster adoption but violates provider neutrality and invents unsupported defaults. | Reject. Every decision starts unresolved until the adopter chooses, declines, defers, or records `N/A` where allowed. |
| Copy the baseline for each stack | Makes derived templates drift. | Reject. Stack templates update inherited decision values and add only stack-specific rows; baseline sections and policies are not duplicated. |

## Document Responsibilities and Data Flow

| File | Responsibility |
|---|---|
| `README.md` | Orient adopters and provide the discovery path to bootstrap and the durable contract. |
| `BOOTSTRAP.md` | Track one-time adoption work only; close or delete it after completion. |
| `docs/repository-engineering.md` | Persist accepted, unresolved, declined, and deferred repository-operating decisions and evidence. |
| `CONTRIBUTING.md` | Define contributor workflow and definition of done; link to adopted evidence decisions. |
| `AGENTS.md` | Constrain automated change behavior; link to canonical validation decisions. |
| `SECURITY.md` | Define private vulnerability handling; link to the canonical public-readiness decision. |

    README → BOOTSTRAP → repository-engineering contract
       CONTRIBUTING / AGENTS / SECURITY ────────────┘

Bootstrap completion writes decisions into the contract; removing bootstrap leaves durable knowledge intact.

## Durable Contract

`docs/repository-engineering.md` will state its authority, then use tables with unresolved placeholders. Its schema is: **area, decision, choice, owner, rationale, evidence, status**.

It will contain:

- repository identity;
- ownership, maintainership, and escalation;
- Git/change governance;
- dependency policy;
- quality evidence, where each adopter-declared applicable category records exactly one **command**, documented **procedure**, or **N/A**, plus owner, rationale, evidence, and status; the baseline supplies no commands or mandatory categories;
- explicit choose/decline/defer decisions for hooks, testing, CI, dependency automation, releases, and optional AI review;
- AI review's non-AI fallback when chosen, or rationale when declined/deferred;
- public-readiness evidence and security-channel readiness;
- OpenSpec lifecycle: `openspec/specs/` = current accepted specifications, `openspec/changes/` = active changes, and `openspec/changes/archive/` = immutable completed history;
- stack-template extension rule: resolve or append stack-specific decision rows in the inherited contract, never copy baseline policy sections.

An `N/A` is a completed applicability decision, never unresolved work. Entries do not assert implementation exists.

## Bootstrap-Only Content

`BOOTSTRAP.md` retains only sequencing and completion checks for repository identity, ownership assignment, license decision, project conventions, stack choice, tested private security channel, privacy/history review, and transfer of every unresolved repository-engineering decision into the durable contract. It contains no canonical commands, operating evidence matrix, ongoing status record, or duplicated policy.

## File Changes

| File | Action | Description |
|---|---|---|
| `docs/repository-engineering.md` | Create | Durable authority is new because no existing persistent file owns cross-cutting repository decisions. |
| `README.md` | Modify | Add contract to assets/adoption navigation. |
| `BOOTSTRAP.md` | Modify | Add contract-completion checks and sharpen temporary boundary. |
| `CONTRIBUTING.md` | Modify | Link evidence expectations to the contract. |
| `AGENTS.md` | Modify | Link validation and optional AI decisions to the contract. |
| `SECURITY.md` | Modify | Replace provider example with a neutral option and link public readiness. |

No other implementation files change. `openspec/specs/repository-template-baseline/spec.md` changes only during the later archive merge; the current delta remains under the active change until then.

## Testing Strategy

| Layer | What to Test | Approach |
|---|---|---|
| Unit | N/A | Documentation-only change with no executable unit. |
| Integration | Authority, links, required fields, exclusions | Manual/static review of all six documents and relative links; confirm no duplicated matrix rows or excluded artifacts. |
| E2E | Adoption lifecycle | Walk README → bootstrap → contract, then verify bootstrap can be removed while contribution, agent, security, quality, and OpenSpec decisions remain discoverable. |

## Threat Matrix

N/A — no routing, shell, subprocess, VCS/PR automation, executable-file classification, or process-integration boundary.

## Migration / Rollout

No data migration required. Apply all document links and the contract atomically; rollback reverts those documentation changes together.

## Open Questions

None.
