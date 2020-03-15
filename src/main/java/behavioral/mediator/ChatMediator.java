package behavioral.mediator;

/**
 * Chat mediator for communication between multiple users
 *
 * @author Milan Rathod
 */
public interface ChatMediator {

    void sendMessage(String message, User user);

    void registerUser(User user);

}
