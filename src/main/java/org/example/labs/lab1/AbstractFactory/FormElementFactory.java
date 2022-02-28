package org.example.labs.lab1.AbstractFactory;

public interface FormElementFactory {
    Button createButton();
    Checkbox createCheckbox();
    Input createInput();
}
