
public class ReporterMock extends Reporter implements Spectator {

    private boolean react = false;
    private String reaction = "Team A Scores!";

    @Override
    public String reactsToGoal(String team) {
        return reaction;
    }

    public boolean shouldReactToGoal() {
        react = true;
        return react;
    }
}
