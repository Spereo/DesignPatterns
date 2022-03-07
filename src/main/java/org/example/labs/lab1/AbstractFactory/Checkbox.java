package org.example.labs.lab1.AbstractFactory;

public interface Checkbox {
    String render();
    Checkbox state(boolean state);
    boolean state();
}
