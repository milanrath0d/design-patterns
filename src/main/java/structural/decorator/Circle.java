package structural.decorator;

/**
 * @author Milan Rathod
 */
public class Circle implements Shape {

    protected Shape shape;

    public Circle(Shape shape) {
        super();
        this.shape = shape;
    }

    public String draw() {
        return shape.draw();
    }

}
