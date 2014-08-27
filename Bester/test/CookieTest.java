import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CookieTest {
    @Test
    public void shouldReturnTrueIfACookieHasMoreChipsThanAnother(){
        assertTrue(new Cookie(7).isBetterThan(new Cookie(4)));
    }
}
