package builder.example.cars;

import builder.example.builders.Engine;
import builder.example.builders.GpsNavigator;
import builder.example.builders.Transmission;
import builder.example.builders.TripComputer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type of Car: ").append(type).append("\n");
        sb.append("Count of seats: ").append(seats).append("\n");
        sb.append("Engine: volume - ").append(engine.getVolume())
                .append("; mileage - ").append(engine.getMileage())
                .append("\n");
        sb.append("Transmission: ").append(transmission).append("\n");

        if (this.tripComputer != null) sb.append("Trip Computer: Functional\n");
        else sb.append("Trip Computer: N/A\n");

        if (this.gpsNavigator != null) sb.append("GPS Navigator: Functional\n");
        else sb.append("GPS Navigator: N/A\n");

        return sb.toString();
    }
}
