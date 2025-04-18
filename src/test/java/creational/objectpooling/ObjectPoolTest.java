package creational.objectpooling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Object Pooling Pattern implementation
 */
class ObjectPoolTest {

    /**
     * Create a test-specific implementation using something easier to test than a DB connection
     */
    static class TestObjectPool extends ObjectPool<String> {
        boolean validateCalled = false;
        boolean expireCalled = false;
        private int counter = 0;  // Sequence counter to ensure uniqueness

        @Override
        protected String createConnection() {
            // Use a counter to ensure each object is unique
            return "TestObject-" + (counter++);
        }

        @Override
        public boolean validate(String object) {
            validateCalled = true;
            return object != null && object.startsWith("TestObject-");
        }

        @Override
        public void expire(String object) {
            expireCalled = true;
        }
    }

    @Test
    void testObjectCreation() {
        TestObjectPool pool = new TestObjectPool();
        
        // Get an object from the pool
        String obj1 = pool.create();
        
        // Verify the object was created correctly
        assertNotNull(obj1);
        assertTrue(obj1.startsWith("TestObject-"));
    }
    
    @Test
    void testObjectReuse() {
        TestObjectPool pool = new TestObjectPool();
        
        // Get an object from the pool
        String obj1 = pool.create();
        
        // Release the object back to the pool
        pool.releaseConnection(obj1);
        
        // Get another object from the pool - should be the same one
        String obj2 = pool.create();
        
        // Verify validation was called
        assertTrue(pool.validateCalled);
        
        // Verify we got the same object back
        assertSame(obj1, obj2);
    }
    
    @Test
    void testMultipleObjects() {
        TestObjectPool pool = new TestObjectPool();
        
        // Get multiple objects from the pool
        String obj1 = pool.create();
        String obj2 = pool.create();
        
        // The objects should be different
        assertNotEquals(obj1, obj2);
        
        // Release one object
        pool.releaseConnection(obj1);
        
        // The next object should be the released one
        String obj3 = pool.create();
        assertSame(obj1, obj3);
    }
} 