package system.callcentre;

/**
 * @author Milan Rathod
 */
public class Manager extends Employee {

    public Manager(String name, boolean free, CallManager callManager) {
        super(name, free, callManager);
        setRank(3);
    }
}
