package design.actor.visitor;

/**
 * Created by jianweilin on 2017/9/9.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
