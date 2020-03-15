package creational.builder;

import org.junit.Test;

/**
 * Test class for {@link Cake}
 *
 * @author Milan Rathod
 */
public class CakeTest {

    @Test
    public void testBuilder() {
        Cake cake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5).bakingpowder(0.75).milk(0.5).build();

        System.out.println(cake);
    }
}