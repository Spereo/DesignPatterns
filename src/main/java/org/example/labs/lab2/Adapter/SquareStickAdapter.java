package org.example.labs.lab2.Adapter;

class SquareStickAdapter extends RoundStick {
    private SquareStick stick;

    //конструктор
    public SquareStickAdapter(SquareStick stick) { this.stick = stick; }

    public int getRadius() {
        return (int) (stick.getWidth() * Math.sqrt(2)/2);
    }
}
