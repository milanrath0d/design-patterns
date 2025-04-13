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
        if (unlocked.size() > 0) {
            for (Map.Entry<T, Long> entry : unlocked.entrySet()) {
                T object = entry.getKey();
                if ((now - unlocked.get(object)) > expiryTime) {
                    unlocked.remove(object);
                    expire(object);
                } else if (validate(object)) {
                    unlocked.remove(object);
                    locked.put(object, now);
                    return object;
                } else {
                    unlocked.remove(object);
                    expire(object);
                }
            }
        }
        T object = this.createConnection();
        locked.put(object, now);
        return object;
    }

    public synchronized void releaseConnection(T object) {
        locked.remove(object);
        unlocked.put(object, System.currentTimeMillis());
    }

}
