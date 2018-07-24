package behavioral.mediator;

public interface ChatMediator {

	void sendMessage(String message,User user);
	
	void registerUser(User user);
}
