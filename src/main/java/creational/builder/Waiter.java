package creational.builder;

/**
 * @author Milan Rathod
 */
public class Waiter {

    private Waiter() {
        // Private Constructor
    }

    public static Beverage takeOrder(String beverageType) {
        BeverageBuilder beverageBuilder;
        if (beverageType.equalsIgnoreCase("coffee")) {
            beverageBuilder = new CoffeeBuilder();
        } else if (beverageType.equalsIgnoreCase("tea")) {
            beverageBuilder = new TeaBuilder();
        } else {
            System.out.println("Sorry we are not taking order for " + beverageType);
            return null;
        }
        return beverageBuilder.buildBeverage();
    }

}
