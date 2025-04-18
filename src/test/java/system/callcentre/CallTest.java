package system.callcentre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test for Call class implementation
 */
public class CallTest {

    @Test
    void testCallConstructor() {
        Customer customer = new Customer("TestCustomer");
        Call call = new Call(1, customer);
        
        assertEquals(1, call.getRank());
        assertSame(customer, call.getCustomer());
    }
    
    @Test
    void testCallSetRank() {
        Call call = new Call(1, new Customer("TestCustomer"));
        
        // Test initial rank
        assertEquals(1, call.getRank());
        
        // Change rank
        call.setRank(2);
        assertEquals(2, call.getRank());
        
        // Change rank again
        call.setRank(3);
        assertEquals(3, call.getRank());
    }
    
    @Test
    void testCallCustomerInfo() {
        Customer customer = new Customer("TestCustomer");
        Call call = new Call(1, customer);
        
        // Test customer info is accessible through call
        assertEquals("TestCustomer", call.getCustomer().getName());
    }
    
    @Test
    void testCallSetCustomer() {
        Customer customer1 = new Customer("Customer1");
        Customer customer2 = new Customer("Customer2");
        
        Call call = new Call(1, customer1);
        assertEquals("Customer1", call.getCustomer().getName());
        
        // Change customer
        call.setCustomer(customer2);
        assertEquals("Customer2", call.getCustomer().getName());
    }
} 