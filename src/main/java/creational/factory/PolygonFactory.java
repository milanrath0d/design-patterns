package creational.factory;

/**
 * @author Milan Rathod
 */
public class PolygonFactory {

    public static Polygon getPolygon(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangle();
        } else if (numberOfSides == 4) {
            return new Square();
        }
        return null;
    }
}
