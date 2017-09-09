package design.actor.state;

/**
 * 1. 状态模式
 *
 * 应用场景: 1. 对象的行为受到状态的影响; 2. 复杂条件将对象的行为与状态相结合时;
 * Created by jianweilin on 2017/9/9.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
