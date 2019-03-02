package facade.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class PointPolar {
    private double radius;
    private double angle;

    void rotate(int angle) {
        this.angle += angle % 360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
