package structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for Composite Pattern implementation
 */
class CompositeTest {

    @Test
    void testAddEmployeeToDirectory() {
        CompanyDirectory directory = new CompanyDirectory();
        Employee developer = new Developer("John");
        
        directory.addEmployee(developer);
        
        // Since we can't easily test the displayDetails() output, we're mainly
        // testing that the operations don't throw exceptions
        assertDoesNotThrow(() -> directory.displayDetails());
    }
    
    @Test
    void testRemoveEmployeeFromDirectory() {
        CompanyDirectory directory = new CompanyDirectory();
        Employee developer = new Developer("John");
        
        directory.addEmployee(developer);
        directory.removeEmployee(developer);
        
        assertDoesNotThrow(() -> directory.displayDetails());
    }
    
    @Test
    void testNestedDirectories() {
        CompanyDirectory engineeringDirectory = new CompanyDirectory();
        CompanyDirectory mainDirectory = new CompanyDirectory();
        
        Employee developer1 = new Developer("John");
        Employee developer2 = new Developer("Jane");
        Employee manager = new Manager("Mike");
        
        engineeringDirectory.addEmployee(developer1);
        engineeringDirectory.addEmployee(developer2);
        engineeringDirectory.addEmployee(manager);
        
        mainDirectory.addEmployee(engineeringDirectory);
        
        assertDoesNotThrow(() -> mainDirectory.displayDetails());
    }
    
    @Test
    void testDeveloperDetails() {
        Employee developer = new Developer("John");
        
        assertDoesNotThrow(() -> developer.displayDetails());
    }
    
    @Test
    void testManagerDetails() {
        Employee manager = new Manager("Mike");
        
        assertDoesNotThrow(() -> manager.displayDetails());
    }
} 