package adapter.example.square;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SquarePeg {
    private double width;

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
