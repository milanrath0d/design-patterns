package system.callcentre;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Abstract test class for Employee hierarchy
 */
public abstract class EmployeeTest {
    
    protected abstract Employee createEmployee();
    protected abstract int getExpectedRank();
    
    private CallManager callManager;
    private Fresher fresher;
    private Lead lead;
    private Manager manager;
    private Call call;
    
    @BeforeEach
    void setUp() {
        callManager = new CallManager(1, 1);
        fresher = new Fresher("TestFresher", true, callManager);
        lead = new Lead("TestLead", true, callManager);
        manager = new Manager("TestManager", true, callManager);
        call = new Call(1, new Customer("TestCustomer"));
    }
    
    @Test
    void testEmployeeAvailability() {
        Employee employee = createEmployee();
        // Employee should be available initially
        assertTrue(employee.isFree());
        
        // Make employee unavailable
        employee.setFree(false);
        assertFalse(employee.isFree());
        
        // Make employee available again
        employee.setFree(true);
        assertTrue(employee.isFree());
    }
    
    @Test
    void testEmployeeRank() {
        Employee employee = createEmployee();
        assertEquals(getExpectedRank(), employee.getRank());
    }
    
    @Test
    void testEmployeeReceiveCall() {
        // Test receiving a call
        fresher.receiveCall(call);
        
        // Employee should be busy after receiving a call
        assertFalse(fresher.isFree());
    }
    
    @Test
    void testEmployeeEndCall() {
        // First receive a call
        fresher.receiveCall(call);
        assertFalse(fresher.isFree());
        
        // End the call
        fresher.endCall(call);
        
        // Employee should be free after ending a call
        assertTrue(fresher.isFree());
    }
    
    @Test
    void testFresherEscalateCall() {
        // Fresher receives call
        fresher.receiveCall(call);
        assertFalse(fresher.isFree());
        assertEquals(1, call.getRank());
        
        // Fresher escalates call
        fresher.escalateCall(call);
        
        // Fresher should be free and call rank increased
        assertTrue(fresher.isFree());
        assertEquals(2, call.getRank());
    }
    
    @Test
    void testLeadEscalateCall() {
        // Set call rank to 2 for lead
        call.setRank(2);
        
        // Lead receives call
        lead.receiveCall(call);
        assertFalse(lead.isFree());
        assertEquals(2, call.getRank());
        
        // Lead escalates call
        lead.escalateCall(call);
        
        // Lead should be free and call rank increased
        assertTrue(lead.isFree());
        assertEquals(3, call.getRank());
    }
    
    @Test
    void testEmployeeRankAssignment() {
        // Test rank assignment in constructors
        assertEquals(1, fresher.getRank());
        assertEquals(2, lead.getRank());
        assertEquals(3, manager.getRank());
    }
    
    @Test
    void testEmployeeSettersAndGetters() {
        // Test name getter/setter
        assertEquals("TestFresher", fresher.getName());
        fresher.setName("NewName");
        assertEquals("NewName", fresher.getName());
        
        // Test free status getter/setter
        assertTrue(fresher.isFree());
        fresher.setFree(false);
        assertFalse(fresher.isFree());
        
        // Test rank getter/setter
        assertEquals(1, fresher.getRank());
        fresher.setRank(5);
        assertEquals(5, fresher.getRank());
    }
    
    @Test
    void testCallManagerReference() {
        // Test that employees have correct reference to call manager
        assertSame(callManager, fresher.getCallManager());
        assertSame(callManager, lead.getCallManager());
        assertSame(callManager, manager.getCallManager());
    }
} 