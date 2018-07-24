package structural.bridge;

public abstract class Message {

	protected MessageSender messageSender;
	
	public abstract void sendMessage(String message);
}
