package design.actor.command.improve;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * å
 * Created by jianweilin on 2017/9/3.
 */
@Data
@AllArgsConstructor
public class Stock {
    private String name;
    private Double price;
    private Integer count;

    public void buy() {
        System.out.println("buy stock["+name+"]" + " count:" + count + " price:" + price);
    }

    public void sell() {
        System.out.println("sell stock["+name+"]" + " count:" + count + " price:" + price);
    }
}
