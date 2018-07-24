package creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Dog dog=(Dog) AnimalCache.getAnimal("dog");
		System.out.println("Name : "+dog.getName()+" Color : "+dog.getColor());
		
		Dog dog1=(Dog) AnimalCache.getAnimal("dog");
		System.out.println("Name : "+dog.getName()+" Color : "+dog.getColor());
		
		

	}

}
