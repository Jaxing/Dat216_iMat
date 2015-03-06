package customBackend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

public class ExampleRecipes {
    
    
    public List<Recipe> getExampleRecipes() {
        List<Recipe> l = new ArrayList<>();
        String[] names = {"Pannkakor","Pasta med köttfärssås","Lasagne","Korv med bröd","Grönsakssoppa","Våfflor","Köttbullar och makaroner"};
        
        List<Product> products = IMatDataHandler.getInstance().findProducts("");
        Random r = new Random();
        
        for (String n : names) {
            l.add(randomRecipe(products, n, r));
        }
        
        return l;
    }
    
    private Recipe randomRecipe(List<Product> products, String name, Random r) {
        List<RecipeIngredient> ingredients = new ArrayList<>();
        
        for (int i = 4+r.nextInt(4);i>0;i--) {
            double[] d = {0.5,0.75,1.0,1.5,2.0,2.5,3.0};
            Product product = products.get(r.nextInt(products.size()-1));
            RecipeIngredient ri = new RecipeIngredient(product, d[r.nextInt(d.length-1)]);
            ingredients.add(ri);
        }
        
        return new Recipe(name,ingredients);
    }
    
    
}
