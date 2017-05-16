package com.porcelani.services.component;

public enum Complexity {
    TOO_SHORT("Too Short"),
    VERY_WEAK("Very Weak"),
    WEAK("Weak"),
    GOOD("Good"),
    STRONG("Strong"),
    VERY_STRONG("Very Strong");

    public String complexity;

    Complexity(String value) {
        complexity = value;
    }

    public String getValue() {
        return complexity;
    }
}