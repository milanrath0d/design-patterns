package system.vendingmachine;

/**
 * Vending Machine throws this exception to indicate that it doesn't have sufficient
 * change to complete this request.
 *
 * @author Milan Rathod
 */
public class NotSufficientChangeException extends RuntimeException {

    public NotSufficientChangeException(String message) {
        super(message);
    }

}
