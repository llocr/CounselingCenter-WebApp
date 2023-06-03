package com.common.search;

public class SearchValue {
    private String value;

    public SearchValue() {
    }

    public SearchValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SeachValue{" +
                "value='" + value + '\'' +
                '}';
    }
}
