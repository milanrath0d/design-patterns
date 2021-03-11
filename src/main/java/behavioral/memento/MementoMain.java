package behavioral.memento;

/**
 * Entry point for memento design pattern
 *
 * @author Milan Rathod
 */
public class MementoMain {

    public static void main(String[] args) {
        FileWriterCareTaker caretaker = new FileWriterCareTaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("test.txt");

        fileWriterUtil.write("First set of data\n");

        System.out.println(fileWriterUtil);

        caretaker.save(fileWriterUtil);

        fileWriterUtil.write("Second set of data\n");

        System.out.println(fileWriterUtil);

        caretaker.undo(fileWriterUtil);

        System.out.println(fileWriterUtil);
    }
}
