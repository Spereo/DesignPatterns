package org.example.labs.lab1.FactoryMethod;

public class MobDialog extends AbstractDialog {
    public Button getButton() {
        return new MobButton();
    }
}
