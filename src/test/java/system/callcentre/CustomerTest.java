package system.callcentre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test for Customer class implementation
 */
public class CustomerTest {

    @Test
    void testCustomerConstructor() {
        Customer customer = new Customer("John Doe");
        assertEquals("John Doe", customer.getName());
    }
    
    @Test
    void testCustomerNameIsImmutable() {
        // Since name is final in Customer class, we can only set it via constructor
        Customer customer1 = new Customer("Customer1");
        Customer customer2 = new Customer("Customer2");
        
        // Names should be distinct
        assertEquals("Customer1", customer1.getName());
        assertEquals("Customer2", customer2.getName());
        assertNotEquals(customer1.getName(), customer2.getName());
    }
    
    @Test
    void testCustomerInCall() {
        Customer customer = new Customer("TestCustomer");
        Call call = new Call(1, customer);
        
        // Verify the customer is properly associated with the call
        assertSame(customer, call.getCustomer());
        assertEquals("TestCustomer", call.getCustomer().getName());
    }
} 