package behavioral.command;

/**
 * Class representing virtual word document and it's operations
 * <p>
 * Receiver class
 *
 * @author Milan Rathod
 */
public class WordDocument {

    public void open() {
        System.out.println("Document opened");
    }

    public void save() {
        System.out.println("Document saved");
    }

    public void close() {
        System.out.println("Document closed");
    }
}
