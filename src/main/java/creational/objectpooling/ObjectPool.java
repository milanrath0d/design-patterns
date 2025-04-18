package creational.objectpooling;

import java.util.HashMap;
import java.util.Map;

/**
 * Object pool
 *
 * @author Milan Rathod
 */
public abstract class ObjectPool<T> {
    private final long expiryTime;

    private final HashMap<T, Long> unlocked;

    private final HashMap<T, Long> locked;

    public ObjectPool() {
        expiryTime = 30000;
        unlocked = new HashMap<>();
        locked = new HashMap<>();
    }

    protected abstract T createConnection();

    public abstract boolean validate(T object);

    public abstract void expire(T object);

    /**
     * @return Object from object pool
     */
    public synchronized T create() {
        Long now = System.currentTimeMillis();
        T object = null;
        
        if (!unlocked.isEmpty()) {
            // Try to find a valid object in the unlocked pool
            for (Map.Entry<T, Long> entry : unlocked.entrySet()) {
                T pooledObject = entry.getKey();
                if ((now - entry.getValue()) > expiryTime) {
                    // Object has expired
                    unlocked.remove(pooledObject);
                    expire(pooledObject);
                } else if (validate(pooledObject)) {
                    // Found a valid object
                    unlocked.remove(pooledObject);
                    locked.put(pooledObject, now);
                    object = pooledObject;
                    break;
                } else {
                    // Object is invalid
                    unlocked.remove(pooledObject);
                    expire(pooledObject);
                }
            }
        }
        
        // If no valid object was found in the pool, create a new one
        if (object == null) {
            object = this.createConnection();
            locked.put(object, now);
        }
        
        return object;
    }

    public synchronized void releaseConnection(T object) {
        locked.remove(object);
        unlocked.put(object, System.currentTimeMillis());
    }

}
