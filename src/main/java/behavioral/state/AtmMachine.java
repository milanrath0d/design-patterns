package behavioral.state;

/**
 * @author Milan Rathod
 */
public class AtmMachine {

    private AtmMachineState atmMachineState;

    public AtmMachine() {
        atmMachineState = new NoCardState();
    }

    public void setAtmMachineState(AtmMachineState atmMachineState) {
        this.atmMachineState = atmMachineState;
    }

    public void insertCard() {
        atmMachineState.insertCard();
        if (atmMachineState instanceof NoCardState) {
            AtmMachineState machine = new HasCardState();
            setAtmMachineState(machine);
            System.out.println("State Changes :" + machine.getClass().getName());
        }
    }

    public void ejectCard() {
        atmMachineState.ejectCard();
        if (atmMachineState instanceof HasCardState) {
            AtmMachineState machine = new NoCardState();
            setAtmMachineState(machine);
            System.out.println("State Changes :" + machine.getClass().getName());
        }
    }

}
