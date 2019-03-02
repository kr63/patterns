package flyweight.example.before;

class Gazillion {
    private static int num = 0;
    private int row, col;

    Gazillion(int maxPerRow) {
        row = num / maxPerRow;
        col = num % maxPerRow;
        num++;
    }

    void report() {
        System.out.print(" " + row + col);
    }
}
