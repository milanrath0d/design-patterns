package behavioral.chainofresponsibility2;

public class FiftyRsHandler extends RsHandler {

	@Override
	public void dispatchRS(int requestedAmount) {
		
		int amount=requestedAmount/50;
		if(amount>=1){
			System.out.println(amount+" 50's notes");
		}
		int remaingingAmount=requestedAmount%50;
		rsHandler.dispatchRS(remaingingAmount);
		
	}
	
	

	
	
}
