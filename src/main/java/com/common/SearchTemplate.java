package com.common;

public class SearchTemplate {

    private String option;
    private String value;

    public SearchTemplate() {
    }

    public SearchTemplate(String option, String value) {
        this.option = option;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SearchTemplate{" +
                "option='" + option + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOption() {
        return option;
    }

    public String getValue() {
        return value;
    }
}
