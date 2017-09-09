package design.structor.flyweight;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class Circle implements Shape {
    private String color;
    private Integer x;
    private Integer y;
    private Integer radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
