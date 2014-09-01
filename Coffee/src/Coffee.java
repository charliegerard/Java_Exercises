/**
 * Created by cgerard on 29/08/2014.
 */
public class Coffee {

    private Ingredient[] allIngredients;

    public Coffee(Ingredient... ingredients) {
        this.allIngredients = ingredients;
    }

    public double price() {
        double result = 0;
        for(Ingredient ingredient : allIngredients){
            result += ingredient.getPrice();
        }

        return result;
    }
}
