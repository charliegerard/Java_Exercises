import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReporterTest {

    @Test
    public void shouldCheerTeamAWhenScores(){
        String teamA = "A";
        Reporter reporter = new Reporter();
        String expected = "Point Team A!";

        assertEquals(expected, reporter.reactsToGoal(teamA));
    }

}