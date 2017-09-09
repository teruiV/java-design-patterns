package design.structor.composite;

/**
 * 模式: 组合模式
 *
 * A 和 B组合  B和C组合; 有点确实非常灵活,谁跟谁进行组合;
 * Created by jianweilin on 2017/9/6.
 */
public class ComsitePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("John","CEO",30000);
        Employee marking = new Employee("fang","market",20000);
        Employee sales = new Employee("John","sales",10000);
        ceo.add(marking);
        marking.add(sales);

        System.out.println(">>>> 组合一 >>>>>");
        ceo.getSubordinates().forEach(p -> System.out.println(p.toString()));

        System.out.println(">>>> 组合二 >>>>>");
        marking.getSubordinates().forEach(p -> System.out.println(p.toString()));

    }
}
