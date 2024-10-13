package Snake&Ladder;

import TicTacToe.Board;
import TicTacToe.Player;


class Game {
    private Board board;
    private Dice dice;
    private Queue<Player>players;

    public Game(Board board, Dice dice, Queue<Player> players) {
        this.board = board;
        this.dice = dice;
        this.players = players;
    }

    public void startGane() {
        while(true) {
            Player curPlayer = players.poll();
            int diceValue = dice.roll();
            int newPos = curPlayer.getPosition() + diceValue;

            newPos = board.getNewPosition(newPos);
            if(newPos >= board.getSize()) {
                System.out.println(curPlayer.getName() + "Wins!");
                break;
            }
            // Add players back into the queue.
            players.add(curPlayer);
        }
    }
}