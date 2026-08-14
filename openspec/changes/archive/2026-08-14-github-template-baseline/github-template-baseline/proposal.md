# Proposal: GitHub Template Baseline

## Intent

Create a reusable, public-safe repository baseline so DevDigi and external adopters begin with consistent governance, security guidance, and structured GitHub intake without inheriting a technology stack or product behavior.

## Scope

### In Scope
- Add neutral template documentation: `README.md`, `BOOTSTRAP.md`, `AGENTS.md`, `CONTRIBUTING.md`, and `SECURITY.md`.
- Add structured bug and feature issue forms, disable blank issues, and add a pull-request template.
- Require adopters to explicitly decide whether to add a license and, before publishing, define and test a private security-reporting channel.

### Out of Scope
- CI, GitHub Actions, Jenkins, Dependabot, hooks, packages, infrastructure, application code, and stack-specific tooling.
- Remote GitHub configuration, pushes, pull requests, and a default `LICENSE` file.

## Capabilities

### New Capabilities
- `repository-template-baseline`: Public-safe, technology-agnostic repository governance, security guidance, and structured GitHub contribution intake.

### Modified Capabilities
None. No existing capability specifications exist.

## Approach

Populate only the declared empty or missing documents and GitHub template files in English. Keep `.gitignore`, `.gitkeep` paths, and the OpenSpec bootstrap unchanged. Use placeholders rather than personal, organizational, or infrastructure data. `SECURITY.md` SHALL use `<SECURITY_CONTACT_OR_PRIVATE_CHANNEL>`; GitHub Security Advisories may be mentioned only as an adoption option, never as configured reporting infrastructure.

## Affected Areas

| Area | Impact | Description |
|------|--------|-------------|
| `README.md`, `BOOTSTRAP.md` | New/Modified | Adoption purpose, boundaries, and required pre-publication decisions. |
| `AGENTS.md`, `CONTRIBUTING.md`, `SECURITY.md` | Modified | Generic governance, contribution, and safe-reporting guidance. |
| `.github/ISSUE_TEMPLATE/`, `.github/pull_request_template.md` | Modified | Valid structured issue forms and PR evidence checklist. |

## Risks

| Risk | Likelihood | Mitigation |
|------|------------|------------|
| Placeholder security contact reaches publication | Med | BOOTSTRAP requires defining and testing a private channel before publishing. |
| Template becomes stack-coupled | Low | Limit content to generic policy and placeholders; exclude automation/tooling. |

## Rollback Plan

Revert the baseline-documentation and `.github` template commit. Since no remote settings, runtime behavior, or data migrations are introduced, rollback is isolated to repository files.

## Dependencies

- An adopter decision on licensing and a tested private security-reporting channel before public release.

## Success Criteria

- [ ] The baseline provides English, technology-agnostic governance, adoption, security, issue, and PR guidance.
- [ ] Blank GitHub issues are disabled and both supported issue types use valid structured forms.
- [ ] No default license, secret, personal data, stack tooling, automation, or remote GitHub change is introduced.
