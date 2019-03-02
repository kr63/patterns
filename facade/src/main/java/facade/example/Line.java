package facade.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Line {
    private Point o;
    private Point e;

    void move(int x, int y) {
        o.move(x, y);
        e.move(x, y);
    }

    void rotate(int angle) {
        e.rotate(angle, o);
    }

    public String toString() {
        return "origin is " + o + ", end is " + e;
    }
}
