package cashregister;

public class StubPurchase extends Purchase{

    private String stringToReturn;

    public StubPurchase(String stringToReturn) {
        super(null);
        this.stringToReturn = stringToReturn;
    }

    @Override
    public String asString() {
        return stringToReturn;
    }
}
