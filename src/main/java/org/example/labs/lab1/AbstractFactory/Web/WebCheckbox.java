package org.example.labs.lab1.AbstractFactory.Web;

import org.example.labs.lab1.AbstractFactory.Checkbox;

public class WebCheckbox implements Checkbox {
    private boolean state;

    public void render() {
        System.out.println(String.format("render WebCheckbox with state %s", state));
    }

    public boolean state() {
        return state;
    }

    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
}
