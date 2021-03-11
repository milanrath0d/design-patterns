package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link Cake}
 *
 * @author Milan Rathod
 */
class CakeTest {

    @Test
    void testBuilder() {
        Cake cake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                .eggs(2)
                .vanila(2)
                .flour(1.5)
                .bakingpowder(0.75)
                .milk(0.5)
                .build();

        assertEquals(0.5, cake.getMilk());
    }
}