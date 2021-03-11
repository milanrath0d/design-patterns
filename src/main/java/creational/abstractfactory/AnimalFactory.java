package creational.abstractfactory;

/**
 * Factory related to animals
 *
 * @author Milan Rathod
 */
public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String type) {
        Animal animal = null;
        if ("dog".equals(type)) {
            animal = new Dog();
        } else if ("cat".equals(type)) {
            animal = new Cat();
        }
        return animal;
    }
}
