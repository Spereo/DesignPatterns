package org.example.labs.lab1.Builder;

class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(
            CarType carType,
            int seats,
            Engine engine,
            Transmission transmission,
            TripComputer tripComputer,
            GPSNavigator gpsNavigator
    ) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() { return carType; }
    public int getSeats() { return seats; }
    public Engine getEngine() { return engine; }
    public Transmission getTransmission() { return transmission; }
    public TripComputer getTripComputer() { return tripComputer; }
    public GPSNavigator gpsNavigator() { return  gpsNavigator; }
    public double getFuel() { return fuel; }

    public void setFuel(double fuel) { this.fuel = fuel; }

    public String toString() {
        return "Car type: " + this.getCarType() +
                "\nSeats: " + this.getSeats() +
                "\nCar Engine: " + "volume: " + this.getEngine().getVolume() +
                    "\tmileage: " + this.getEngine().getMileage() +
                "\nCar Transmission: " + this.getTransmission() +
                "\nCar TripComputer: " + "fuel level: " + this.getTripComputer().showFuelLevel() +
                    "\tstatus: " + this.getTripComputer().showStatus() +
                "\nCar GpsNavigator: " + this.gpsNavigator().getRoute() + "\n";
    }
}
