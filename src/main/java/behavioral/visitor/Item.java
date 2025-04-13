package behavioral.visitor;

/**
 * @author Milan Rathod
 */
public interface Item {

    int accept(ShoppingCartVisitor visitor);
}
