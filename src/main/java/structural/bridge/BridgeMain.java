package structural.bridge;

import java.util.Scanner;

/**
 * Entry point for bridge design pattern
 *
 * @author Milan Rathod
 */
public class BridgeMain {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Input message length(short/long): ");
        String messageType = sn.next();
        System.out.print("Message: ");
        String message = sn.next();

        if (messageType.equalsIgnoreCase("LONG")) {
            Message longMessage = new LongMessage(new Email());
            longMessage.sendMessage(message);
        } else {
            Message shortMessage = new ShortMessage(new SMS());
            shortMessage.sendMessage(message);
        }
    }

}
