package example.builders;

import example.cars.Manual;
import example.cars.Type;
import lombok.Setter;

@Setter
public class CarManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    public Manual getResult() {
        return new Manual(type, seats, engine,
                transmission, tripComputer, gpsNavigator);
    }

}
