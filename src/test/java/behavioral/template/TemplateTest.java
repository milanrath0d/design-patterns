package behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for Template Pattern implementation
 */
class TemplateTest {

    @Test
    void testOnlineOrderWithoutGift() {
        Order onlineOrder = new OnlineOrder();
        
        // Should execute the template method without exceptions
        assertDoesNotThrow(() -> onlineOrder.processOrder(false));
    }
    
    @Test
    void testOnlineOrderWithGift() {
        Order onlineOrder = new OnlineOrder();
        
        // Should execute the template method with gift wrapping
        assertDoesNotThrow(() -> onlineOrder.processOrder(true));
    }
    
    @Test
    void testStoreOrderWithoutGift() {
        Order storeOrder = new StoreOrder();
        
        // Should execute the template method without exceptions
        assertDoesNotThrow(() -> storeOrder.processOrder(false));
    }
    
    @Test
    void testStoreOrderWithGift() {
        Order storeOrder = new StoreOrder();
        
        // Should execute the template method with gift wrapping
        assertDoesNotThrow(() -> storeOrder.processOrder(true));
    }
} 