package Task1.Shapes2D;

import Task1.AbstractClass.PlaneShape;
import Task1.Vertex.Vertex2D;

import java.util.Arrays;

public class Triangle extends PlaneShape {
    private double ab;
    private double bc;
    private double ac;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        this.vertices = new Vertex2D[]{a, b, c};
    }

    @Override
    public double getArea() {
        double halfP = this.getPerimeter() / 2;
        return Math.sqrt(halfP * (halfP - ab) * (halfP - bc) * (halfP - ac));
    }

    @Override
    public double getPerimeter() {
        return ab + bc + ac;
    }

    private void TriangleDistance() {
        ab = vertices[0].getDistance(vertices[1]);
        bc = vertices[1].getDistance(vertices[2]);
        ac = vertices[2].getDistance(vertices[0]);
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "vertices=" + Arrays.toString(vertices) +
                ", ab=" + ab + ", bc=" + bc + ", ac=" + ac +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                "}";
    }
}
