package creational.abstractfactory;

/**
 * @author Milan Rathod
 */
public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
