package behavioral.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for Command Pattern implementation
 */
class CommandTest {

    @Test
    void testOpenCommand() {
        WordDocument document = new WordDocument();
        Command openCommand = new OpenCommand(document);
        
        assertDoesNotThrow(() -> openCommand.execute());
    }
    
    @Test
    void testSaveCommand() {
        WordDocument document = new WordDocument();
        Command saveCommand = new SaveCommand(document);
        
        assertDoesNotThrow(() -> saveCommand.execute());
    }
    
    @Test
    void testCloseCommand() {
        WordDocument document = new WordDocument();
        Command closeCommand = new CloseCommand(document);
        
        assertDoesNotThrow(() -> closeCommand.execute());
    }
    
    @Test
    void testMenuOptionsWithCommands() {
        WordDocument document = new WordDocument();
        Command openCommand = new OpenCommand(document);
        Command saveCommand = new SaveCommand(document);
        Command closeCommand = new CloseCommand(document);
        
        MenuOptions menuOptions = new MenuOptions(openCommand, saveCommand, closeCommand);
        
        // Testing each option
        assertDoesNotThrow(() -> menuOptions.clickOpen());
        assertDoesNotThrow(() -> menuOptions.clickSave());
        assertDoesNotThrow(() -> menuOptions.clickClose());
    }
} 