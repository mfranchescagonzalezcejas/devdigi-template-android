# Apply Progress: GitHub Template Baseline

**Mode**: Standard (strict TDD disabled; no test runner exists)
**Delivery**: One maintainer-authorized remediation work unit under the 400-line budget.

## Completed Tasks

- [x] 1.1 Confirmed the nine-file write allowlist and protected-file hashes before editing.
- [x] 1.2 Wrote temporary adoption and private vulnerability-reporting guidance.
- [x] 2.1 Replaced the minimal template README with public-safe orientation guidance.
- [x] 2.2 Added inspection-first agent and contributor guidance.
- [x] 3.1 Disabled blank issues without contact links.
- [x] 3.2 Added valid, public-safe bug and feature issue forms with 16 unique control IDs.
- [x] 3.3 Added the evidence-focused pull request template.
- [x] 4.1 Ran Ruby standard-library YAML and content contract assertions successfully.
- [x] 4.2 Ran safety, protected-hash, ignore-rule, and diff checks successfully.

## Authorized Remediation

- Repaired the invalid YAML nesting in `openspec/config.yaml` by introducing the `testing` mapping.
- Established the protected-file SHA-256 baseline below for future reproducible checks.

## Protected-File SHA-256 Manifest

<!-- protected-manifest:start -->
e7b904fa84e7b2833dba22d38f61e1536a620eb6e5950e3fa8cb6ea6bcdbaf5b  .gitignore
e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855  docs/architecture/.gitkeep
e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855  docs/decisions/.gitkeep
5d91c72284bfa077c713fc91f61a406eb3751c6ea9e57ba0059332721c30eaaf  openspec/config.yaml
e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855  openspec/specs/.gitkeep
e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855  openspec/changes/.gitkeep
e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855  openspec/changes/archive/.gitkeep
bd6133147521b57c3a6c0f673520ecc1ae9ff3676c8d26bca8236f747fafc2b7  openspec/changes/github-template-baseline/specs/repository-template-baseline/spec.md
822bac200968ad639984fda8ec8cca4d77a453787c9825680b205ec5258598d3  openspec/changes/github-template-baseline/design.md
<!-- protected-manifest:end -->

Recompute and compare with the standard utility:

```sh
awk '/^<!-- protected-manifest:start -->$/{in_manifest=1;next} /^<!-- protected-manifest:end -->$/{in_manifest=0} in_manifest && $1 ~ /^[0-9a-f]+$/ {print}' openspec/changes/github-template-baseline/apply-progress.md | sha256sum --check
```

This manifest proves future checks against this established baseline; it cannot retrospectively prove an earlier preimage that was not stored.

## Work Unit Evidence

| Evidence | Result |
|---|---|
| Focused test command and exact result | `ruby -ryaml -e 'YAML.safe_load_file("openspec/config.yaml"); puts "PASS yaml=openspec/config.yaml"'` exited `0` with `PASS yaml=openspec/config.yaml`; manifest verification command below exited `0` with `9` `OK` paths. |
| Runtime harness command/scenario and exact result | Native bounded SDD attempt `authorized YAML and protected-manifest remediation` began successfully. Its required `finish` call was rejected because the reset runtime has no review binding (`binding_revision: ""`), so runtime settlement is blocked despite the focused checks passing. |
| Rollback boundary | Revert `openspec/config.yaml` nesting correction and remove this apply-progress evidence artifact. |

```json
{"schema":"gentle-ai.remediation-result/v1","lineage_id":"sha256:c422cfeca0b1b7cc1375884cfd855a5a6358f237dec99bb8981b7e018c376bfe","generation":2,"fix_batch":"authorized-yaml-and-protected-manifest-remediation","failed_evidence_revision":"sha256:41652ac9754b249ae0a5e8924f05697aa5866e338cfc9a940511e11af91ca897","status":"blocked","changed_paths":["openspec/config.yaml","openspec/changes/github-template-baseline/apply-progress.md"],"blocker":"native finish requires a review binding, but the reset runtime reports binding_revision: empty"}
```
```json
{"schema":"gentle-ai.remediation-evidence/v1","lineage_id":"sha256:c422cfeca0b1b7cc1375884cfd855a5a6358f237dec99bb8981b7e018c376bfe","generation":2,"fix_batch":"authorized-yaml-and-protected-manifest-remediation","failed_evidence_revision":"sha256:41652ac9754b249ae0a5e8924f05697aa5866e338cfc9a940511e11af91ca897","focused_test_output_sha256":"sha256:e16aac85126d731b9c7b5a56bca0be98afbb849bc9da34993ae0f789589097c9","manifest_paths_verified":9,"runtime_action":"sdd-attempt begin succeeded; finish blocked by missing review binding"}
```
