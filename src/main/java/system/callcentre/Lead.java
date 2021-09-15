package system.callcentre;

/**
 * @author Milan Rathod
 */
public class Lead extends Employee {

    public Lead(String name, boolean free, CallManager callManager) {
        super(name, free, callManager);
        setRank(2);
    }

    public void escalateCall(Call call) {
        this.setFree(true);
        call.setRank(call.getRank() + 1);
        this.getCallManager().handle(call);
    }

}
