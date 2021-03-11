package behavioral.mediator;

/**
 * Entry point for mediator design
 *
 * @author Milan Rathod
 */
public class MediatorMain {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User raj = new UserImpl("raj", chatMediator);
        User jia = new UserImpl("jia", chatMediator);
        User sushant = new UserImpl("sushant", chatMediator);

        raj.send("Hello Everybody!!");
    }

}
