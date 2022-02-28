package org.example.labs.lab1.AbstractFactory.Web;

import org.example.labs.lab1.AbstractFactory.Button;
import org.example.labs.lab1.AbstractFactory.Checkbox;
import org.example.labs.lab1.AbstractFactory.FormElementFactory;
import org.example.labs.lab1.AbstractFactory.Input;

public class WebFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new WebButton();
    }
    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }
    public Input createInput() {
        return new WebInput();
    }
}
