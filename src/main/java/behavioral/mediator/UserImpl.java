package behavioral.mediator;

/**
 * @author Milan Rathod
 */
public class UserImpl extends User {

    public UserImpl(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
        chatMediator.registerUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " SENT Message: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiver(String message) {
        System.out.println(this.name + " Received Message: " + message);
    }

}
