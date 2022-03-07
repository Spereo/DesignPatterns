package org.example.labs.lab1.AbstractFactory.Web;

import org.example.labs.lab1.AbstractFactory.Button;

public class WebButton implements Button {
    public String render() {
        return "render WebButton";
    }
    public String onClick() {
        return "Event on click WebButton";
    }
}
