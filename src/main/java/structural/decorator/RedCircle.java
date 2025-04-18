package structural.decorator;

/**
 * @author Milan Rathod
 */
public class RedCircle extends Circle {

    public RedCircle(Shape shape) {
        super(shape);
    }

    public String draw() {
        return shape.draw() + " with red color";
    }
}
