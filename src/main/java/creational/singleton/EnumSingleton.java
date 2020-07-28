package creational.singleton;

/**
 * Singleton using Enum
 *
 * @author Milan Rathod
 */
public enum EnumSingleton {
    INSTANCE;

    public void show() {
        System.out.println("Singleton using Enum in Java");
    }
}
