package behavioral.command;

public class SaveCommand implements Command {

	private WordDocument WordDocument;
	
	public SaveCommand(WordDocument wordDocument) {
		super();
		WordDocument = wordDocument;
	}


	public void execute() {
		WordDocument.save();

	}

}
