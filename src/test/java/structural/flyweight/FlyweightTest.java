package structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Flyweight Pattern implementation
 */
class FlyweightTest {

    @Test
    void testPlayerFactoryGetTerrorist() {
        Player player = PlayerFactory.getPlayer("Terrorist");
        
        assertNotNull(player);
        assertTrue(player instanceof Terrorist);
    }
    
    @Test
    void testPlayerFactoryGetCounterTerrorist() {
        Player player = PlayerFactory.getPlayer("CounterTerrorist");
        
        assertNotNull(player);
        assertTrue(player instanceof CounterTerrorist);
    }
    
    @Test
    void testPlayerFactoryReturnsExistingInstance() {
        Player player1 = PlayerFactory.getPlayer("Terrorist");
        Player player2 = PlayerFactory.getPlayer("Terrorist");
        
        assertSame(player1, player2, "Factory should return the same instance for same type");
    }
    
    @Test
    void testDifferentInstancesForDifferentTypes() {
        Player terrorist = PlayerFactory.getPlayer("Terrorist");
        Player counterTerrorist = PlayerFactory.getPlayer("CounterTerrorist");
        
        assertNotSame(terrorist, counterTerrorist, "Different types should return different instances");
    }
    
    @Test
    void testTerroristImplementation() {
        Player player = PlayerFactory.getPlayer("Terrorist");
        player.assignWeapon("AK-47");
        
        // Testing that the mission assignment doesn't throw exceptions
        assertDoesNotThrow(() -> player.mission());
    }
    
    @Test
    void testCounterTerroristImplementation() {
        Player player = PlayerFactory.getPlayer("CounterTerrorist");
        player.assignWeapon("Desert Eagle");
        
        // Testing that the mission assignment doesn't throw exceptions
        assertDoesNotThrow(() -> player.mission());
    }
} 