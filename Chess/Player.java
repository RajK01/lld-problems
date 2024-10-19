package Chess;

public class Player {
    private String name;
    private boolean isWhite;
    private List<Piece> pieces; // Aggregation

    public Player(String name, boolean isWhite, List<Piece> pieces) {
        this.name = name;
        this.isWhite = isWhite;
        this.pieces = pieces;
    }

    public String getName() {
        return name;
    }

    public void movePieces(Piece piece, int x, int y) {
        if(piece.isValidMove(x, y)) {
            piece.move(x, y);
            System.out.println(name + "moved");
        } else {
            System.out.println("Invalid Move!");
        }
    }

}
