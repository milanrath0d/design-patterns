package creational.prototype;

import java.util.Hashtable;

public class AnimalCache {

	private static Hashtable<String,Animal> animalMap=new Hashtable<String,Animal>();
	
	public static Animal getAnimal(String animalType){
		Dog dog=(Dog) animalMap.get(animalType);
		if(dog==null){
			dog=new Dog("tommy", "white");
			animalMap.put(animalType,dog);
			System.out.println("New Dog Object");
			return dog;
		}
		System.out.println("Cloned Dog Object");
		return dog.clone();
	}
}
