package org.example.labs.lab1.FactoryMethod;

abstract class AbstractDialog implements Dialog {
    abstract Button getButton();

    public String render() {
        Button button = getButton();
        return button.render();
    }
}
