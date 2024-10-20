package CricBuzz;

import java.time.LocalDateTime;

public class Match {
    private String matchId;
    private String venue;
    private List<Team> teams;
    private List<Inning> innings;
    private LocalDateTime startTime;

    public Match(String matchId, String venue, LocalDateTime startTime) {
        this.matchId = matchId;
        this.venue = venue;
        this.startTime = startTime;
        this.teams = new ArrayList<>();
        this.innings = new ArrayList<>();
    }

    public void updateScore() {

    }

    public List<Inning> addInnings(List<Team> teams) {
        teams.add(Team);
    }
}
