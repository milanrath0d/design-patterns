package behavioral.command;

/**
 * Open Command
 *
 * @author Milan Rathod
 */
public class OpenCommand implements Command {

    private WordDocument WordDocument;

    public OpenCommand(WordDocument wordDocument) {
        super();
        WordDocument = wordDocument;
    }

    public void execute() {
        WordDocument.open();
    }

}
