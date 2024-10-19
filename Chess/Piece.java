package Chess;

import java.lang.management.ThreadInfo;

public abstract class Piece {
    protected String color;
    protected int x, y;

    public Piece(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public boolean isValidMove(int newX, int newY);
}

// // Concrete classes
//     public class Pawn extend Piece {
//        public Pawn(String color, int x, int y) {
//             super(color, x, y);
//        }

//        @Override
//        public boolean isValidMove(int newX, int newY) {
//           return (newY == y + 1 && newX == x);
//        }

//        @Override
//        public void setMove(int newX, int newY) {
//           this.x = newX;
//           this.y = newY;
//        }
//     }
