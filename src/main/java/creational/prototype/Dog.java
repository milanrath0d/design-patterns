package creational.prototype;



public class Dog implements Animal {
	
	private String name;
	private String color;
	
	public Dog(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Animal clone(){
		Dog dog=null;
		try{
			dog=(Dog) super.clone();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	

}
