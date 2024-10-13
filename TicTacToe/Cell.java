//Cell.java
package TicTacToe;

public class Cell {
    private int row;
    private int column;
    private Symbol symbol;

    public Cell(int row, int column, Symbol symbol) {
        this.row = row;
        this.column = column;
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
