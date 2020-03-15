package creational.prototype;

/**
 * @author Milan Rathod
 */
public class CloneFactory {

    public static Animal getAnimal(Animal animalType) {
        return animalType.clone();
    }
}
