/**
 * Created by cgerard on 29/08/2014.
 */
public enum Coffee {
    MOCHA(new SteamedMilk(), new Espresso(), new ChocolateSyrup(), new WhipCream()),
    LATTE(new SteamedMilk(), new SteamedMilk(), new Espresso(), new WhipCream()),
    AMERICANO(new Espresso(), new Water()),
    CAPPUCCINO(new Espresso(), new SteamedMilk(), new SteamedMilk()),
    CORTADO(new Espresso(), new Espresso(), new SteamedMilk());

    private Ingredient[] allIngredients;

    private Coffee(Ingredient... ingredients) {
        this.allIngredients = ingredients;
    }

    public double price() {
        double result = 0;
        for(Ingredient ingredient : allIngredients){
            result += ingredient.getPrice();
        }
        return result;
    }

    public Ingredient[] getIngredients() {
        return this.allIngredients;
    }
}
