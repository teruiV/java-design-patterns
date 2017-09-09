package design.actor.command.improve;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * Created by jianweilin on 2017/9/3.
 */
@Data
@AllArgsConstructor
public class SellStock implements Order {
    private Stock sellStock;

    @Override
    public void execute() {
        sellStock.sell();
    }
}
