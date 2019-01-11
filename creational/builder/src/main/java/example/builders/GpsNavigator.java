package example.builders;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GpsNavigator {
    private String route;

    public GpsNavigator() {
        this.route = "221, Baker st. - London to Scotland";
    }
}
