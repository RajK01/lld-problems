package Chess;

public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private Board board;

    public Game(Player whitPlayer, Player blackPlayer, Board board) {
        this.whitePlayer = whitPlayer;
        this.blackPlayer = blackPlayer;
        this.board = board;
    }

    public void startGame() {
        while(!gameOver()) {

        }
    }

    public boolean isGameOver() {
        // Check of check&mate or Draw conditions
        
    }

    public void switchTurn() {
        currentPlayer = (currentPlayer == blackPlayer) ? whitePlayer : blackPlayer;
    }
}
