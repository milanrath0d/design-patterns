package behavioral.iterator;

/**
 * Generic Collection
 *
 * @author Milan Rathod
 */
public interface Collection<T> {

    Iterator<T> createIterator();

    void add(T t);
}
