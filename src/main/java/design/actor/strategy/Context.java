package design.actor.strategy;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Integer executeStrategy(Integer num1, Integer num2) {
        return strategy.doOperation(num1,num2);
    }
}
