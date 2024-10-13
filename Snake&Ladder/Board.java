package Snake&Ladder;

public class Board {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;

    public Board(int size, List<Snake>snakes, List<Ladder> ladders) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public int getNewPosition(int curPos) {
        for(Snake snake : snakes) {
            if(snake.getHead() == curPos) {
                return snake.getTail();
            }
        }

        for(Ladder ladder : ladders) {
            if(ladder.getStart() == curPos) {
                return ladder.getTop();
            }
        }
        return curPos;
    }
}
