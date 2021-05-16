package shape.impl;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<Integer,Shape> shapeMap = new Hashtable<Integer,Shape>();

    public static Shape getShape(Integer shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(),circle);


        Rectangle rectangle = new Rectangle();
        rectangle.setId(2);
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
