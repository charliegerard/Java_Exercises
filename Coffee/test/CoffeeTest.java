import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cgerard on 29/08/2014.
 */
public class CoffeeTest {
    @Test
    public void shouldCheckThePriceOfACappuccino(){
        assertEquals(Coffee.CAPPUCCINO.price(), 1.70, 0.0000001);
    }

    @Test
    public void shouldCheckThePriceOfAMocha(){
        assertEquals(Coffee.MOCHA.price(), 2.10, 0.0000001 );
    }

    @Test
    public void shouldCheckThePriceOfALatte(){
        assertEquals(Coffee.LATTE.price(), 2.50, 0.0000001 );
    }

    @Test
    public void shouldCheckThePriceOfAnAmericano(){
        assertEquals(Coffee.AMERICANO.price(), 0.50, 0.0000001 );
    }

    @Test
    public void shouldCheckThePriceOfACortado(){
        assertEquals(Coffee.CORTADO.price(), 1.60, 0.0000001 );
    }

}

