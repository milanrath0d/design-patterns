package behavioral.mediator;

public abstract class User {

	protected ChatMediator chatMediator;
	
	protected String name;
	
	public abstract void send(String message);
	
	public abstract void reciever(String message);
}
