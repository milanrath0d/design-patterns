package creational.objectpooling;

import java.sql.Connection;

public class ConnectionClient {

	public static void main(String[] args) {
		ConnectionPool cp=new ConnectionPool("org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/db");
		Connection con=cp.checkout();
		System.out.println("Connection object created");
		cp.checkin(con);
		System.out.println("Connection object released");

	}

}
