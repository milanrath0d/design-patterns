package creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Factory Pattern implementation
 */
class FactoryTest {

    @Test
    void testCreateTriangle() {
        Polygon triangle = PolygonFactory.getPolygon(3);
        
        assertNotNull(triangle);
        assertTrue(triangle instanceof Triangle);
        assertEquals("Triangle", triangle.getType());
    }
    
    @Test
    void testCreateSquare() {
        Polygon square = PolygonFactory.getPolygon(4);
        
        assertNotNull(square);
        assertTrue(square instanceof Square);
        assertEquals("Square", square.getType());
    }
    
    @Test
    void testInvalidPolygon() {
        Polygon polygon = PolygonFactory.getPolygon(5);
        
        // Factory returns null for unsupported number of sides
        assertNull(polygon);
    }
}