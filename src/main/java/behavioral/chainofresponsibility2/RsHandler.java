package behavioral.chainofresponsibility2;

public abstract class RsHandler {

	protected RsHandler rsHandler;

	public void nextHandler(RsHandler rsHandler){
		this.rsHandler=rsHandler;
	}
	
	public abstract void dispatchRS(int requestedAmount);
}
