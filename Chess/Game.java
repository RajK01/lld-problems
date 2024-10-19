package Chess;

import java.io.ObjectInputFilter;

public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private Board[][] board;
    private Status status;

    public Game(Player whitPlayer, Player blackPlayer, Board board) {
        this.whitePlayer = whitPlayer;
        this.blackPlayer = blackPlayer;
        this.board = board;
        this.status = "Ongoing";
    }

    public void startGame() {
        System.out.println("Game Started!");
    }

    public boolean isGameOver() {
        return Status.equals("over");
    }

    public void switchTurn() {
        currentPlayer = (currentPlayer == blackPlayer) ? whitePlayer : blackPlayer;
    }
}
