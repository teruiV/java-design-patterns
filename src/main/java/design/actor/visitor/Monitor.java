package design.actor.visitor;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
