package behavioral.visitor;

/**
 * @author Milan Rathod
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        // Apply Rs.5 discount if book price is greater than 50
        int cost = book.getPrice() > 50 ? book.getPrice() - 5 : book.getPrice();

        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);

        return cost;
    }

    @Override
    public int visit(Electronic electronic) {
        // Apply Rs.10 discount if book price is greater than 500
        int cost = electronic.getPrice() > 500 ? electronic.getPrice() - 10 : electronic.getPrice();

        System.out.println("Electronic with ID:" + electronic.getId() + " cost =" + cost);

        return cost;
    }
}
