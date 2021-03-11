package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for builder pattern
 *
 * @author Milan Rathod
 */
class BuilderTest {

    @Test
    void testBuildBeverage() {
        Beverage coffee = Waiter.takeOrder("coffee");

        assertNotNull(coffee);
        assertEquals("Coffee", coffee.getBeverageName());
        assertEquals(3, coffee.getMilk());
    }

}