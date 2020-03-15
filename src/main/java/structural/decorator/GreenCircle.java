package structural.decorator;

/**
 * @author Milan Rathod
 */
public class GreenCircle extends Circle {

    public GreenCircle(Shape shape) {
        super(shape);
    }

    public String draw() {
        return shape.draw() + " Green Circle";
    }
}
