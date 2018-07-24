package behavioral.state;

public class HasCardState implements AtmMachine {

	@Override
	public void insertCard() {
		System.out.println("Cannot insert it the Card");

	}

	@Override
	public void ejectCard() {
		System.out.println("Remove the Card");

	}

}
