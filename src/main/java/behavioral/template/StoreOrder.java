package behavioral.template;

/**
 * Concrete subclass of order for handling in store orders
 *
 * @author Milan Rathod
 */
public class StoreOrder extends Order {

    @Override
    protected void doDelivery() {
        System.out.println("Item handed to customer at counter");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment done at counter through CASH/POS");
    }

    @Override
    protected void doSelect() {
        System.out.println("Customer choose the item from the shelf");
    }
}
