package design.actor.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by jianweilin on 2017/9/3.
 */
@Data
@AllArgsConstructor
public class BuyStock {
    private String name;
    private Double price;
    private Integer count;

    public void buy(){
        System.out.println("stock [" + name + "]" + " buy:" + count + " price: " + price);
    }


}
