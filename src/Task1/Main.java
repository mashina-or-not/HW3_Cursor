package Task1;

import Task1.AbstractClass.Shape;
import Task1.Shapes2D.Circle;
import Task1.Shapes2D.Rectangle;
import Task1.Shapes2D.Triangle;
import Task1.Shapes3D.Cuboid;
import Task1.Shapes3D.Sphere;
import Task1.Shapes3D.SquarePyramid;
import Task1.Vertex.Vertex2D;
import Task1.Vertex.Vertex3D;

public class Main {
    public static void main(String[] args) {
        Shape<?>[] shapes = new Shape[]{
                new Circle(new Vertex2D(5, 3), 7),
                new Rectangle(new Vertex2D(7, 10), 5, 5),
                new Triangle(new Vertex2D(4, 5), new Vertex2D(8, 12), new Vertex2D(3, 2)),
                new Cuboid(new Vertex3D(5, 8, 10), 5, 3, 6),
                new Sphere(new Vertex3D(4, 6, 7), 15),
                new SquarePyramid(new Vertex3D(5, 2, 3), 7, 9)
        };

        for (Shape<?> shape : shapes) {
            System.out.println(shape);
        }
    }
}
