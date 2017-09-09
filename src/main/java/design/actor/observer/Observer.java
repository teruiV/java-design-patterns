package design.actor.observer;

/**
 * Created by jianweilin on 2017/9/9.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
