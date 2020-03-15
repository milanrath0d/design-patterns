package creational.factory;

/**
 * Factory related to sea animals
 *
 * @author Milan Rathod
 */
public class SeaAnimalFactory extends AnimalFactory {

    public Animal getAnimal(String animalType) {
        Animal animal = null;
        if ("fish".equals(animalType)) {
            animal = new Fish();
        } else if ("shark".equals(animalType)) {
            animal = new Shark();
        }
        return animal;
    }

}
