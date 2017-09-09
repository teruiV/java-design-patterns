package design.actor.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
