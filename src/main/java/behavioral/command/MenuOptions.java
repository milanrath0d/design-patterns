package behavioral.command;

/**
 * Invoker Class
 *
 * @author Milan Rathod
 */
public class MenuOptions {

    private final Command openCommand;

    private final Command saveCommand;

    private final Command closeCommand;

    public MenuOptions(Command openCommand, Command saveCommand, Command closeCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
        this.closeCommand = closeCommand;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }

    public void clickClose() {
        closeCommand.execute();
    }

}
