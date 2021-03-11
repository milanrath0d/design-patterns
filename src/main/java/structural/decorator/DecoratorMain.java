package structural.decorator;

/**
 * Entry point for decorator design pattern
 *
 * @author Milan Rathod
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Shape shape = new SimpleCircle();

        System.out.println(shape.draw());

        System.out.println(new GreenCircle(shape).draw());
    }

}
