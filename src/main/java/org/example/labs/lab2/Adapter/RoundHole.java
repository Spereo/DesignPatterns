package org.example.labs.lab2.Adapter;

class RoundHole {
    private int radius;

    //конструктор
    public RoundHole(int radius) { this.radius = radius; }

    public int getRadius() { return radius; }

    public boolean fits(RoundStick stick) {
        return (this.getRadius() >= stick.getRadius());
    }
}
