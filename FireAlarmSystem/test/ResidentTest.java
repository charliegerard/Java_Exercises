import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cgerard on 9/09/2014.
 */
public class ResidentTest {
    @Test
    public void shouldReactToFireAlarmNotification(){
        Resident resident1 = new Resident();
        String expected = "Help";
        assertEquals(expected, resident1.reactsToNotification());
    }
}
