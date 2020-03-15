package behavioral.memento;

/**
 * Entry point for memento design pattern
 *
 * @author Milan Rathod
 */
public class MementoMain {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();

        originator.set("Article 1");
        originator.set("Article 2");

        caretaker.addMemento(originator.save());

        originator.set("Article 3");

        caretaker.addMemento(originator.save());

        originator.set("Article 4");

        originator.restore(caretaker.getMemento(1));
    }
}
