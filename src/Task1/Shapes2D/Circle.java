package Task1.Shapes2D;

import Task1.AbstractClass.PlaneShape;
import Task1.Vertex.Vertex2D;

import java.util.Arrays;

public class Circle extends PlaneShape {

    private final double radius;

    public Circle(Vertex2D a, double radius) {
        this.vertices = new Vertex2D[]{a};
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                "}";
    }
}
