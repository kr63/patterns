package adapter.example.adapters;

import adapter.example.round.RoundPeg;
import adapter.example.square.SquarePeg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2);
    }
}
