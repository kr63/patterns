package iterator.example.before;

import java.util.ArrayList;
import java.util.List;

class IntegerBox {
    private final List<Integer> list = new ArrayList<>();

    void add(int in) {
        list.add(in);
    }

    List getData() {
        return list;
    }
}
