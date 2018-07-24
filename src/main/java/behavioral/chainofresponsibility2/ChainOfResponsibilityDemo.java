package behavioral.chainofresponsibility2;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		HunderdRsHandler hunderdRsHandler=new HunderdRsHandler();
		FiftyRsHandler fiftyRsHandler=new FiftyRsHandler();
		TwentyRsHandler twentyRsHandler=new TwentyRsHandler();
		TenRsHandler tenRsHandler=new TenRsHandler();
		
		hunderdRsHandler.nextHandler(fiftyRsHandler);
		fiftyRsHandler.nextHandler(twentyRsHandler);
		twentyRsHandler.nextHandler(tenRsHandler);
		
		hunderdRsHandler.dispatchRS(430);
		
		
	}

}
