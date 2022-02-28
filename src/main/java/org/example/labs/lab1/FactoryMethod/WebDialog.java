package org.example.labs.lab1.FactoryMethod;

public class WebDialog extends AbstractDialog {
    public Button getButton() {
        return new WebButton();
    }
}
