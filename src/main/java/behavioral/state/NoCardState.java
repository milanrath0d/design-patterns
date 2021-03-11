package behavioral.state;

/**
 * @author Milan Rathod
 */
public class NoCardState implements AtmMachineState {

    @Override
    public void insertCard() {
        System.out.println("Insert the card!!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Cannot eject the card!!");
    }

}
