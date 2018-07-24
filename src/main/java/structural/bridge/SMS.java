package structural.bridge;

public class SMS implements MessageSender {

	@Override
	public void sendMessage(String message) {
		System.out.println(message+" Sent via SMS");
		
	}

}
