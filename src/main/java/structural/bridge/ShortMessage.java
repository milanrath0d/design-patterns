package structural.bridge;

public class ShortMessage extends Message {
	
	

	public ShortMessage(MessageSender messageSender) {
		super.messageSender=messageSender;
		
	}

	@Override
	public void sendMessage(String message) {
		messageSender.sendMessage(message);

	}

}
