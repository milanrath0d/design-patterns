package behavioral.state;

public class StateDemo {

	public static void main(String[] args) {
		
		AtmMachine machine=new AtmMachineState();
		machine.ejectCard();
		machine.insertCard();
		
		
		machine.insertCard();
		machine.ejectCard();

	}

}
