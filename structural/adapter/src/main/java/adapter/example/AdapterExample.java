package adapter.example;

import adapter.example.adapters.SquarePegAdapter;
import adapter.example.round.RoundHole;
import adapter.example.round.RoundPeg;
import adapter.example.square.SquarePeg;

public class AdapterExample {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (hole.fits(roundPeg)) {
            System.out.println("Round peg fits round hole");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("Small square peg fits round hole");
        }
        if (!hole.fits(largeSquarePegAdapter)) {
            System.out.println("Large square peg doesn't fits round hole");
        }
    }
}
