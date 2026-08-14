```yaml
schema: gentle-ai.verify-result/v1
evidence_revision: sha256:f3f4348248341969b8d5479f1b5cb02cf2957063cfe4ee724b2928664805ece2
verdict: pass_with_warnings
blockers: 0
critical_findings: 0
requirements: 7/7
scenarios: 14/14
test_command: 'ruby "/tmp/opencode/sdd-github-template-baseline-verify.rb"'
test_exit_code: 0
test_output_hash: sha256:ee948da2dcf331a1b7f0836a947f64473e058d5e2c618cd6ea974d5c065bd1bf
build_command: git diff --check
build_exit_code: 0
build_output_hash: sha256:e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855
```

## Verification Report

**Change**: `github-template-baseline`
**Version**: N/A
**Mode**: Standard; hybrid persistence; independent final verification
**Delivery controls**: interactive, ask-on-risk, 400 review lines
**Verification date**: 2026-08-14

### Baseline Used

- Manifest source: `openspec/changes/github-template-baseline/apply-progress.md`
- Authorized manifest artifact SHA-256: `054c239a6bcc8562f9d885875513736c6d0dd63b5e0db17aecc7fbbfdf57f11b`
- Recomputed manifest artifact SHA-256: `054c239a6bcc8562f9d885875513736c6d0dd63b5e0db17aecc7fbbfdf57f11b`
- Protected paths declared: exactly 9
- Protected-path deltas: 0
- Baseline validity: from manifest generation onward only.

**Historical limitation**: integrity before this manifest cannot be proven cryptographically. All nine protected files are currently untracked, so Git history cannot recover their earlier preimages. The authorized baseline does not retroactively prove that those files were unchanged before its generation.

### Protected Manifest Comparison

| Path | Expected SHA-256 | Actual SHA-256 | Delta |
|---|---|---|---|
| `.gitignore` | `e7b904fa84e7b2833dba22d38f61e1536a620eb6e5950e3fa8cb6ea6bcdbaf5b` | `e7b904fa84e7b2833dba22d38f61e1536a620eb6e5950e3fa8cb6ea6bcdbaf5b` | None |
| `docs/architecture/.gitkeep` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | None |
| `docs/decisions/.gitkeep` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | None |
| `openspec/config.yaml` | `5d91c72284bfa077c713fc91f61a406eb3751c6ea9e57ba0059332721c30eaaf` | `5d91c72284bfa077c713fc91f61a406eb3751c6ea9e57ba0059332721c30eaaf` | None |
| `openspec/specs/.gitkeep` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | None |
| `openspec/changes/.gitkeep` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | None |
| `openspec/changes/archive/.gitkeep` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | `e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855` | None |
| `openspec/changes/github-template-baseline/specs/repository-template-baseline/spec.md` | `bd6133147521b57c3a6c0f673520ecc1ae9ff3676c8d26bca8236f747fafc2b7` | `bd6133147521b57c3a6c0f673520ecc1ae9ff3676c8d26bca8236f747fafc2b7` | None |
| `openspec/changes/github-template-baseline/design.md` | `822bac200968ad639984fda8ec8cca4d77a453787c9825680b205ec5258598d3` | `822bac200968ad639984fda8ec8cca4d77a453787c9825680b205ec5258598d3` | None |

### Completeness

| Metric | Value |
|---|---:|
| Requirements | 7 |
| Scenarios | 14 |
| Tasks total | 9 |
| Tasks complete | 9 |
| Tasks incomplete | 0 |
| Requirements complete | 7 |
| Scenarios compliant | 14 |

All proposal, specification, design, task, apply-progress, previous verify-report, configuration, manifest, protected files, and 23 candidate files were read before judgment.

### Build & Tests Execution

**Exhaustive installation-free acceptance harness**: ✅ Passed

```text
Command: ruby "/tmp/opencode/sdd-github-template-baseline-verify.rb"
Harness SHA-256: 653381f494396397aad5ac7f6dca18389715bba38fdd2a94b0875fbcc18f4d75
Exit: 0
Output: PASS yaml_files=4 forms=2 controls=16 requirements=7 scenarios=14 tasks=9 candidates=23 protected_paths=9 manifest_delta=0 public_safe_scan=pass exclusions=pass
Output SHA-256: ee948da2dcf331a1b7f0836a947f64473e058d5e2c618cd6ea974d5c065bd1bf
```

The harness used Ruby standard-library YAML, Digest, file, regex, and process APIs. It parsed every candidate YAML file, asserted the GitHub issue-form contract, checked required content, placeholder allowlisting, public-safe patterns, exclusions, task/spec counts, exact `.gitignore` rules, the manifest artifact hash, all nine protected hashes, and zero manifest delta.

**Build / whitespace check**: ✅ Passed

```text
Command: git diff --check
Exit: 0
Output: (empty)
Output SHA-256: e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855
```

**Coverage**: ➖ Not available. The project declares no unit, integration, E2E, coverage, linter, formatter, or type-check runner; adding one is outside this change.

### Spec Compliance Matrix

| Requirement | Scenario | Runtime evidence | Result |
|---|---|---|---|
| README | Orientation | Acceptance harness checked purpose, boundaries, assets, bootstrap path, and placeholders. | ✅ COMPLIANT |
| README | No product claim | Harness and source review found no endpoint, install, runtime, or stack instruction. | ✅ COMPLIANT |
| Adoption Guidance | Adoption completion | Harness checked all six placeholders, license decision, tested private channel, and close/delete instruction. | ✅ COMPLIANT |
| Adoption Guidance | Contribution without GitFlow | Harness checked issue-first, focused, evidence-backed, branch-neutral guidance. | ✅ COMPLIANT |
| Security | Safe disclosure | Harness checked private reporting, no public issue, sanitization, rotation, and history review. | ✅ COMPLIANT |
| Security | Unconfigured channel | Harness checked the exact placeholder and publication blocker until definition and testing. | ✅ COMPLIANT |
| Public Safety | Public-safety review | Harness checked exact ignore rules, placeholder allowlist, sensitive patterns, form URLs, and exclusions. | ✅ COMPLIANT |
| Public Safety | Placeholder documentation | All nine authorized protected hashes match the new baseline at runtime. | ✅ COMPLIANT |
| Issues | Bug submission | Ruby YAML and contract assertions checked required diagnostics, acknowledgements, and 16 unique IDs. | ✅ COMPLIANT |
| Issues | Blank issue | Parsed config equals only `blank_issues_enabled: false`. | ✅ COMPLIANT |
| PR Template | Evidence-backed pull request | Harness checked rationale, linkage, validation, and security/privacy sections. | ✅ COMPLIANT |
| PR Template | Non-visual change | Harness checked screenshot applicability and independent evidence requirements. | ✅ COMPLIANT |
| Exclusions | Scope review | Candidate-path scan found no workflow, Dependabot, Jenkins, package, infrastructure, license, hook, or stack-tooling artifact. | ✅ COMPLIANT |
| Exclusions | In-scope content | All nine implementation assets are documentation or GitHub forms. | ✅ COMPLIANT |

**Compliance summary**: 14/14 scenarios compliant.

### Correctness (Static Evidence)

| Requirement | Status | Notes |
|---|---|---|
| README | ✅ Implemented | Neutral orientation, boundaries, assets, exclusions, adoption, placeholders, and post-bootstrap stack extension are present. |
| Adoption Guidance | ✅ Implemented | `BOOTSTRAP.md`, `AGENTS.md`, and `CONTRIBUTING.md` satisfy the generic workflow contract without GitFlow. |
| Security | ✅ Implemented | Exact unresolved channel, private disclosure, sanitization, rotation, privacy, history review, and publication blocker are present. |
| Public Safety | ✅ Implemented from authorized baseline | Public-safe scan passes and all nine protected hashes match. Historical pre-baseline integrity remains unprovable. |
| Issues | ✅ Implemented | Every YAML parses with Ruby stdlib; forms have valid native structure, required fields, and 16 unique IDs. |
| PR Template | ✅ Implemented | All required sections and checklist evidence are present. |
| Exclusions | ✅ Implemented | No excluded candidate artifact was found. |

### Coherence (Design)

| Decision | Followed? | Notes |
|---|---|---|
| Limit implementation to nine documentation/form assets | ✅ Yes | One tracked README modification plus eight untracked implementation assets. |
| Use native GitHub forms and no validation dependency | ✅ Yes | Ruby standard-library checks passed. |
| Omit labels, assignees, projects, issue types, external links, and real contacts | ✅ Yes | No such defaults were found. |
| Preserve protected files from the authorized baseline | ✅ Yes | Exactly nine manifest entries; all expected and actual hashes match. |
| Treat README as newly created | ⚠️ Documented deviation | `HEAD` contains a one-line README, so implementation modifies it instead; no specification break. |

### Git State and Candidate Inventory

| Evidence | Result |
|---|---|
| `HEAD` | `322a07feed50c75d1589b31512f627154f64f3dc` (`Initial commit`) |
| Branch | `main`; no upstream configured |
| Staged paths | 0 |
| Tracked modifications | 1: `README.md` (`29` additions, `1` deletion) |
| Untracked files | 22 |
| Candidate files | 23 from `git ls-files -co --exclude-standard` |
| Ignored local files observed | `.atl/.skill-registry.cache.json`, `.atl/skill-registry.md`, `.codegraph/*`, `.vscode/settings.json` |
| Candidate hash manifest | `sha256:43e528f32f21278365f4a5341e8d619a7b8fe2d0eff4c55310f9594b66bbcdee` |
| Remote inspection | Local configuration only; `origin` exists, but no fetch, push, or remote mutation was performed. |

Candidate paths inspected:

```text
.github/ISSUE_TEMPLATE/bug_report.yml
.github/ISSUE_TEMPLATE/config.yml
.github/ISSUE_TEMPLATE/feature_request.yml
.github/pull_request_template.md
.gitignore
AGENTS.md
BOOTSTRAP.md
CONTRIBUTING.md
README.md
SECURITY.md
docs/architecture/.gitkeep
docs/decisions/.gitkeep
openspec/changes/.gitkeep
openspec/changes/archive/.gitkeep
openspec/changes/github-template-baseline/apply-progress.md
openspec/changes/github-template-baseline/design.md
openspec/changes/github-template-baseline/exploration.md
openspec/changes/github-template-baseline/proposal.md
openspec/changes/github-template-baseline/specs/repository-template-baseline/spec.md
openspec/changes/github-template-baseline/tasks.md
openspec/changes/github-template-baseline/verify-report.md
openspec/config.yaml
openspec/specs/.gitkeep
```

### Change Detection Since the Authorized Baseline

- Protected manifest comparison: no changed, missing, extra, or hash-mismatched protected path.
- Native reset candidate identity and generation-3 initial/begin candidate identity are identical: `sha256:ca0083b8c931a791f90690e6e79a32cf1cc4225d3871cbbe53118739667da27e`.
- Candidate timestamps are consistent with no out-of-scope candidate edit after manifest generation: `openspec/config.yaml` changed at `17:33:08`, the manifest artifact at `17:35:59`, and every other pre-existing candidate path has an earlier mtime/ctime.
- Detected changes versus the new baseline: **none before verify-report persistence**.
- This conclusion is cryptographically strong only for the nine protected paths. Candidate identity and timestamps support, but do not independently provide a content-addressed whole-worktree baseline for every untracked non-protected file.

### Command Evidence

| Command | Exit/state | Result |
|---|---:|---|
| `gentle-ai sdd-status github-template-baseline --cwd <repo> --json --instructions` | 0 | Full artifacts, 9/9 tasks; initial projection still routed to `resolve-review` because the prior failed report and review transaction state remained. |
| `gentle-ai sdd-attempt status --cwd <repo> --change github-template-baseline` | 0 | Maintainer reset recorded; generation 3 allowed `next_action: begin`. |
| `gentle-ai sdd-attempt acquire ... --work-unit independent-final-verification-new-baseline ...` | `proceed` | Acquired ordinal 3 using one-attempt, one-changed-line bounds. |
| `git status --porcelain=v2 --branch --untracked-files=all` | 0 | `main`; one tracked modification; 22 untracked files; zero staged paths. |
| `git ls-files -co --exclude-standard` | 0 | 23 candidate files, all read and hashed. |
| `ruby -ryaml -e '<parse every candidate YAML>'` | 0 | `PASS yaml_files=4`; both forms, issue config, and OpenSpec config parse. |
| `ruby "/tmp/opencode/sdd-github-template-baseline-verify.rb"` | 0 | Full 7-requirement/14-scenario acceptance output shown above. |
| `git diff --check` | 0 | Empty output; no whitespace errors. |
| Manifest extraction piped to `sha256sum --check` | 0 | Nine paths reported matching; manifest artifact hash matches authorization. |
| `git check-ignore -v ...` | 0 | All requested ignore rules matched, including `.env.example` negation. |
| Ruby SHA-256/stat inventory over `git ls-files -co --exclude-standard` | 0 | 23 files; candidate manifest `sha256:43e528...bbcdee`; no out-of-scope timestamp delta observed after baseline generation. |
| Fixed candidate exclusion assertions in acceptance harness | 0 | No CI, workflow, Dependabot, Jenkins, package, infrastructure, license, hook, application, or stack-tooling candidate. |
| `gentle-ai sdd-attempt settle ... --outcome passed ...` | `complete` | Ordinal 3 passed with evidence revision `sha256:f3f4348248341969b8d5479f1b5cb02cf2957063cfe4ee724b2928664805ece2`. |
| Final `gentle-ai sdd-attempt status ...` | 0 | `complete: true`, `decision_required: false`, `next_action: complete`, `changed_lines: 0`. |
| Final `gentle-ai sdd-status ... --json --instructions` after report persistence | 0 | `verify: all_done`, `archive: ready`, `nextRecommended: archive`, and no blocked reasons. |

### Native SDD Attempt State

- Objective generation: 3
- Attempt ordinal: 3
- Outcome: `passed`
- Runtime state: `complete`
- Decision required: `false`
- Next action: `complete`
- Changed lines charged: 0
- Evidence revision: `sha256:f3f4348248341969b8d5479f1b5cb02cf2957063cfe4ee724b2928664805ece2`
- Runtime revision after settlement: `sha256:de205b652d1711e43a4b224aad730c7a2a5ab0dfb93726d91055a3550d3d04e1`
- Binding revision: empty; this did not block compact acquire/settle for the maintainer-reset generation.
- Final OpenSpec projection: verification `all_done`; archive `ready`; next recommendation `archive`; blocked reasons empty.

### Issues Found

**CRITICAL**: None.

**WARNING**

1. Integrity before the authorized manifest cannot be proven cryptographically because the protected files were untracked and no earlier preimages were preserved.
2. Twenty-two files remain untracked. They were included in this verification, but ordinary `git diff` omits them and later delivery can accidentally exclude them.

**SUGGESTION**

1. Preserve the current candidate manifest or commit the intended assets before future integrity-sensitive transitions; do not infer untracked content from ordinary diffs.

### Residual Limitations

- The authorized manifest covers exactly nine protected paths, not the complete 23-file candidate.
- Filesystem mtime/ctime evidence is supportive, not cryptographic, and can be altered independently of content.
- No remote fetch was performed, so this report makes no claim about remote branch state or historical remote activity.
- No coverage metric exists because there is no test runner beyond the installation-free acceptance harness.

### Verdict

**PASS WITH WARNINGS**

All seven requirements and fourteen scenarios pass from the maintainer-authorized manifest baseline. No protected-path delta or acceptance failure was detected; warnings preserve the pre-baseline historical limitation and untracked-delivery risk.
