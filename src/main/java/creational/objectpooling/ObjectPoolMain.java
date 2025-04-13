package creational.objectpooling;

import java.sql.Connection;

/**
 * Entry point for object pool design pattern
 *
 * @author Milan Rathod
 */
public class ObjectPoolMain {

    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool("org.apache.derby.jdbc.ClientDriver",
                "jdbc:derby://localhost:1527/db");
        Connection connection = connectionPool.createConnection();
        System.out.println("Connection object created");
        connectionPool.releaseConnection(connection);
        System.out.println("Connection object released");
    }

}
