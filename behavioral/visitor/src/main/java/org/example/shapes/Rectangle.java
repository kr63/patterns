package org.example.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.visitor.Visitor;

@Getter
@AllArgsConstructor
public class Rectangle implements Shape {
    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }
}
