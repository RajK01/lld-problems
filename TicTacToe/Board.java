package TicTacToe;

public class Board {
    private Cell[][] cells;
    private int size;

    // Initialize the board with the size given
    public Board(int size) {
        this.size = size;
        this.cells = new Cell[size][size];
        initializeCells();
    }

    private void initializeCells() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.cells[i][j] = new Cell(i, j, Symbol.NULL);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (cells[i][j].getSymbol() != Symbol.NULL) {
                    System.out.print(cells[i][j].getSymbol() + "");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(Player playerWhoWillPlay, int inputRow, int inputColumn) {
        // Handle out-of-bound condition
        if (inputRow < 0 || inputRow >= this.size || inputColumn < 0 || inputColumn >= this.size) {
            return false;
        }

        // If the cell is already filled, it can't be overridden
        if (this.cells[inputRow][inputColumn].getSymbol() != Symbol.NULL) {
            return false;
        }

        this.cells[inputRow][inputColumn].setSymbol(playerWhoWillPlay.getSymbol());
        return true;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getSize() {
        return size;
    }
}
