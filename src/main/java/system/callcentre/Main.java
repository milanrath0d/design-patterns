package system.callcentre;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Milan Rathod
 */
public class Main {

    public static void main(String[] args) {
        CallManager callManager = new CallManager(4, 2);

        List<Customer> customerList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            customerList.add(new Customer("Customer-" + i));
        }

        customerList.forEach(customer -> {
            Call call = new Call(1, customer);
            callManager.handle(call);
        });
    }
}
