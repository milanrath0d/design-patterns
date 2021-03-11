package behavioral.iterator;

/**
 * Generic Collection
 *
 * @author Milan Rathod
 */
public interface Collection<T> {

    Iterator<T> iterator();

    void add(T t);
}
