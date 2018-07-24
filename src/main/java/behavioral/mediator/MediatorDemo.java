package behavioral.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		
		ChatMediator chatMediator=new ChatMediatorImpl();
		User raj=new UserImpl("dave", chatMediator);
		User jia=new UserImpl("jia", chatMediator);
		User sushant=new UserImpl("sushant", chatMediator);
		
		chatMediator.registerUser(raj);chatMediator.registerUser(jia);chatMediator.registerUser(sushant);
		
		raj.send("Hello Everybody");

	}

}
