package design.actor.interpreter;

/**
 * 模式: 解释者模式
 *
 * 描述: 定义语言的语法,并建立一个解释器来解释该语言的句子;
 *
 * 场景: 1. 将一个需要解释执行的语言中的句子表示为一个抽象树 2.一些重复出现的问题可以用一种简单的语言来表达;
 *
 * Created by jianweilin on 2017/9/9.
 */
public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

}
