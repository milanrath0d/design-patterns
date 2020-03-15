package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker class
 *
 * @author Milan Rathod
 */
public class Caretaker {

    List<Originator.Memento> savedArticles = new ArrayList<>();

    public void addMemento(Originator.Memento memento) {
        savedArticles.add(memento);
    }

    public Originator.Memento getMemento(int index) {
        return savedArticles.get(0);
    }
}
