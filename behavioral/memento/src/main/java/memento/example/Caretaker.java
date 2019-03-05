package memento.example;

import java.util.ArrayList;

class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    void addMemento(Memento m) {
        mementos.add(m);
    }

    Memento getMemento() {
        return mementos.get(1);
    }
}
