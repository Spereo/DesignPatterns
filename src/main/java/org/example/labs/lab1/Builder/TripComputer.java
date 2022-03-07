package org.example.labs.lab1.Builder;

public class TripComputer {
    private Car car;

    public TripComputer(Car car) { this.car = car; }

    public String showFuelLevel() {
        return ("" + car.getFuel());
    }

    public String showStatus() {
        if (car.getEngine().isStarted()) {
            return "Car is started";
        } else {
            return "Car is not started";
        }
    }
}
