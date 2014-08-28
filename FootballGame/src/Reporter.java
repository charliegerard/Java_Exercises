
public class Reporter implements Spectator {

    private String speak = "Point Team A!";

//    public String react(String teamA) {
//        return speak;
//    }

    @Override
    public String reactsToGoal(String team){
        return speak;
    }
}
