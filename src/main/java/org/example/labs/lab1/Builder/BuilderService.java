package org.example.labs.lab1.Builder;

public class BuilderService {
    public void execute() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        Engine engine = new Engine(3.0, 0.0);
        engine.off();
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGpsNavigator(new GPSNavigator());
        Car car = builder.getResult();
        car.setFuel(100);
        builder.setTripComputer(new TripComputer(car));
        car = builder.getResult();
        System.out.println(car.toString());

        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        Engine engine1 = new Engine(1.8, 5000.0);
        engine1.on();
        builder.setEngine(engine1);
        builder.setTransmission(Transmission.SINGLE_SPEED);
        builder.setGpsNavigator(new GPSNavigator("office, home"));
        Car car1 = builder.getResult();
        builder.setTripComputer(new TripComputer(car1));
        car1 = builder.getResult();
        System.out.println(car1.toString());

        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.0, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GPSNavigator("grandma, home"));
        Car car2 = builder.getResult();
        builder.setTripComputer(new TripComputer(car2));
        car2 = builder.getResult();
        System.out.println(car2.toString());
    }
}
