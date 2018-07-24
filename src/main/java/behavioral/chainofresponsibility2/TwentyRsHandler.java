package behavioral.chainofresponsibility2;

public class TwentyRsHandler extends RsHandler {

	@Override
	public void dispatchRS(int requestedAmount) {
		
		int amount=requestedAmount/20;
		
		if(amount>=1){
			System.out.println(amount+" 20's notes");
		}
		int remaingingAmount=requestedAmount%20;
		rsHandler.dispatchRS(remaingingAmount);
		
	}
	
	

	
	
}
