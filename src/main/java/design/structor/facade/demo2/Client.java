package design.structor.facade.demo2;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("OR123456");
        System.out.println("Order processing completed");
    }
}
