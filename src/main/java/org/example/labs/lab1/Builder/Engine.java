package org.example.labs.lab1.Builder;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started = false;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() { started = true; }
    public void off() { started = false; }

    public boolean isStarted() { return started; }

    public double getVolume() { return volume; }
    public double getMileage() { return mileage; }
}
