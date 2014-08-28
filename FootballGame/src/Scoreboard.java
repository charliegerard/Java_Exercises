

public class Scoreboard implements Spectator{
    int oldScore = 0;

    public int increaseScore(int oldScore) {
        return oldScore + 1;
    }

    @Override
    public String reactsToGoal(String team){
        return String.valueOf(oldScore + 1);
    }
}
