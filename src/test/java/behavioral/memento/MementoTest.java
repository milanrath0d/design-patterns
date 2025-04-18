package behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for Memento Pattern implementation
 */
class MementoTest {

    @Test
    void testCreateFileWriter() {
        FileWriterUtil fileWriter = new FileWriterUtil("test.txt");
        
        // Initial content should be empty
        assertEquals("", fileWriter.toString());
    }
    
    @Test
    void testWriteContent() {
        FileWriterUtil fileWriter = new FileWriterUtil("test.txt");
        
        fileWriter.write("First line of content\n");
        
        assertEquals("First line of content\n", fileWriter.toString());
    }
    
    @Test
    void testSaveAndUndo() {
        FileWriterUtil fileWriter = new FileWriterUtil("test.txt");
        FileWriterCareTaker careTaker = new FileWriterCareTaker();
        
        // Write initial content
        fileWriter.write("First line of content\n");
        
        // Save the state
        careTaker.save(fileWriter);
        
        // Write more content
        fileWriter.write("Second line of content\n");
        
        // Content should include both lines
        assertEquals("First line of content\nSecond line of content\n", fileWriter.toString());
        
        // Undo to the saved state
        careTaker.undo(fileWriter);
        
        // Content should be back to just the first line
        assertEquals("First line of content\n", fileWriter.toString());
    }
    
    @Test
    void testMultipleSavePoints() {
        FileWriterUtil fileWriter = new FileWriterUtil("test.txt");
        FileWriterCareTaker careTaker1 = new FileWriterCareTaker();
        FileWriterCareTaker careTaker2 = new FileWriterCareTaker();
        
        // Write and save first line
        fileWriter.write("First line\n");
        careTaker1.save(fileWriter);
        
        // Write and save second line
        fileWriter.write("Second line\n");
        careTaker2.save(fileWriter);
        
        // Write third line without saving
        fileWriter.write("Third line\n");
        
        // Content should include all three lines
        assertEquals("First line\nSecond line\nThird line\n", fileWriter.toString());
        
        // Undo to the last saved state (after second line)
        careTaker2.undo(fileWriter);
        
        // Content should be back to just first and second lines
        assertEquals("First line\nSecond line\n", fileWriter.toString());
        
        // Undo to the first saved state
        careTaker1.undo(fileWriter);
        
        // Content should be back to just the first line
        assertEquals("First line\n", fileWriter.toString());
    }
} 