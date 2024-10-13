package Chess;

// Piece class (Abstract)
abstract class Piece {
    protected boolean isWhite;
    protected Position position;

    public Piece(boolean isWhite, Position position) {
        this.isWhite = isWhite;
        this.position = position;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public Position getPosition() {
        return position;
    }

    public abstract List<Move> getValidMoves(Board board);
    public abstract boolean canMove(Board board, Move move);
}

// Rook class extending Piece
class Rook extends Piece {
    public Rook(boolean isWhite, Position position) {
        super(isWhite, position);
    }

    @Override
    public List<Move> getValidMoves(Board board) {
        // Implement rook-specific movement (horizontal/vertical)
    }

    @Override
    public boolean canMove(Board board, Move move) {
        // Implement rook's movement rules
    }
}