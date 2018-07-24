package structural.flyweight;

public class Circle implements Shape {

	private String color;
	
	public Circle(){
		
	}
	
	public Circle(String color) {
		super();
		this.color = color;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void draw() {
		System.out.println("Drawing with "+this.getColor()+" color");

	}
	

}
