package TicTacToe;

import java.util.UUID;

public class Player {
    private UUID uuid;
    private String name;
    private Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.symbol = symbol;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
