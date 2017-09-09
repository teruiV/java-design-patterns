package design.structor.flyweight;

import java.util.HashMap;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> cicleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) cicleMap.get(color);
        if(circle == null) {
            circle = new Circle(color);
            cicleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
