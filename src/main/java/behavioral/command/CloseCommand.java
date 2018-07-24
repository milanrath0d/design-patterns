package behavioral.command;

public class CloseCommand implements Command {

	private WordDocument WordDocument;
	
	
	public CloseCommand(WordDocument wordDocument) {
		super();
		WordDocument = wordDocument;
	}


	public void execute() {
		WordDocument.close();

	}

}
