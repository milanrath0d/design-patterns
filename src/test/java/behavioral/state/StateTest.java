package behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for State Pattern implementation
 */
class StateTest {

    @Test
    void testInitialState() {
        AtmMachine atmMachine = new AtmMachine();
        
        // Initial state should be NoCardState, which doesn't have direct getter
        // Test by checking the behavior is as expected
        assertDoesNotThrow(() -> atmMachine.insertCard());
    }
    
    @Test
    void testInsertCard() {
        AtmMachine atmMachine = new AtmMachine();
        
        // Insert a card (changes state to HasCardState)
        atmMachine.insertCard();
        
        // In HasCardState, we should be able to eject the card
        assertDoesNotThrow(() -> atmMachine.ejectCard());
    }
    
    @Test
    void testEjectCard() {
        AtmMachine atmMachine = new AtmMachine();
        
        // Insert a card (changes state to HasCardState)
        atmMachine.insertCard();
        
        // Eject the card (changes state back to NoCardState)
        atmMachine.ejectCard();
        
        // In NoCardState, we should be able to insert a card again
        assertDoesNotThrow(() -> atmMachine.insertCard());
    }
    
    @Test
    void testStateTransitions() {
        AtmMachine atmMachine = new AtmMachine();
        
        // Multiple state transitions
        atmMachine.insertCard();  // NoCard -> HasCard
        atmMachine.ejectCard();   // HasCard -> NoCard
        atmMachine.insertCard();  // NoCard -> HasCard
        
        // Should end in HasCardState
        assertDoesNotThrow(() -> atmMachine.ejectCard());
    }
} 