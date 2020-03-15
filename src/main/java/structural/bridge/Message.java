package structural.bridge;

/**
 * Abstraction in bridge design pattern
 *
 * @author Milan Rathod
 */
public abstract class Message {

    protected MessageSender messageSender;

    public abstract void sendMessage(String message);
}
