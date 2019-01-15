package builder.example.builders;

import builder.example.cars.Car;
import builder.example.cars.Type;
import lombok.Setter;

@Setter
public class CarBuilder implements Builder {

    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    public Car getResults() {
        return new Car(type, seats, engine,
                transmission, tripComputer, gpsNavigator);
    }
}
