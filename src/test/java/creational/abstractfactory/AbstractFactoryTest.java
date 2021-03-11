package creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * For testing abstract factory design pattern
 *
 * @author Milan Rathod
 */
class AbstractFactoryTest {

    @Test
    void testAbstractFactory() {
        AbstractFactory<Animal> animalAbstractFactory = FactoryProvider.getFactory("animal");

        Animal animal = animalAbstractFactory.create("dog");

        AbstractFactory<Color> colorAbstractFactory = FactoryProvider.getFactory("color");

        Color color = colorAbstractFactory.create("brown");

        assertEquals("Bow Bow!", animal.speak());

        assertEquals("brown", color.getColor());
    }

}