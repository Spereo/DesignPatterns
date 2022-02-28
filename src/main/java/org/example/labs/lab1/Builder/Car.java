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

    public String toString(Car car) {
        String result = "Car type: " + car.getCarType() +
                "\nSeats: " + car.getSeats() +
                "\nCar Engine: " + "volume: " + car.getEngine().getVolume() + "\tmileage: " + car.getEngine().getMileage() +
                "\nCar Transmission: " + car.getTransmission() +
                "\nCar TripComputer: " + "fuel level: " + car.getFuel() + "\tstatus: " + (car.getEngine().isStarted() ? "Car is started" : "Car is not started") +
                "\nCar GpsNavigator: " + car.gpsNavigator().getRoute() + "\n";
        return result;
    }
}
