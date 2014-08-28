import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreboardTest {
    @Test
    public void shouldIncreaseCountWhenTeamAScores(){
        String teamA = "A";
        Scoreboard scoreboard = new Scoreboard();
        int oldScore = 0;
        assertEquals(1, scoreboard.increaseScore(oldScore));
    }
}
