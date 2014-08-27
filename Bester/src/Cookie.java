
public class Cookie implements Betterable<Cookie> {
    private final int numOfChips;

    public Cookie(int numOfChips) {
        this.numOfChips = numOfChips;
    }

    @Override
    public boolean isBetterThan(Cookie cookie) {
        if(cookie == null) return true;
        return this.numOfChips > cookie.numOfChips;
    }
}
