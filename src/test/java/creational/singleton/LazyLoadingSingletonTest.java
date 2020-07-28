package creational.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * Test class for {@link LazyLoadingSingleton}
 *
 * @author Milan Rathod
 */
public class LazyLoadingSingletonTest {

    @Test
    public void testSingleton() {
        LazyLoadingSingleton instance1 = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton instance2 = LazyLoadingSingleton.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    public void testBreakSingletonUsingReflections() throws Exception {
        LazyLoadingSingleton instance1 = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton instance2 = null;


        Constructor<?>[] declaredConstructors = LazyLoadingSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            instance2 = (LazyLoadingSingleton) constructor.newInstance();
            break;
        }

        assertNotSame(instance1, instance2);
    }

}