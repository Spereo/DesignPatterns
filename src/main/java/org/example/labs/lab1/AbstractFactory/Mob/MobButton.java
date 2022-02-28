package org.example.labs.lab1.AbstractFactory.Mob;

import org.example.labs.lab1.AbstractFactory.Button;

public class MobButton implements Button {
    public void render() {
        System.out.println("render MobButton");
    }
    public void onClick() {
        System.out.println("Event on click MobButton");
    }
}
