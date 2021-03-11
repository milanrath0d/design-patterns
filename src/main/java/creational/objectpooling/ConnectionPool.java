package creational.objectpooling;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Milan Rathod
 */
public class ConnectionPool extends ObjectPool<Connection> {

    private final String driver;

    private final String url;

    public ConnectionPool(String driver, String url) {
        this.driver = driver;
        this.url = url;
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @Override
    protected Connection create() {
        try {
            return DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @Override
    public boolean validate(Connection connection) {
        try {
            return !(connection.isClosed());
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Override
    public void expire(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
