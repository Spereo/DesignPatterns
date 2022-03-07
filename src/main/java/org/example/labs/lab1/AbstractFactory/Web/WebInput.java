package org.example.labs.lab1.AbstractFactory.Web;

import org.example.labs.lab1.AbstractFactory.Input;

public class WebInput implements Input {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String render() {
        return(String.format("render WebInput with value %s", value));
    }
}
