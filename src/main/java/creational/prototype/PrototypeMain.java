package creational.prototype;

/**
 * Entry point for prototype design pattern
 *
 * @author Milan Rathod
 */
public class PrototypeMain {

    public static void main(String[] args) {

        Dog dog = new Dog("Tommy", "White");

        Dog clonedDog = (Dog) CloneFactory.getAnimal(dog);
        System.out.println("Name: " + clonedDog.getName() + "\n" + "Color: " + clonedDog.getColor());

        System.out.println(dog.hashCode() == clonedDog.hashCode());
    }

}
