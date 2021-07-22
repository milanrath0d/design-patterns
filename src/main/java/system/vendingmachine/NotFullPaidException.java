package system.vendingmachine;

/**
 * An Exception thrown by Vending Machine when a user tries to collect an item,
 * without paying the full amount.
 *
 * @author Milan Rathod
 */
public class NotFullPaidException extends RuntimeException {

    private final long remaining;

    public NotFullPaidException(String message, long remaining) {
        super(message);
        this.remaining = remaining;
    }

    public long getRemaining() {
        return remaining;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + remaining;
    }
}
