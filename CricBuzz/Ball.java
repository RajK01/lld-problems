package CricBuzz;

public class Inning {
    private List<Over> overs;
    private Team battingTeam;
    private int totalRuns;
    private int totalWickets;
    
    public void updateRuns(int runs);
    public void updateWickets();
}