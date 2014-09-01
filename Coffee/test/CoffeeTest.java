import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cgerard on 29/08/2014.
 */
public class CoffeeTest {
    @Test
    public void shouldCreateACappuccino(){
        Ingredient ingredientOne = new SteamedMilk();
        Ingredient ingredientTwo = new Espresso();
        Coffee cappuccino = new Coffee(ingredientOne, ingredientOne, ingredientTwo);
        assertEquals(cappuccino.price(), 1.70, 0.0000001);
    }

    @Test
    public void shouldCreateAMocha(){
        Ingredient ingredientOne = new SteamedMilk();
        Ingredient ingredientTwo = new Espresso();
        Ingredient ingredientThree = new ChocolateSyrup();
        Ingredient ingredientFour = new WhipCream();
        Coffee mocha = new Coffee(ingredientOne, ingredientTwo, ingredientThree, ingredientFour);
        assertEquals(mocha.price(), 2.10, 0.0000001 );
    }

    @Test
    public void shouldCreateALatte(){
        Ingredient ingredientOne = new SteamedMilk();
        Ingredient ingredientTwo = new Espresso();
        Ingredient ingredientThree = new WhipCream();
        Coffee mocha = new Coffee(ingredientOne, ingredientOne, ingredientTwo, ingredientThree);
        assertEquals(mocha.price(), 2.50, 0.0000001 );
    }

    @Test
    public void shouldCreateAnAmericano(){
        Ingredient ingredientOne = new Espresso();
        Ingredient ingredientTwo = new Water();
        Coffee mocha = new Coffee(ingredientOne, ingredientTwo);
        assertEquals(mocha.price(), 0.50, 0.0000001 );
    }

    @Test
    public void shouldCreateACortado(){
        Ingredient ingredientOne = new Espresso();
        Ingredient ingredientTwo = new SteamedMilk();
        Coffee mocha = new Coffee(ingredientOne, ingredientOne, ingredientTwo);
        assertEquals(mocha.price(), 1.60, 0.0000001 );
    }
}

