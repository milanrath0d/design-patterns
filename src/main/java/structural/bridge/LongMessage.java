package structural.bridge;

/**
 * Refined abstraction 1 in bridge pattern
 *
 * @author Milan Rathod
 */
public class LongMessage extends Message {

    public LongMessage(MessageSender messageSender) {
        super.messageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        messageSender.sendMessage(message);
    }

}
