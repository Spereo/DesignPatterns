package org.example.labs.lab1.AbstractFactory.Mob;

import org.example.labs.lab1.AbstractFactory.Button;
import org.example.labs.lab1.AbstractFactory.Checkbox;
import org.example.labs.lab1.AbstractFactory.FormElementFactory;
import org.example.labs.lab1.AbstractFactory.Input;

public class MobFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new MobButton();
    }
    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }
    public Input createInput() {
        return new MobInput();
    }
}
