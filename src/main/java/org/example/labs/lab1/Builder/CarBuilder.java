package org.example.labs.lab1.Builder;

class CarBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType carType) { this.carType = carType; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public void setTransmission(Transmission transmission) { this.transmission = transmission; }
    public void setTripComputer(TripComputer tripComputer) { this.tripComputer = tripComputer; }
    public void setGpsNavigator(GPSNavigator gpsNavigator) { this.gpsNavigator = gpsNavigator; }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
