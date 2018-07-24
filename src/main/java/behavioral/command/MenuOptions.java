package behavioral.command;

public class MenuOptions {

	private Command openCommand;
	private Command saveCommand;
	private Command closeCommand;
	
	public MenuOptions(Command openCommand, Command saveCommand, Command closeCommand) {
		super();
		this.openCommand = openCommand;
		this.saveCommand = saveCommand;
		this.closeCommand = closeCommand;
	}
	public void clickOpen(){
		openCommand.execute();
	}
	public void clickSave(){
		saveCommand.execute();
	}
	public void clickClose(){
		closeCommand.execute();
	}
	
}
