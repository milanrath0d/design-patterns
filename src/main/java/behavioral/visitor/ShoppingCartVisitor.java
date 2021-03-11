package behavioral.visitor;

/**
 * @author Milan Rathod
 */
public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Electronic electronic);

}
