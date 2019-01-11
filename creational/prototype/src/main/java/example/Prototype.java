package example;

import example.shapes.Circle;
import example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects!");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + "; And they are identical!");
                } else {
                    System.out.println(i + ": but they are not identical");
                }
            } else {
                System.out.println(i + ": Shape objects are the same!");
            }
        }
    }
}
