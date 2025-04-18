package system.callcentre;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Call Centre implementation
 */
public class CallManagerTest {

    private CallManager callManager;
    
    @BeforeEach
    void setUp() {
        // Initialize with 2 freshers, 1 lead
        callManager = new CallManager(2, 1);
    }
    
    @Test
    void testGetFreeEmployeeForRank1() {
        // Should return a fresher for rank 1 calls
        Employee employee = callManager.getFreeEmployee(1);
        
        assertNotNull(employee);
        assertEquals(1, employee.getRank());
        assertTrue(employee instanceof Fresher);
    }
    
    @Test
    void testGetFreeEmployeeForRank2() {
        // Should return a lead for rank 2 calls
        Employee employee = callManager.getFreeEmployee(2);
        
        assertNotNull(employee);
        assertEquals(2, employee.getRank());
        assertTrue(employee instanceof Lead);
    }
    
    @Test
    void testGetFreeEmployeeForRank3() {
        // Should return a manager for rank 3 calls
        Employee employee = callManager.getFreeEmployee(3);
        
        assertNotNull(employee);
        assertEquals(3, employee.getRank());
        assertTrue(employee instanceof Manager);
    }
    
    @Test
    void testNoFreeEmployeeAvailable() {
        // Create calls that will occupy all employees
        Call call1 = new Call(1, new Customer("Customer1"));
        Call call2 = new Call(1, new Customer("Customer2"));
        Call call3 = new Call(2, new Customer("Customer3"));
        Call call4 = new Call(3, new Customer("Customer4"));
        
        callManager.handle(call1);
        callManager.handle(call2);
        callManager.handle(call3);
        callManager.handle(call4);
        
        // Now all employees should be busy
        Employee employee = callManager.getFreeEmployee(1);
        assertNull(employee);
    }
    
    @Test
    void testHandleCallAddedToQueue() {
        // Get employee references before they're occupied
        Fresher fresher1 = (Fresher) callManager.getFreeEmployee(1);
        Fresher fresher2 = (Fresher) callManager.getFreeEmployee(1);
        Lead lead = (Lead) callManager.getFreeEmployee(2);
        Manager manager = (Manager) callManager.getFreeEmployee(3);
        
        // Store these references to use later
        assertNotNull(fresher1);
        assertNotNull(fresher2);
        assertNotNull(lead);
        assertNotNull(manager);
        
        // Create calls to occupy all employees
        Call call1 = new Call(1, new Customer("Customer1"));
        Call call2 = new Call(1, new Customer("Customer2"));
        Call call3 = new Call(2, new Customer("Customer3"));
        Call call4 = new Call(3, new Customer("Customer4"));
        
        // Handle calls to occupy all employees
        callManager.handle(call1);
        callManager.handle(call2);
        callManager.handle(call3);
        callManager.handle(call4);
        
        // Verify all employees are busy
        assertNull(callManager.getFreeEmployee(1));
        
        // Now try to handle another call, it should go to the queue
        Call call5 = new Call(1, new Customer("Customer5"));
        callManager.handle(call5);
        
        // End call1, which will:
        // 1. Set fresher1.free = true
        // 2. Call callManager.end()
        // 3. Which calls handleCallFromQueue()
        // 4. Which assigns call5 to fresher1
        // 5. Which sets fresher1.free = false again
        fresher1.endCall(call1);
        
        // The fresher should NOT be free because it should have been assigned the call from queue
        // This verifies that the queue processing worked correctly
        assertFalse(fresher1.isFree());
    }
    
    @Test
    void testEscalateCall() {
        // Create a fresher and a call
        Fresher fresher = new Fresher("TestFresher", true, callManager);
        Call call = new Call(1, new Customer("TestCustomer"));
        
        // Fresher receives the call
        fresher.receiveCall(call);
        assertFalse(fresher.isFree());
        
        // Fresher escalates the call
        fresher.escalateCall(call);
        
        // Fresher should be free and call rank increased
        assertTrue(fresher.isFree());
        assertEquals(2, call.getRank());
    }
} 