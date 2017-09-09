package design.actor.visitor;

/**
 * 模式: 访问者模式
 * Created by jianweilin on 2017/9/9.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
