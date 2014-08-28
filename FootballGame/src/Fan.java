
public class Fan implements Spectator{
    public String cheer = "Go Team A";

//    public String react(String team){
//        return cheer;
//    }

    @Override
    public String reactsToGoal(String team){
        return cheer;
    }
}
