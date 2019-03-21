package org.example.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.visitor.Visitor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Dot implements Shape {
    private int id;
    private int x;
    private int y;

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }
}
