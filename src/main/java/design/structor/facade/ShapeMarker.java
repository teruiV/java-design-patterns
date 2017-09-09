package design.structor.facade;

/**
 * used HttpSession、HttpServletRequest、
 * HttpServletResponse、ExternalContext
 *
 * 好处: 定义了每个子系统级别的入口点,从而简化它们之间的依赖关系;
 * 对于客户端而言只有一个单一的依赖,即使我们对子系统的逻辑进行更改,对客户端也没有影响,增加了松耦合;
 *
 * Created by jianweilin on 2017/9/9.
 */
public class ShapeMarker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMarker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void draw(){
        circle.draw();
        rectangle.draw();
        square.draw();
    }

}
