package design.actor.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by jianweilin on 2017/9/3.
 */
@Data
@AllArgsConstructor
public class SellStock {
    private String name;
    private Double price;
    private Integer count;

    public void sell(){
        System.out.println("stock [" + name + "]" + " sell: " + count + " price: " + price);
    }
}
