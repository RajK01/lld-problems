package Chess;

// Board class
public class Board {
    private Piece[][] squares = new Piece[8][8];

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        // Place all pieces on the board in starting positions
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                squares[i][j] = new Piece(i, j);
            }
        }
        System.out.println("Board Setup Complete!");
    }
 
    public boolean isMoveValid(Move move) {
        // Validate move for the piece at move's starting position
    }

    public Piece getPiece(Position position) {
        return squares[position.getRow()][position.getCol()];
    }

    public void movePiece(Position from, Position to) {
        Piece piece = getPiece(from);
        squares[to.getRow()][to.getCol()] = piece;
        squares[from.getRow()][from.getCol()] = null;
        piece.setPosition(to);
    }
}