package design.actor.interpreter;

/**
 *
 * Created by jianweilin on 2017/9/9.
 */
public interface Expression {
    boolean interpret(String context);
}
