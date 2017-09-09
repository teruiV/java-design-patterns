package design.actor.command.improve;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * 命令调用
 * Created by jianweilin on 2017/9/3.
 */
@Data
@AllArgsConstructor
public class Broker {
    private List<Order> orders = new LinkedList<>();

    public void receiveOrder(Order order){
        orders.add(order);
    }

    public void handleOrders(){
        orders.forEach(order -> order.execute());
        orders.clear();
    }

}
