package iterator.example.after;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class IntegerBox {
    private List<Integer> list = new ArrayList<>();

    void add(int in) {
        list.add(in);
    }

    Iterator getIterator() {
        return new Iterator(this);
    }

    class Iterator {
        private IntegerBox box;
        private java.util.Iterator iterator;
        private int value;

        Iterator(IntegerBox integerBox) {
            box = integerBox;
        }

        void first() {
            iterator = box.list.iterator();
            next();
        }

        void next() {
            try {
                value = (Integer) iterator.next();
            } catch (NoSuchElementException ex) {
                value = -1;
            }
        }

        boolean isDone() {
            return value == -1;
        }

        int currentValue() {
            return value;
        }
    }
}
