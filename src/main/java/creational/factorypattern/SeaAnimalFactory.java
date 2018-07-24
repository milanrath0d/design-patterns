package creational.factorypattern;

public class SeaAnimalFactory extends AnimalFactory {
	
	public Animal getAnimal(String animalType){
		Animal animal=null;
		if("fish".equals(animalType)){
			animal=new Dog();
		}
		else if("shark".equals(animalType)){
			animal=new Cat();
		}
		return animal;
	}

}
