package creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for factory method pattern
 *
 * @author Milan Rathod
 */
class FactoryTest {

    @Test
    void testGetPolygon() {
        assertEquals("square", PolygonFactory.getPolygon(4).getType());

        assertEquals("triangle", PolygonFactory.getPolygon(3).getType());
    }

}