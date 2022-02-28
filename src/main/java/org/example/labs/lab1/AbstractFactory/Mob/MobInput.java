package org.example.labs.lab1.AbstractFactory.Mob;

import org.example.labs.lab1.AbstractFactory.Input;

public class MobInput implements Input {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void render() {
        System.out.println(String.format("render MobInput with value %s", value));
    }
}
