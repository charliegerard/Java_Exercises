/**
 * Created by cgerard on 9/09/2014.
 */
public class FireDepartment implements Receiver {

    private String reaction = "Alert Received";

    @Override
    public String reactsToNotification() {
        return reaction;
    }
}
