import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cgerard on 9/09/2014.
 */
public class FireDepartmentTest {
    @Test
    public void shouldReactWhenFireAlarmStarts(){
        FireDepartment fireDepartment = new FireDepartment();
        String expected = "Alert Received";
        assertEquals(expected, fireDepartment.reactsToNotification());
    }
}
