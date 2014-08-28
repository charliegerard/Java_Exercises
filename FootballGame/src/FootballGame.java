import java.util.ArrayList;
import java.util.List;


public class FootballGame {

//    private List<Reporter> reporters;
//    private List<Fan> fans;
    private List<Spectator> spectators;

    public FootballGame(ArrayList<Spectator> spectators){
        this.spectators = spectators;
    }

//    public void add(ArrayList<Spectator> spectators) {
//        spectators.add(spectators);
//    }

    public void makeScore(String teamA) {
        for (Spectator spectator : spectators){
            spectator.reactsToGoal(teamA);
        }
    }
}
