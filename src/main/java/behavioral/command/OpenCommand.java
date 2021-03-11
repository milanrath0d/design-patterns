package behavioral.command;

/**
 * Open Command
 *
 * @author Milan Rathod
 */
public class OpenCommand implements Command {

    private final WordDocument wordDocument;

    public OpenCommand(WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    public void execute() {
        wordDocument.open();
    }

}
