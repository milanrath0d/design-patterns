package creational.singletons;

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton.getInstance().printSingleton();
		Singleton.getInstance().printSingleton();
		Singleton.getInstance().printSingleton();
	}

}
