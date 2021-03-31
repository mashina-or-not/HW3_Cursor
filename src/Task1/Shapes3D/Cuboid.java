package Task1.Shapes3D;

import Task1.AbstractClass.SpaceShape;
import Task1.Vertex.Vertex3D;

import java.util.Arrays;

public class Cuboid extends SpaceShape {

    private final double width, height, depth;

    public Cuboid(Vertex3D a, double width, double height, double depth) {
        this.vertices = new Vertex3D[]{a};
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "vertices=" + Arrays.toString(vertices) +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                "}";
    }
}
