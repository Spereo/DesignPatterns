package org.example.labs.lab1.FactoryMethod;

abstract class AbstractDialog implements Dialog {
    abstract Button getButton();

    public void render() {
        Button button = getButton();
        button.render();
    }
}
