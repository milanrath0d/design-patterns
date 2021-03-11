package behavioral.command;

/**
 * Close command
 *
 * @author Milan Rathod
 */
public class CloseCommand implements Command {

    private final WordDocument wordDocument;

    public CloseCommand(WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    public void execute() {
        wordDocument.close();
    }

}
