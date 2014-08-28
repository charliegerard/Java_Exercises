import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class FootballGameTest {

    @Test
    public void shouldReactToGoal(){
        ArrayList<Spectator> spectators = new ArrayList<Spectator>();
        ReporterMock reporterMock = new ReporterMock();
        Fan fan = new Fan();
        spectators.add(reporterMock);
        spectators.add(fan);
        FootballGame footballGame = new FootballGame(spectators);
        footballGame.makeScore("A");

        assertTrue(reporterMock.shouldReactToGoal());
    }

}
