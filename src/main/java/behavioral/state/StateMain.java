package behavioral.state;

/**
 * Entry point for state design pattern
 *
 * @author Milan Rathod
 */
public class StateMain {

    public static void main(String[] args) {
        AtmMachine machine = new AtmMachine();
        machine.insertCard();
        machine.ejectCard();
        machine.setAtmMachineState(new HasCardState());
        machine.ejectCard();
        machine.insertCard();
        machine.ejectCard();

    }

}
