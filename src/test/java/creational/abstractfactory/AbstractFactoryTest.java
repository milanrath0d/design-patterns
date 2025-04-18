package creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Abstract Factory Pattern implementation
 */
class AbstractFactoryTest {

    @Test
    void testAnimalFactory() {
        AbstractFactory animalFactory = FactoryProvider.getFactory("animal");
        
        assertNotNull(animalFactory);
        assertTrue(animalFactory instanceof AnimalFactory);
        
        // Create a Dog using Animal Factory
        Animal dog = (Animal) animalFactory.create("dog");
        assertNotNull(dog);
        assertTrue(dog instanceof Dog);
        assertEquals("Bow Bow!", dog.speak());
        
        // Create a Cat using Animal Factory
        Animal cat = (Animal) animalFactory.create("cat");
        assertNotNull(cat);
        assertTrue(cat instanceof Cat);
        assertEquals("Meow!", cat.speak());
    }
    
    @Test
    void testColorFactory() {
        AbstractFactory colorFactory = FactoryProvider.getFactory("color");
        
        assertNotNull(colorFactory);
        assertTrue(colorFactory instanceof ColorFactory);
        
        // Create White color using Color Factory
        Color white = (Color) colorFactory.create("White");
        assertNotNull(white);
        assertTrue(white instanceof White);
        assertEquals("White", white.getColor());
        
        // Create Brown color using Color Factory
        Color brown = (Color) colorFactory.create("Brown");
        assertNotNull(brown);
        assertTrue(brown instanceof Brown);
        assertEquals("Brown", brown.getColor());
    }
    
    @Test
    void testInvalidFactory() {
        AbstractFactory invalidFactory = FactoryProvider.getFactory("invalid");
        
        // Factory returns null for invalid factory type
        assertNull(invalidFactory);
    }
    
    @Test
    void testInvalidAnimal() {
        AbstractFactory animalFactory = FactoryProvider.getFactory("animal");
        
        Animal invalidAnimal = (Animal) animalFactory.create("elephant");
        
        // Factory returns null for invalid animal type
        assertNull(invalidAnimal);
    }
    
    @Test
    void testInvalidColor() {
        AbstractFactory colorFactory = FactoryProvider.getFactory("color");
        
        Color invalidColor = (Color) colorFactory.create("blue");
        
        // Factory returns null for invalid color type
        assertNull(invalidColor);
    }
}