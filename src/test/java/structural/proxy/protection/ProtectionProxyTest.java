package structural.proxy.protection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for Protection Proxy Pattern implementation
 */
class ProtectionProxyTest {

    @Test
    void testNonOwnerAccess() {
        Employee employee = new Employee("John", "USER");
        Folder folder = new ProxyFolder(employee);
        
        // Non-owner should be able to read
        assertDoesNotThrow(() -> folder.readAccess());
        
        // Non-owner should not be able to write (would log a message)
        assertDoesNotThrow(() -> folder.writeAccess());
    }
    
    @Test
    void testOwnerAccess() {
        Employee employee = new Employee("Admin", "ADMIN");
        Folder folder = new ProxyFolder(employee);
        
        // Owner should be able to read
        assertDoesNotThrow(() -> folder.readAccess());
        
        // Owner should be able to write
        assertDoesNotThrow(() -> folder.writeAccess());
    }
    
    @Test
    void testRealFolderImplementation() {
        Folder realFolder = new RealFolder();
        
        // Direct access to real folder should always work
        assertDoesNotThrow(() -> realFolder.readAccess());
        assertDoesNotThrow(() -> realFolder.writeAccess());
    }
} 