package behavioral.iterator;

/**
 * Entry point for iterator design pattern
 *
 * @author Milan Rathod
 */
public class IteratorMain {

    public static void main(String[] args) {
        Collection<Notification> notificationCollection = new NotificationCollection();

        notificationCollection.add(new Notification("notification 1"));
        notificationCollection.add(new Notification("notification 2"));
        notificationCollection.add(new Notification("notification 3"));

        Iterator<Notification> iterator = notificationCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
