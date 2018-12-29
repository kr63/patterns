package example.builders;

import example.cars.Type;

public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GpsNavigator gpsNavigator);
}
