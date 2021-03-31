package Task1.AbstractClass;

import Task1.Interfaces.AreaMeasurable;
import Task1.Vertex.Vertex2D;

public abstract class Shape<T extends Vertex2D> implements AreaMeasurable {
    protected T[] vertices;
}
