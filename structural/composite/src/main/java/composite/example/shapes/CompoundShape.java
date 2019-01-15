package composite.example.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    protected List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(x, y, Color.BLACK);
        add(components);
    }

    public void add(Shape[] components) {
        children.addAll(Arrays.asList(components));
    }

    public void add(Shape component) {
        children.add(component);
    }

    public void remove(Shape child) {
        children.remove(child);
    }

    public void remove(Shape[] components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }
}
