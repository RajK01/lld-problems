package Snake&Ladder;

public class Dice {
    private int sides = 6;
    public int roll() {
        return (int) (Math.random() * sides) + 1; 
    }
}
