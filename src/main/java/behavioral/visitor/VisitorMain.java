package behavioral.visitor;

/**
 * Entry point for visitor design pattern
 *
 * @author Milan Rathod
 */
public class VisitorMain {

    public static void main(String[] args) {
        Item[] items = new Item[]{new Book("1234", 20), new Book("5678", 100),
                new Electronic("Earphone", 2000), new Electronic("Charger", 200)};

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(Item[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (Item item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
