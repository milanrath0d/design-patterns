package behavioral.mediator;

/**
 * @author Milan Rathod
 */
public abstract class User {

    protected ChatMediator chatMediator;

    protected String name;

    public abstract void send(String message);

    public abstract void receiver(String message);

}
