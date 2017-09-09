package design.structor.flyweight;

/**
 * 模式: 享元模式
 * 优点: 减少创建对象的数量 & 减少堆内存,提高性能
 * Created by jianweilin on 2017/9/9.
 */
public class FlyweightPatternDemo {
    private static final String COLORS[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for(int i=0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int)(Math.random()*COLORS.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
