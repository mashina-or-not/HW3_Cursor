package Task1.Shapes3D;

import Task1.AbstractClass.SpaceShape;
import Task1.Vertex.Vertex3D;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {

    private final double width, height;

    public SquarePyramid(Vertex3D a, double width, double height) {
        this.vertices = new Vertex3D[]{a};
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2) + 2 * width * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double getVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "vertices=" + Arrays.toString(vertices) +
                ", width=" + width +
                ", height=" + height +
                ", area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                "}";
    }
}
