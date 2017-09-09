package design.actor.visitor;

/**
 * Created by jianweilin on 2017/9/9.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}

