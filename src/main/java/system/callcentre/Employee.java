package system.callcentre;

/**
 * @author Milan Rathod
 */
public abstract class Employee {

    private String name;

    private int rank;

    private boolean free;

    private final CallManager callManager;

    public Employee(String name, boolean free, CallManager callManager) {
        this.name = name;
        this.free = free;
        this.callManager = callManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public CallManager getCallManager() {
        return callManager;
    }

    public void receiveCall(Call call) {
        this.free = false;
        System.out.println("Call received by employee " + this.name + " for customer " +
                call.getCustomer().getName());
    }

    public void endCall(Call call) {
        System.out.println("Call ended by employee " + this.name + " for customer " +
                call.getCustomer().getName());
        this.free = true;
        callManager.end();
    }

}
