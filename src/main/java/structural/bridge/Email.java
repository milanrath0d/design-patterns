package structural.bridge;

/**
 * concrete implementation 1 for bridge pattern
 *
 * @author Milan Rathod
 */
public class Email implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " Sent via Email");
    }

}
