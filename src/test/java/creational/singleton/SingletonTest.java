package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test for Singleton Pattern implementation
 */
class SingletonTest {

    @Test
    void testLazyLoadingSingleton() {
        LazyLoadingSingleton instance1 = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton instance2 = LazyLoadingSingleton.getInstance();
        
        // Both instances should be the same (same memory reference)
        assertSame(instance1, instance2);
    }
    
    @Test
    void testEarlyLoadingSingleton() {
        EarlyLoadingSingleton instance1 = EarlyLoadingSingleton.getInstance();
        EarlyLoadingSingleton instance2 = EarlyLoadingSingleton.getInstance();
        
        // Both instances should be the same (same memory reference)
        assertSame(instance1, instance2);
    }
    
    @Test
    void testStaticHandlerSingleton() {
        StaticHandlerSingleton instance1 = StaticHandlerSingleton.getInstance();
        StaticHandlerSingleton instance2 = StaticHandlerSingleton.getInstance();
        
        // Both instances should be the same (same memory reference)
        assertSame(instance1, instance2);
    }
    
    @Test
    void testEnumSingleton() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        
        // Both references should point to the same enum instance
        assertSame(instance1, instance2);
    }
    
    @Test
    void testRegularSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        
        // Both instances should be the same (same memory reference)
        assertSame(instance1, instance2);
    }
} 