package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Builder Pattern implementation
 */
class BuilderTest {

    @Test
    void testCakeBuilderMinimal() {
        Cake cake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                .build();
        
        assertNotNull(cake);
        assertEquals(1, cake.getSugar());
        assertEquals(0.5, cake.getButter());
        assertEquals(0, cake.getEggs());
        assertEquals(0, cake.getVanila());
    }
    
    @Test
    void testCakeBuilderComplete() {
        Cake cake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                .eggs(2)
                .vanila(2)
                .flour(1.5)
                .bakingpowder(0.75)
                .milk(0.5)
                .cherry(3)
                .build();
        
        assertNotNull(cake);
        assertEquals(1, cake.getSugar());
        assertEquals(0.5, cake.getButter());
        assertEquals(2, cake.getEggs());
        assertEquals(2, cake.getVanila());
        assertEquals(1.5, cake.getFlour());
        assertEquals(0.75, cake.getBakingpowder());
        assertEquals(0.5, cake.getMilk());
        assertEquals(3, cake.getCherry());
    }
    
    @Test
    void testCakeToString() {
        Cake cake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                .eggs(2)
                .build();
        
        String cakeString = cake.toString();
        
        // Verify toString contains expected values
        assertTrue(cakeString.contains("sugar=1.0"));
        assertTrue(cakeString.contains("butter=0.5"));
        assertTrue(cakeString.contains("eggs=2"));
    }
    
    @Test
    void testBeverageBuilder() {
        // Test Coffee builder
        Beverage coffee = Waiter.takeOrder("coffee");
        
        assertNotNull(coffee);
        assertEquals("Coffee", coffee.getBeverageName());
        
        // Test Tea builder
        Beverage tea = Waiter.takeOrder("tea");
        
        assertNotNull(tea);
        assertEquals("Tea", tea.getBeverageName());
    }
    
    @Test
    void testInvalidBeverageOrder() {
        // Test with invalid beverage type
        Beverage invalidBeverage = Waiter.takeOrder("smoothie");
        
        // Should return null for unsupported beverage type
        assertNull(invalidBeverage);
    }
}