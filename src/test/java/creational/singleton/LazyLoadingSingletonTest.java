package creational.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test class for {@link LazyLoadingSingleton}
 *
 * @author Milan Rathod
 */
class LazyLoadingSingletonTest {

    @Test
    void testSingleton() {
        LazyLoadingSingleton instance1 = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton instance2 = LazyLoadingSingleton.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void testBreakSingletonUsingReflections() throws Exception {
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