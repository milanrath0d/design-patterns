package creational.singleton;

/**
 * @author Milan Rathod
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        // Private Constructor
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void printSingleton() {
        System.out.println("Singleton" + singleton.toString());
    }
}
