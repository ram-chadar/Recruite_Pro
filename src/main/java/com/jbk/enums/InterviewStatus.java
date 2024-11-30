package com.jbk.enums;

public enum InterviewStatus {
    SCHEDULED("Scheduled"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private final String value;

    InterviewStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
