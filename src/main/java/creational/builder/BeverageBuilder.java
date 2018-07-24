package creational.builder;

public abstract class BeverageBuilder {

	private Beverage beverage;

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	public final Beverage buildBeverage(){
		Beverage beverage=createBeverage();
		setBeverage(beverage);
		setBeverageType();
		setWater();
		setMilk();
		setSugar();
		return beverage;
	}
	public abstract Beverage createBeverage();
	
	abstract void setBeverageType();
	
	abstract void setWater();
	
	abstract void setSugar();
	
	abstract void setMilk();
	
}
