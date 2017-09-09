package design.actor.strategy;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class OperationMultiply implements Strategy{
    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        return num1 * num2;
    }
}
