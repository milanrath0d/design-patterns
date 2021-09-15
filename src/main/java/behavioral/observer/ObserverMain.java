package behavioral.observer;

/**
 * Demo class for observer design pattern
 *
 * @author Milan Rathod
 */
public class ObserverMain {

    public static void main(String[] args) {
        Product product = new Product("TV", 25000, "Not available");

        Person karan = new Person("Karan");
        Person arjun = new Person("Arjun");

        product.register(karan);
        product.register(arjun);

        product.setAvailability("available");
    }

}
