package TicTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Deque<Player> playersQueue;
    private Board board;
    private String winner;
    private int freeCellsAvailable;

    public void setupGame(List<Player> playerList, int size) {
        this.playersQueue = new ArrayDeque<>();

        for (Player player : playerList) {
            this.playersQueue.add(player);
        }

        this.board = new Board(size);
        this.freeCellsAvailable = size * size;
        this.winner = null;
    }

    public String startGame() {
        // After each move check the board to see if there is a winner; if yes, we stop the game
        while (winner == null) {
            // Check if the game is a draw; no more moves possible
            if (freeCellsAvailable == 0) return "tie";

            // Take out the player whose turn it is and put the player back into the list for the next round
            Player playerWhoWillPlay = playersQueue.removeFirst();
            playersQueue.addLast(playerWhoWillPlay);

            // Prompt the user to play
            System.out.print("Player: " + playerWhoWillPlay.getName() + ", Enter row,column in the format row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            // Check if the symbol placement was successful
            boolean isMoveSuccess = this.board.makeMove(playerWhoWillPlay, inputRow, inputColumn);
            if (!isMoveSuccess) {
                System.out.println("Invalid move! You will get the next turn. Penalty applied.");
                continue;
            }

            // Decrease the number of free cells after a successful move
            freeCellsAvailable--;

            // Print the board after each move for clarity
            board.printBoard();

            // Check if the move resulted in a win
            if (checkWinner(inputRow, inputColumn, playerWhoWillPlay.getSymbol())) {
                winner = playerWhoWillPlay.getName();
                return "Player: " + winner + " has won the game. Congratulations!";
            }
        }
        return "Game over!";
    }

    private boolean checkWinner(int row, int column, Symbol symbol) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check row
        for (int i = 0; i < board.getSize(); i++) {
            if (board.getCells()[row][i].getSymbol() != symbol) {
                rowMatch = false;
                break;
            }
        }

        // Check column
        for (int i = 0; i < board.getSize(); i++) {
            if (board.getCells()[i][column].getSymbol() != symbol) {
                columnMatch = false;
                break;
            }
        }

        // Check main diagonal
        for (int i = 0, j = 0; i < board.getSize(); i++, j++) {
            if (board.getCells()[i][j].getSymbol() != symbol) {
                diagonalMatch = false;
                break;
            }
        }

        // Check anti-diagonal
        for (int i = 0, j = board.getSize() - 1; i < board.getSize(); i++, j--) {
            if (board.getCells()[i][j].getSymbol() != symbol) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
