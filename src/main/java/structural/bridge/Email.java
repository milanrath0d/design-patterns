package structural.bridge;

public class Email implements MessageSender {

	

	@Override
	public void sendMessage(String message) {
		System.out.println(message+" Sent via Email");
		
	}

}
