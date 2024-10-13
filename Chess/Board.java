package Chess;

// Board class
public class Board {
    private Piece[][] squares = new Piece[8][8];

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        // Place all pieces on the board in starting positions
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