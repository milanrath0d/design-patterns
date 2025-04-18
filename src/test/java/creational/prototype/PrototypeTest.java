package creational.prototype;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Prototype Pattern implementation
 */
class PrototypeTest {

    @Test
    void testCloning() {
        Employees employees = new Employees();
        employees.loadData();
        
        // Verify original data is loaded
        List<String> originalList = employees.getEmpList();
        assertEquals(4, originalList.size());
        
        // Clone the object
        Employees clonedEmployees = (Employees) employees.clone();
        List<String> clonedList = clonedEmployees.getEmpList();
        
        // Verify cloned data
        assertEquals(4, clonedList.size());
        assertEquals(originalList, clonedList);
        
        // Verify deep copy by modifying cloned list
        clonedList.add("Test5");
        
        // Original list should remain unchanged
        assertEquals(4, originalList.size());
        // Cloned list should have the new item
        assertEquals(5, clonedList.size());
    }
    
    @Test
    void testEmptyCloning() {
        Employees employees = new Employees();
        
        // Verify original data is empty
        List<String> originalList = employees.getEmpList();
        assertTrue(originalList.isEmpty());
        
        // Clone the object
        Employees clonedEmployees = (Employees) employees.clone();
        List<String> clonedList = clonedEmployees.getEmpList();
        
        // Verify cloned data is also empty
        assertTrue(clonedList.isEmpty());
        
        // Now load data in the original object
        employees.loadData();
        
        // Original list should have items
        assertEquals(4, originalList.size());
        // Cloned list should still be empty
        assertTrue(clonedList.isEmpty());
    }
}