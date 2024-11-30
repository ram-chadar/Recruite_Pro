package com.jbk.enums;

public enum UserRole {
    ADMIN("ADMIN"),
    COLLEGE("COLLEGE"),
    COMPANY("COMPANY");

    private final String value;

    UserRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
