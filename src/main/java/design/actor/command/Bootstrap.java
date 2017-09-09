package design.actor.command;

/**
 * 模式: 命令模式
 * Created by jianweilin on 2017/9/3.
 */
public class Bootstrap {
    public static void main(String[] args) {
        BuyStock buy = new BuyStock("fly",10.0d,100);
        SellStock sell = new SellStock("momo",57.0d,200);
        buy.buy();
        sell.sell();
    }
}
