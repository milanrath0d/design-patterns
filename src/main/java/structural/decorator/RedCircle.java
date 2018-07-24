package structural.decorator;

public class RedCircle extends Circle {

	public RedCircle(Shape shape) {
		super(shape);
		
	}

	public String draw() {
		return shape.draw()+" Red Circle";

	}
}
