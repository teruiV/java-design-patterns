package design.actor.state;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
