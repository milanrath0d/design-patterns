package behavioral.iterator;

/**
 * Iterator for notifications
 *
 * @author Milan Rathod
 */
public class NotificationIterator implements Iterator<Notification> {

    private final Notification[] notifications;

    private int pos = 0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return pos < notifications.length && notifications[pos] != null;
    }

    @Override
    public Notification next() {
        return notifications[pos++];
    }
}
