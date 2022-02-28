package org.example.labs.lab1.AbstractFactory.Web;

import org.example.labs.lab1.AbstractFactory.Button;

public class WebButton implements Button {
    public void render() {
        System.out.println("render WebButton");
    }
    public void onClick() {
        System.out.println("Event on click WebButton");
    }
}
