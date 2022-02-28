package org.example.labs.lab1.AbstractFactory.Mob;

import org.example.labs.lab1.AbstractFactory.Checkbox;

public class MobCheckbox implements Checkbox {
    private boolean state;

    public void render() {
        System.out.println(String.format("render MobCheckbox with state %s", state));
    }

    public boolean state() {
        return state;
    }

    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
}
