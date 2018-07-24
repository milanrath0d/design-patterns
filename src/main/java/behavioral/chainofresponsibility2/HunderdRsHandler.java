package behavioral.chainofresponsibility2;

public class HunderdRsHandler extends RsHandler {

	@Override
	public void dispatchRS(int requestedAmount) {
		
		int amount=requestedAmount/100;
		
		if(amount>=1){
			System.out.println(amount+" 100's notes");
		}
		int remaingingAmount=requestedAmount%100;
		rsHandler.dispatchRS(remaingingAmount);
		
	}
	
	

	
	
}
