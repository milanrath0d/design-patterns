package creational.singleton;

/**
 * Entry point for singleton design pattern
 *
 * @author Milan Rathod
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
    }

}
