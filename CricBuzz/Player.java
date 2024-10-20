package CricBuzz;

public class Player {
    private String playerId;
    private String name;
    private PlayerType type; // batsman, bowler, all-rounder
    private PlayerStats playerStats;

    public Player(String playerId, String name, PlayerType type, playerStats playerStats) {
        this.playerId = playerId;
        this.name = name;
        this.type = type;
        this.playerStats = playerStats;
    }
    
    public String getPlayerStats(String name, PlayerStats playerStats) {
        return playerStats
    }

}