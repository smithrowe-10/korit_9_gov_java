package com.korit.study.ch26;

public enum Role {

    ADMIN("ROLE_ADMIN", "관리자");

    private String roleName;
    private String roleNameKor;

    Role(String roleName, String roleNameKor) {
        this.roleName = roleName;
        this.roleNameKor = roleNameKor;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleNameKor() {
        return roleNameKor;
    }
}
