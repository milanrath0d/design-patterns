package behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Observer Pattern implementation
 */
class ObserverTest {

    @Test
    void testRegisterObserver() {
        // Create a product with initial "Out of Stock" availability
        Product product = new Product("Test Product", 100, "Out of Stock");
        
        // Create observers
        Observer observer1 = new Person("John");
        
        // Register observer
        product.register(observer1);
        
        // The observers list should not be empty
        assertFalse(product.getObserverList().isEmpty());
        assertEquals(1, product.getObserverList().size());
    }
    
    @Test
    void testDeregisterObserver() {
        // Create a product with initial "Out of Stock" availability
        Product product = new Product("Test Product", 100, "Out of Stock");
        
        // Create observers
        Observer observer1 = new Person("John");
        
        // Register observer
        product.register(observer1);
        
        // Deregister observer
        product.deRegister(observer1);
        
        // The observers list should be empty
        assertTrue(product.getObserverList().isEmpty());
    }
    
    @Test
    void testNotifyObservers() {
        // Create a product with initial "Out of Stock" availability
        Product product = new Product("Test Product", 100, "Out of Stock");
        
        // Create observers
        Observer observer1 = new Person("John");
        Observer observer2 = new Person("Jane");
        
        // Register observers
        product.register(observer1);
        product.register(observer2);
        
        // Change availability to trigger notification
        product.setAvailability("In Stock");
        
        // Availability should be updated
        assertEquals("In Stock", product.getAvailability());
    }
    
    @Test
    void testMultipleProductObservation() {
        // Create products
        Product product1 = new Product("Product 1", 100, "Out of Stock");
        Product product2 = new Product("Product 2", 200, "Out of Stock");
        
        // Create observer
        Observer observer = new Person("John");
        
        // Register observer with both products
        product1.register(observer);
        product2.register(observer);
        
        // Change availability of one product
        product1.setAvailability("In Stock");
        
        // Only product1's availability should be updated
        assertEquals("In Stock", product1.getAvailability());
        assertEquals("Out of Stock", product2.getAvailability());
    }
} 