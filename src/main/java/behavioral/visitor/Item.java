package behavioral.visitor;

/**
 * @author Milan Rathod
 */
public interface Item {

    public int accept(ShoppingCartVisitor visitor);
}
