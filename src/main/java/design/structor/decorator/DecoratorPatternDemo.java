package design.structor.decorator;

/**
 * 装饰者模式
 * Created by jianweilin on 2017/9/6.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCicle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("cicle of red border");
        redCicle.draw();

        System.out.println("rectangle of red border");
        redRectangle.draw();
    }
}
