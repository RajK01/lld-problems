package Snake&Ladder;

public class Player {
    private String name;
    private int curPosition;

    public Player(String name) {
        this.name = name;
        this.curPosition = 0;
    }

    public void move(int newPosition) {
        this.curPosition = newPosition;
    }

    public String getPerson() {
        return name;
    }

    public int getCurrentPosition() {
        return curPosition;
    }
}
