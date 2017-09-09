package design.actor.template;

/**
 * 模式: 模板方法
 *
 * 场景: 模板方法在开始时可能不是一个明显的选择,使用该模式通常是发现有两个几乎相同的类在某些类似逻辑上工作时
 * 在这个阶段,就该考虑使用模板方法来清理代码了
 *
 * Created by jianweilin on 2017/9/9.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println(">>>>>>>>>>>>>>>>>> 万恶的分割线 >>>>>>>>>>>>>>>>>>");
        game = new Football();
        game.play();
    }
}
