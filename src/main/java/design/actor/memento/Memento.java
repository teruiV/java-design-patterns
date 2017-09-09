package design.actor.memento;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
