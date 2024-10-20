package CricBuzz;

import java.lang.reflect.Array;

public class Team {
    private String teamName;
    private List<Player> players;
    private String caption;
    
    public Team(String teamName, String caption) {
        this.teamName = teamName;
        this.caption = caption;
        this.players = new ArrayList<>();
    }

    public String getCaption(String caption) {
        return caption;
    }
}
