package Task1.Shapes3D;

import Task1.AbstractClass.SpaceShape;
import Task1.Vertex.Vertex3D;

import java.util.Arrays;

public class Sphere extends SpaceShape {

    private final double radius;

    public Sphere(Vertex3D a, double radius) {
        this.vertices = new Vertex3D[]{a};
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                ", area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                "}";
    }
}
