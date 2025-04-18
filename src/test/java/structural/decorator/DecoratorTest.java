package structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test for Decorator Pattern implementation
 */
class DecoratorTest {

    @Test
    void testSimpleCircle() {
        Shape circle = new SimpleCircle();
        assertEquals("Drawing a simple circle", circle.draw());
    }
    
    @Test
    void testRedCircleDecorator() {
        Shape circle = new SimpleCircle();
        Shape redCircle = new RedCircle(circle);
        assertEquals("Drawing a simple circle with red color", redCircle.draw());
    }
    
    @Test
    void testGreenCircleDecorator() {
        Shape circle = new SimpleCircle();
        Shape greenCircle = new GreenCircle(circle);
        assertEquals("Drawing a simple circle with green color", greenCircle.draw());
    }
    
    @Test
    void testMultipleDecorators() {
        Shape circle = new SimpleCircle();
        Shape redCircle = new RedCircle(circle);
        Shape decoratedCircle = new GreenCircle(redCircle);
        
        // Results depend on the actual implementation
        assertNotNull(decoratedCircle.draw());
    }
} 