package system.vendingmachine;

/**
 * The Vending Machine throws this exception if the user request for a product which is sold out
 *
 * @author Milan Rathod
 */
public class SoldOutException extends RuntimeException {

    public SoldOutException(String message) {
        super(message);
    }
}
