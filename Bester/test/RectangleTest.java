import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void shouldReturnTrueIfThisBetterThanAnother()  {
        assertTrue(new Rectangle(8,7).isBetterThan(new Rectangle(3,4)));
    }
}
