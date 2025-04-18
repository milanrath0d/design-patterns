package creational.abstractfactory;

/**
 * Factory related to colors
 *
 * @author Milan Rathod
 */
public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String type) {
        Color color = null;
        if ("Brown".equals(type)) {
            color = new Brown();
        } else if ("White".equals(type)) {
            color = new White();
        }
        return color;
    }
}
