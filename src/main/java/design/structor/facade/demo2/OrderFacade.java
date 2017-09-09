package design.structor.facade.demo2;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class OrderFacade {
    private Payment payment = new Payment();
    private Inventory inventory = new Inventory();

    public void placeOrder(String orderId){
        String step1 = inventory.checkInventory(orderId);
        String step2 = payment.deductPayment(orderId);
        System.out.println("following steps completed: " + step1 + " & " + step2);
    }
}
