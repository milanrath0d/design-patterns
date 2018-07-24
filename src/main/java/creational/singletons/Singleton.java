package creational.singletons;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singleton==null){
			singleton=new Singleton();
			System.out.println("Null Object");
		}
		return singleton;
	}
	public void printSingleton(){
		System.out.println("Singleton"+singleton.toString());
	}
}
