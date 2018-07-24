package creational.builder;

public class Customer {

	public static void main(String[] args) {
		Beverage tea=Waiter.takeOrder("coffeee");
		System.out.println(tea);

	}

}
