package design.actor.command.improve;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 命令模式
 * Created by jianweilin on 2017/9/3.
 */
public class BootStrap {
    public static void main(String[] args) {
        BuyStock buyStock1 = new BuyStock(new Stock("fly",10.0d,100));
        SellStock sellStock1 = new SellStock(new Stock("momo",100.0d,200));
        List<Order> orders =  new LinkedList<>(Arrays.asList(buyStock1,sellStock1));
        Broker broker = new Broker(orders);
        broker.handleOrders();

        // 加仓
        BuyStock buyStock2 = new BuyStock(new Stock("Tencent",350.0d,100));
        broker.receiveOrder(buyStock2);
        broker.handleOrders();
    }
}
