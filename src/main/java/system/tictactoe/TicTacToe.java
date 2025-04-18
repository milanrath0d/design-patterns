package system.tictactoe;

import lombok.Getter;

import java.util.List;
import java.util.Objects;

/**
 * @author Milan Rathod
 */
public class TicTacToe {

  private final int[][] board;
  private final String player1;
  private final String player2;
  @Getter
  private String winner;
  
  // For optimized version
  private final int[] rowCounter;
  private final int[] colCounter;
  private int diagCounter;
  private int revDiagCounter;

  public TicTacToe(final int n, final String player1, final String player2) {
    this.board = new int[n][n];
    this.player1 = player1;
    this.player2 = player2;
    
    // Initialize counters for optimized version
    this.rowCounter = new int[n];
    this.colCounter = new int[n];
    this.diagCounter = 0;
    this.revDiagCounter = 0;
  }

  /**
   * @param player player who is making move
   * @param row    is the move's row index
   * @param col    is the move's column index
   * @return winning player otherwise null
   * @throws IllegalArgumentException if the move is an illegal move
   */
  public String makeMove(String player, int row, int col) {
    if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
      throw new IllegalArgumentException("Move out of board boundary!");
    } else if (board[row][col] != 0) {
      throw new IllegalArgumentException("Square is already occupied!");
    } else if (!List.of(player1, player2).contains(player)) {
      throw new IllegalArgumentException("Invalid player!");
    } else if (winner != null) {
      throw new IllegalArgumentException(String.format("Game is already over. %s won", winner));
    } else {
      int move = Objects.equals(player, player1) ? -1 : 1;
      board[row][col] = move;
      boolean windRow = true, windCol = true, winDiag = true, winRevDiag = true;
      for (int i = 0; i < board.length; i++) {
        if (board[row][i] != move) {
          windRow = false;
        }
        if (board[i][col] != move) {
          windCol = false;
        }
        if (board[i][i] != move) {
          winDiag = false;
        }
        if (board[i][board.length - 1 - i] != move) {
          winRevDiag = false;
        }
      }

      if (windRow || windCol || winDiag || winRevDiag) {
        winner = player;
      }
    }
    return winner;
  }

  /**
   * Optimized version of makeMove that determines the winner in O(1) time
   *
   * @param player player who is making move
   * @param row    is the move's row index
   * @param col    is the move's column index
   * @return winning player otherwise null
   * @throws IllegalArgumentException if the move is an illegal move
   */
  public String makeMoveOptimized(String player, int row, int col) {
    if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
      throw new IllegalArgumentException("Move out of board boundary!");
    } else if (board[row][col] != 0) {
      throw new IllegalArgumentException("Square is already occupied!");
    } else if (!List.of(player1, player2).contains(player)) {
      throw new IllegalArgumentException("Invalid player!");
    } else if (winner != null) {
      throw new IllegalArgumentException(String.format("Game is already over. %s won", winner));
    } else {
      // Determine which player (1 for player1, -1 for player2)
      int playerValue = Objects.equals(player, player1) ? 1 : -1;
      board[row][col] = Objects.equals(player, player1) ? -1 : 1; // Keep board values consistent with original method
      
      // Update counters
      rowCounter[row] += playerValue;
      colCounter[col] += playerValue;
      
      // Check if move is on main diagonal (row == col)
      if (row == col) {
        diagCounter += playerValue;
      }
      
      // Check if move is on reverse diagonal (row + col == board.length - 1)
      if (row + col == board.length - 1) {
        revDiagCounter += playerValue;
      }
      
      // Check for win
      int n = board.length;
      if (Math.abs(rowCounter[row]) == n || 
          Math.abs(colCounter[col]) == n || 
          Math.abs(diagCounter) == n || 
          Math.abs(revDiagCounter) == n) {
        winner = player;
      }
    }
    return winner;
  }
}

