package org.example.labs.lab1.AbstractFactory.Mob;

import org.example.labs.lab1.AbstractFactory.Button;

public class MobButton implements Button {
    public String render() {
        return "render MobButton";
    }
    public String onClick() {
        return "Event on click MobButton";
    }
}
