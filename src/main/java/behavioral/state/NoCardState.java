package behavioral.state;

/**
 * @author Milan Rathod
 */
public class NoCardState implements AtmMachineState {

    @Override
    public void insertCard() {
        System.out.println("Insert the Card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Cannot Eject the card");
    }

}
