package behavioral.visitor;

/**
 * @author Milan Rathod
 */
public interface Visitable {

    void accept(Visitor visitor);

}
