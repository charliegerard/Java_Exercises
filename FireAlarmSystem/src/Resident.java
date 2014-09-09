/**
 * Created by cgerard on 8/09/2014.
 */
public class Resident implements Receiver {
    private String reaction = "Help";

    @Override
    public String reactsToNotification() {
        return reaction;
    }
}
