package behavioral.memento;

/**
 * Originator
 *
 * @author Milan Rathod
 */
public class FileWriterUtil {

    private String fileName;

    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.fileName = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undo(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    private static class Memento {

        private final String fileName;

        private final StringBuilder content;

        public Memento(String file, StringBuilder content) {
            this.fileName = file;
            // Notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
            this.content = new StringBuilder(content);
        }
    }
}
