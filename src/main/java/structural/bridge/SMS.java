package structural.bridge;

/**
 * Concrete implementation 2 for bridge pattern
 *
 * @author Milan Rathod
 */
public class SMS implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " Sent via SMS");
    }

}
