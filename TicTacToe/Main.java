package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("A", Symbol.O);
        Player player2 = new Player("B", Symbol.X);

        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);

        game.setupGame(playerList, 3);
        String gameStatus = game.startGame();
        System.out.println(gameStatus);
    }
}