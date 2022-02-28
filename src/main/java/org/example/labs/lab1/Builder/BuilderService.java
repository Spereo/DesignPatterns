package org.example.labs.lab1.Builder;

public class BuilderService {
    public void execute() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());
        Car car = builder.getResult();
        System.out.println(car.toString(car));

        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.8, 5000));
        builder.setTransmission(Transmission.SINGLE_SPEED);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator("office, home"));
        Car car1 = builder.getResult();
        System.out.println(car1.toString(car1));

        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.0, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator("grandma, home"));
        Car car2 = builder.getResult();
        System.out.println(car2.toString(car2));
    }
}
