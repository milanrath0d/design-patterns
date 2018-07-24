package behavioral.mediator;

public class UserImpl extends User {
	
	
	public UserImpl(String name,ChatMediator chatMediator) {
		this.name=name;
		this.chatMediator=chatMediator;
	}

	@Override
	public void send(String message) {
		System.out.println(this.name+" Sending Message "+message);
		chatMediator.sendMessage(message, this);
		
	}

	@Override
	public void reciever(String message) {
		System.out.println(this.name+" Received Message "+message);
		
	}

}
