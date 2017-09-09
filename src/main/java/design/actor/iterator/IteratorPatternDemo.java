package design.actor.iterator;

/**
 * 模式: 迭代器模式
 *
 * 场景: 需要遍历整个集合的元素
 * Created by jianweilin on 2017/9/9.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for(Iterator iter = nameRepository.getIterator();iter.hasNext();) {
            String name = (String)iter.next();
            System.out.println("Name: " + name);
        }
    }
}
