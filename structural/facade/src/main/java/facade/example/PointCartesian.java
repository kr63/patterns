package facade.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
class PointCartesian {
    private double x;
    private double y;

    void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
