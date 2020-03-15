package behavioral.template;

/**
 * Entry point for template design pattern
 *
 * @author Milan Rathod
 */
public class TemplateMain {

    public static void main(String[] args) {
        Order storeOrder = new StoreOrder();

        storeOrder.processOrder(true);

        Order onlineOrder = new OnlineOrder();

        onlineOrder.processOrder(false);
    }
}
