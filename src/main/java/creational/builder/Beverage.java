package creational.builder;

public class Beverage {

	private int water;
	private int milk;
	private int sugar;
	private String bevarageName;
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public String getBevarageName() {
		return bevarageName;
	}
	public void setBevarageName(String bevarageName) {
		this.bevarageName = bevarageName;
	}
	@Override
	public String toString() {
		return "Beverage [water=" + water + ", milk=" + milk + ", sugar=" + sugar + ", bevarageName=" + bevarageName
				+ "]";
	}
	
	
}
