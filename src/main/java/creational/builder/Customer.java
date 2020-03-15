package creational.builder;

/**
 * @author Milan Rathod
 */
public class Customer {

    public static void main(String[] args) {
        Beverage coffee = Waiter.takeOrder("coffee");
        System.out.println(coffee);
    }

}
