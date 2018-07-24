package behavioral.chainofresponsibility2;

public class TenRsHandler extends RsHandler {

	@Override
	public void dispatchRS(int requestedAmount) {
		
		int amount=requestedAmount/10;
		
		if(amount>=1){
			System.out.println(amount+" 10's notes");
		}
		
	}
	
	

	
	
}
