package behavioral.visitor;

/**
 * @author Milan Rathod
 */
public class Book implements Item {

    private final String isbnNumber;

    private final int price;

    public Book(String isbnNumber, int price) {
        this.isbnNumber = isbnNumber;
        this.price = price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
