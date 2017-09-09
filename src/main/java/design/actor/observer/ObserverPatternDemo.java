package design.actor.observer;

/**
 * 模式: 观察者模式
 *
 * 场景: 1. 如果你有一个对象需要与他们共享状态,而不知道这些对象是谁,那么观察者就是你需要的;
 *
 * 优点: 减少耦合;
 * Created by jianweilin on 2017/9/9.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        subject.notifyAllObservers();
        System.out.println("Second state change: 10");
        subject.setState(10);
        subject.notifyAllObservers();
    }
}
