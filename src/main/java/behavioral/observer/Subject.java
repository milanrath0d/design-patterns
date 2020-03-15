package behavioral.observer;

/**
 * Subject interface
 *
 * @author Milan Rathod
 */
public abstract class Subject {

    public abstract void register(Observer observer);

    public abstract void deRegister(Observer observer);

    public abstract void notifyObservers();

}
