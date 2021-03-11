package behavioral.visitor;

/**
 * @author Milan Rathod
 */
public class Electronic implements Item {

    private final String id;

    private final int price;

    public Electronic(String id, int price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
