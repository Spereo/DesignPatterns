package org.example.labs.lab1.AbstractFactory;

public interface Checkbox {
    void render();
    Checkbox state(boolean state);
    boolean state();
}
