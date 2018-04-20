package com.design.pattern.filterpattern.util;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String value;

    Gender(String v){
        this.value = v;
    }

    public String getValue() {
        return value;
    }
}
