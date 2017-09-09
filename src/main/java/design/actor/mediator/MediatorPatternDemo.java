package design.actor.mediator;

/**
 * 模式: 中介者模式
 *
 * 描述: 提供一个中介类,处理不同类之间的所有通信,并支持松散耦合轻松维护代码;
 *
 * JMS为中介者模式的变体
 * Created by jianweilin on 2017/9/9.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
