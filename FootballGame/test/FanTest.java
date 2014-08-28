import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FanTest {
    @Test
    public void shouldCheerTeamAWhenTeamAScored(){
        String teamA = "A";
        Fan fan = new Fan();

        assertEquals("Go Team A", fan.reactsToGoal(teamA));
    }
}
