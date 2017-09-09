package design.actor.command.improve;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * Created by jianweilin on 2017/9/3.
 */
@Data
@AllArgsConstructor
public class BuyStock implements Order {
    private Stock buyStock;

    @Override
    public void execute() {
        buyStock.buy();
    }
}
