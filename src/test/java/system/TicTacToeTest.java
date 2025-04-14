package system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for {@link TicTacToe}
 */
class TicTacToeTest {

    private static final String PLAYER1 = "X";
    private static final String PLAYER2 = "O";
    private static final int BOARD_SIZE = 3;

    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe(BOARD_SIZE, PLAYER1, PLAYER2);
    }

    @Test
    void testInitialGameState() {
        assertNull(ticTacToe.getWinner());
    }

    @Test
    void testValidMove() {
        assertNull(ticTacToe.makeMove(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMove(PLAYER2, 1, 1));
    }

    @Test
    void testWinnerRow() {
        // Player1 makes moves in the top row
        assertNull(ticTacToe.makeMove(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMove(PLAYER2, 1, 0));
        assertNull(ticTacToe.makeMove(PLAYER1, 0, 1));
        assertNull(ticTacToe.makeMove(PLAYER2, 1, 1));
        
        // Final winning move
        assertEquals(PLAYER1, ticTacToe.makeMove(PLAYER1, 0, 2));
        assertEquals(PLAYER1, ticTacToe.getWinner());
    }

    @Test
    void testWinnerColumn() {
        // Player2 makes moves in the middle column
        assertNull(ticTacToe.makeMove(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMove(PLAYER2, 0, 1));
        assertNull(ticTacToe.makeMove(PLAYER1, 2, 2));
        assertNull(ticTacToe.makeMove(PLAYER2, 1, 1));
        assertNull(ticTacToe.makeMove(PLAYER1, 2, 0));
        
        // Final winning move
        assertEquals(PLAYER2, ticTacToe.makeMove(PLAYER2, 2, 1));
        assertEquals(PLAYER2, ticTacToe.getWinner());
    }

    @Test
    void testWinnerDiagonal() {
        // Player1 makes moves in the main diagonal
        assertNull(ticTacToe.makeMove(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMove(PLAYER2, 0, 1));
        assertNull(ticTacToe.makeMove(PLAYER1, 1, 1));
        assertNull(ticTacToe.makeMove(PLAYER2, 0, 2));
        
        // Final winning move
        assertEquals(PLAYER1, ticTacToe.makeMove(PLAYER1, 2, 2));
        assertEquals(PLAYER1, ticTacToe.getWinner());
    }

    @Test
    void testWinnerReverseDiagonal() {
        // Player2 makes moves in the reverse diagonal
        assertNull(ticTacToe.makeMove(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMove(PLAYER2, 0, 2));
        assertNull(ticTacToe.makeMove(PLAYER1, 0, 1));
        assertNull(ticTacToe.makeMove(PLAYER2, 1, 1));
        assertNull(ticTacToe.makeMove(PLAYER1, 1, 0));
        
        // Final winning move
        assertEquals(PLAYER2, ticTacToe.makeMove(PLAYER2, 2, 0));
        assertEquals(PLAYER2, ticTacToe.getWinner());
    }

    @Test
    void testMoveOutOfBounds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMove(PLAYER1, 3, 3));
        assertEquals("Move out of board boundary!", exception.getMessage());
    }

    @Test
    void testMoveOnOccupiedSquare() {
        ticTacToe.makeMove(PLAYER1, 1, 1);
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMove(PLAYER2, 1, 1));
        assertEquals("Square is already occupied!", exception.getMessage());
    }

    @Test
    void testInvalidPlayer() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMove("Z", 0, 0));
        assertEquals("Invalid player!", exception.getMessage());
    }

    @Test
    void testGameAlreadyOver() {
        // Set up a winning scenario
        ticTacToe.makeMove(PLAYER1, 0, 0);
        ticTacToe.makeMove(PLAYER2, 1, 0);
        ticTacToe.makeMove(PLAYER1, 0, 1);
        ticTacToe.makeMove(PLAYER2, 1, 1);
        ticTacToe.makeMove(PLAYER1, 0, 2); // This move makes PLAYER1 win
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMove(PLAYER2, 2, 0));
        assertEquals(String.format("Game is already over. %s won", PLAYER1), exception.getMessage());
    }

    @Test
    void testOptimizedInitialGameState() {
        assertNull(ticTacToe.getWinner());
    }

    @Test
    void testOptimizedValidMove() {
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 1, 1));
    }

    @Test
    void testOptimizedWinnerRow() {
        // Player1 makes moves in the top row
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 1, 0));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 0, 1));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 1, 1));
        
        // Final winning move
        assertEquals(PLAYER1, ticTacToe.makeMoveOptimized(PLAYER1, 0, 2));
        assertEquals(PLAYER1, ticTacToe.getWinner());
    }

    @Test
    void testOptimizedWinnerColumn() {
        // Player2 makes moves in the middle column
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 0, 1));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 2, 2));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 1, 1));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 2, 0));
        
        // Final winning move
        assertEquals(PLAYER2, ticTacToe.makeMoveOptimized(PLAYER2, 2, 1));
        assertEquals(PLAYER2, ticTacToe.getWinner());
    }

    @Test
    void testOptimizedWinnerDiagonal() {
        // Player1 makes moves in the main diagonal
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 0, 1));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 1, 1));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 0, 2));
        
        // Final winning move
        assertEquals(PLAYER1, ticTacToe.makeMoveOptimized(PLAYER1, 2, 2));
        assertEquals(PLAYER1, ticTacToe.getWinner());
    }

    @Test
    void testOptimizedWinnerReverseDiagonal() {
        // Player2 makes moves in the reverse diagonal
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 0, 0));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 0, 2));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 0, 1));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER2, 1, 1));
        assertNull(ticTacToe.makeMoveOptimized(PLAYER1, 1, 0));
        
        // Final winning move
        assertEquals(PLAYER2, ticTacToe.makeMoveOptimized(PLAYER2, 2, 0));
        assertEquals(PLAYER2, ticTacToe.getWinner());
    }

    @Test
    void testOptimizedMoveOutOfBounds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMoveOptimized(PLAYER1, 3, 3));
        assertEquals("Move out of board boundary!", exception.getMessage());
    }

    @Test
    void testOptimizedMoveOnOccupiedSquare() {
        ticTacToe.makeMoveOptimized(PLAYER1, 1, 1);
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMoveOptimized(PLAYER2, 1, 1));
        assertEquals("Square is already occupied!", exception.getMessage());
    }

    @Test
    void testOptimizedInvalidPlayer() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMoveOptimized("Z", 0, 0));
        assertEquals("Invalid player!", exception.getMessage());
    }

    @Test
    void testOptimizedGameAlreadyOver() {
        // Set up a winning scenario
        ticTacToe.makeMoveOptimized(PLAYER1, 0, 0);
        ticTacToe.makeMoveOptimized(PLAYER2, 1, 0);
        ticTacToe.makeMoveOptimized(PLAYER1, 0, 1);
        ticTacToe.makeMoveOptimized(PLAYER2, 1, 1);
        ticTacToe.makeMoveOptimized(PLAYER1, 0, 2); // This move makes PLAYER1 win
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            ticTacToe.makeMoveOptimized(PLAYER2, 2, 0));
        assertEquals(String.format("Game is already over. %s won", PLAYER1), exception.getMessage());
    }
} 