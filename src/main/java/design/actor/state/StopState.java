package design.actor.state;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopState{}";
    }
}
