package structural.decorator;

public class Circle implements Shape {

	protected Shape shape;
	
	
	public Circle(Shape shape) {
		super();
		this.shape = shape;
	}



	public Shape getShape() {
		return shape;
	}



	public void setShape(Shape shape) {
		this.shape = shape;
	}


	public String draw() {
		return shape.draw();

	}
	

}
