package structural.bridge;

/**
 * Refined abstraction 2 in bridge pattern
 *
 * @author Milan Rathod
 */
public class ShortMessage extends Message {

    public ShortMessage(MessageSender messageSender) {
        super.messageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        messageSender.sendMessage(message);
    }

}
