package org.example.labs.lab3.Iterator;

public class Item {
    private ItemType type;
    private final String name;

    public final void setType(ItemType type) { this.type = type; }

    public Item(ItemType type, String name) {
        this.setType(type);
        this.name = name;
    }

    public String toString() { return name; }
    public ItemType getType() { return type; }
}
