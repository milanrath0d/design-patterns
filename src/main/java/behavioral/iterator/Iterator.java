package behavioral.iterator;

/**
 * Custom iterator
 *
 * @author Milan Rathod
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
