package behavioral.template;

/**
 * Concrete subclass of order for handling online orders
 *
 * @author Milan Rathod
 */
public class OnlineOrder extends Order {

    @Override
    protected void doDelivery() {
        System.out.println("Item is shipped through courier");
    }

    @Override
    protected void doPayment() {
        System.out.println("Online payment through Card/Netbanking/Wallets");
    }

    @Override
    protected void doSelect() {
        System.out.println("Item added to shopping cart");
        System.out.println("Get delivery address");
    }
}
