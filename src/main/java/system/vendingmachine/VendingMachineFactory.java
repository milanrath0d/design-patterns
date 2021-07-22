package system.vendingmachine;

/**
 * @author Milan Rathod
 */
public class VendingMachineFactory {

    public static VendingMachine createVendingMachine() {
        return new VendingMachineImpl();
    }
}
