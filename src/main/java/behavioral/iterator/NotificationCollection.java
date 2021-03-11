package behavioral.iterator;

/**
 * Collections of notifications
 *
 * @author Milan Rathod
 */
public class NotificationCollection implements Collection<Notification> {

    private static final int MAX_ITEMS = 5;

    private int items = 0;

    private final Notification[] notifications;

    public NotificationCollection() {
        notifications = new Notification[MAX_ITEMS];
    }

    @Override
    public Iterator<Notification> iterator() {
        return new NotificationIterator(notifications);
    }

    @Override
    public void add(Notification notification) {
        if (items > MAX_ITEMS) {
            System.out.println("Collection is full");
        } else {
            notifications[items] = notification;
            items++;
        }
    }
}
