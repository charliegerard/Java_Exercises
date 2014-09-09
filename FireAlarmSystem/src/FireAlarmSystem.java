import java.util.ArrayList;
import java.util.List;

/**
 * Created by cgerard on 8/09/2014.
 */
public class FireAlarmSystem{

    private List<Receiver> receivers;

    public FireAlarmSystem(ArrayList<Receiver> receivers){
        this.receivers = receivers;
    }

    protected void notifyReceivers() {
        for(Receiver receiver : receivers){
            receiver.reactsToNotification();
        }
    }
}
