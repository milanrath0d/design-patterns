package creational.objectpooling;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPool extends ObjectPool<Connection> {
	
	private String driver,url;
	
	
	

	public ConnectionPool(String driver, String url) {
		super();
		this.driver = driver;
		this.url = url;
		try{
			Class.forName(driver).newInstance();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

	@Override
	protected Connection create() {
		try{
			return DriverManager.getConnection(url);
		}
		catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
	}

	@Override
	public boolean validate(Connection t) {
		try{
			return !(t.isClosed());
		}
		catch(Exception e){
			System.out.println(e.toString());
			return false;
		}
	}

	@Override
	public void expire(Connection t) {
		try{
		t.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
