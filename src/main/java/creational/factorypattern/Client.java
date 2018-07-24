package creational.factorypattern;

public class Client {

	public static void main(String[] args) {

		AnimalFactory af=AnimalFactory.getAnimalFactory("sea");
		Animal animal=af.getAnimal("cat");
		System.out.println(animal.speak());

	}

}
