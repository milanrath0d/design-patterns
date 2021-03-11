package behavioral.state;

/**
 * @author Milan Rathod
 */
public class HasCardState implements AtmMachineState {

    @Override
    public void insertCard() {
        System.out.println("Cannot insert the card!!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Remove the card!!");
    }

}
