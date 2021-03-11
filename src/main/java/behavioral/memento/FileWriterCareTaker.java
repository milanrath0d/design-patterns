package behavioral.memento;

/**
 * Caretaker class
 *
 * @author Milan Rathod
 */
public class FileWriterCareTaker {

    private Object object;

    public void save(FileWriterUtil fileWriterUtil) {
        this.object = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil) {
        fileWriterUtil.undo(object);
    }
}
