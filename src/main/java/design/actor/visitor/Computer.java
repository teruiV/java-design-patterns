package design.actor.visitor;

/**
 * 模式: 访问者模式
 *
 * 描述: 封装某些作用于某种数据结构中各元素的操作,它可以在不改变数据结构的前提下定义作用于这些元素的新操作;
 *
 * 场景: 假如一个对象中存在着一些与本对象不想干的操作,为了避免这些操作污染这个对象,则可以使用访问者将这些操作封装到访问者中去。
 * Created by jianweilin on 2017/9/9.
 */
public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(),new Keyboard(),new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}
