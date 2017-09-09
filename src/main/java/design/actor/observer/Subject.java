package design.actor.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }
}
