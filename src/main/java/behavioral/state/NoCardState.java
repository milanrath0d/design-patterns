package behavioral.state;

public class NoCardState implements AtmMachine {

	@Override
	public void insertCard() {
		System.out.println("Enter the Card");

	}

	@Override
	public void ejectCard() {
		System.out.println("Cannot Eject the card");

	}

}
