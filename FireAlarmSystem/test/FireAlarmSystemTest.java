import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cgerard on 8/09/2014.
 */
public class FireAlarmSystemTest {
    @Mock
    Receiver mockReceiver = mock(Receiver.class);

    @Test
    public void shouldNotifyFireDepartmentWhenFireStarts(){
        ArrayList<Receiver> receivers = new ArrayList<Receiver>();
        receivers.add(mockReceiver);

        FireAlarmSystem fireAlarmSystem = new FireAlarmSystem(receivers);
        fireAlarmSystem.notifyReceivers();

        verify(mockReceiver).reactsToNotification();
    }
}
