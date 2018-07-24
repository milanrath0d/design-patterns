package behavioral.state;

public class AtmMachineState implements AtmMachine {
	
	private AtmMachine atmMachine;
	
	

	public AtmMachine getAtmMachine() {
		return atmMachine;
	}
	public void setAtmMachine(AtmMachine atmMachine) {
		this.atmMachine = atmMachine;
	}
	@Override
	public void insertCard() {
		atmMachine.insertCard();
		if(atmMachine instanceof NoCardState){
			AtmMachine machine=new HasCardState();
			setAtmMachine(machine);
			System.out.println("State Changes :"+machine.getClass().getName());
		}
		
	}
	public AtmMachineState() {
		atmMachine=new NoCardState();
	}

	@Override
	public void ejectCard() {
		atmMachine.ejectCard();
		if(atmMachine instanceof HasCardState){
			AtmMachine machine=new NoCardState();
			setAtmMachine(machine);
			System.out.println("State Changes :"+machine.getClass().getName());
		}

	}

}
