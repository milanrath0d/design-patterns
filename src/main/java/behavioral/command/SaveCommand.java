package behavioral.command;

/**
 * Save command
 *
 * @author Milan Rathod
 */
public class SaveCommand implements Command {

    private final WordDocument wordDocument;

    public SaveCommand(WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    public void execute() {
        wordDocument.save();
    }

}
