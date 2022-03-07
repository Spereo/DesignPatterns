package org.example.labs.lab1.Builder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestBuilder {
    @Test
    public void test() {
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

        String expectedMessage = "Car type: " + CarType.SPORTS_CAR +
                "\nSeats: 2" +
                "\nCar Engine: " + "volume: 3.0" + "\tmileage: 0.0"  +
                "\nCar Transmission: " + Transmission.SEMI_AUTOMATIC +
                "\nCar TripComputer: " + "fuel level: 100.0" + "\tstatus: Car is not started" +
                "\nCar GpsNavigator: Dare to dream" + "\n";
        String message = car.toString();

        assertEquals(expectedMessage, message);


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

        expectedMessage = "Car type: " + CarType.CITY_CAR +
                "\nSeats: 4" +
                "\nCar Engine: " + "volume: 1.8" + "\tmileage: 5000.0"  +
                "\nCar Transmission: " + Transmission.SINGLE_SPEED +
                "\nCar TripComputer: " + "fuel level: 0.0" + "\tstatus: Car is started" +
                "\nCar GpsNavigator: office, home" + "\n";
        message = car1.toString();

        assertEquals(expectedMessage, message);
    }
}
