package creational.abstractfactory;

/**
 * @author Milan Rathod
 */
public interface AbstractFactory<T> {

    T create(String type);
}
