package flyweight.example.after;

class Factory {
    private Gazillion[] pool;

    Factory(int maxRows) {
        pool = new Gazillion[maxRows];
    }

    Gazillion getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Gazillion(row);
        }
        return pool[row];
    }
}
