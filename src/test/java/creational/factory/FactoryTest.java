package creational.factory;

import org.junit.Assert;
import org.junit.Test;

/**
 * For testing factory design pattern
 *
 * @author Milan Rathod
 */
public class FactoryTest {

    @Test
    public void testSeaAnimalFactory() {
        AnimalFactory animalFactory = AnimalFactory.getAnimalFactory("sea");

        Animal animal = animalFactory.getAnimal("fish");

        Assert.assertEquals(animal.speak(), "chi chi");
    }

    @Test
    public void testLandAnimalFactory() {
        AnimalFactory animalFactory = AnimalFactory.getAnimalFactory("land");

        Animal animal = animalFactory.getAnimal("cat");

        Assert.assertEquals(animal.speak(), "Meow!");
    }

}