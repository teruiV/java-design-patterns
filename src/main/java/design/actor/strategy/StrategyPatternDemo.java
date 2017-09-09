package design.actor.strategy;

/**
 * 模式: 策略模式
 *
 * 描述: 策略模式提供了一种定义一系列算法的方式, 将每种算法封装为一个对象,在运行时可以随意切换;
 *
 * Created by jianweilin on 2017/9/9.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
