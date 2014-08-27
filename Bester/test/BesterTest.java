import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BesterTest{
    @Test
    public void shouldFindBestRectangleInFourRectangles() {
        Rectangle rectangle1 = new Rectangle(4, 1);
        Rectangle rectangle2 = new Rectangle(4, 4);
        Rectangle rectangle3 = new Rectangle(4, 3);
        Rectangle rectangle4 = new Rectangle(4, 2);
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.addAll(Arrays.asList(rectangle1,rectangle2,rectangle3,rectangle4));
        assertEquals(rectangle2, new Bester<Rectangle>().findBest(rectangles));
    }

    @Test
    public void shouldFindBestCookieInFourCookies(){
        Cookie cookie1 = new Cookie(2);
        Cookie cookie2 = new Cookie(4);
        Cookie cookie3 = new Cookie(7);
        Cookie cookie4 = new Cookie(5);
        ArrayList<Cookie> cookies = new ArrayList<Cookie>();
        cookies.addAll(Arrays.asList(cookie1, cookie2, cookie3, cookie4));
        assertEquals(cookie3, new Bester<Cookie>().findBest(cookies));
    }

    @Test
    public void shouldReturnNullIfListIsEmpty(){
        ArrayList<Cookie> cookies = new ArrayList<Cookie>();
        assertNull(new Bester<Cookie>().findBest(cookies));
    }

}
