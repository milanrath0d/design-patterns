package behavioral.command;

public class CommandDemo {

	public static void main(String[] args) {
		WordDocument wordDocument=new WordDocument();
		Command openCommand=new OpenCommand(wordDocument);
		Command saveCommand=new SaveCommand(wordDocument);
		Command closeCommand=new CloseCommand(wordDocument);
		MenuOptions menuOptions=new MenuOptions(openCommand, saveCommand, closeCommand);
		menuOptions.clickOpen();
		menuOptions.clickSave();
		menuOptions.clickClose();

	}

}
