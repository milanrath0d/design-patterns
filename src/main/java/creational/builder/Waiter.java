package creational.builder;

public class Waiter {
	

	private Waiter() {
	
	}
	public static Beverage takeOrder(String beverageType){
		BeverageBuilder beverageBuilder=null;
		if(beverageType.equalsIgnoreCase("coffee")){
			beverageBuilder=new CoffeeBuilder();
		}
		else if(beverageType.equalsIgnoreCase("tea")){
			beverageBuilder=new TeaBuilder();
		}
		else{
			System.out.println("Sorry we are not taking order for "+beverageType);
			return null;
		}
		return beverageBuilder.buildBeverage();
	}
	

	
	
}
