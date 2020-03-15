package behavioral.template;

/**
 * Abstract class which defined template method
 *
 * @author Milan Rathod
 */
public abstract class Order {

    public final void processOrder(boolean isGift) {

        // Select an item
        doSelect();

        // Make a payment
        doPayment();

        // Gift wrap order?
        if (isGift) {
            giftWrap();
        }

        // Deliver to customer or ship it
        doDelivery();
    }

    protected abstract void doDelivery();

    protected abstract void doPayment();

    protected abstract void doSelect();

    private void giftWrap() {
        System.out.println("Gift wrap done!");
    }

}
