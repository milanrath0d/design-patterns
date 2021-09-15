package system.callcentre;

/**
 * @author Milan Rathod
 */
public class Fresher extends Employee {

    public Fresher(String name, boolean free, CallManager callManager) {
        super(name, free, callManager);
        setRank(1);
    }

    public void escalateCall(Call call) {
        this.setFree(true);
        call.setRank(call.getRank() + 1);
        this.getCallManager().handle(call);
    }
}
