/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customBackend;

import se.chalmers.ait.dat215.project.Product;

public class RecipeIngredient {
    private final Product product;
    private final double amountPerServing;
    
    public RecipeIngredient(Product product, double amountPerServing) {
        this.product = product;
        this.amountPerServing = amountPerServing;
    }
    
    public Product getProduct() {
        return this.product;
    }
    
    public int getAmount(int servings) {
        return (int) Math.ceil(this.amountPerServing*servings);
    }
    
    public String toString(int servings) {
        return String.valueOf(this.getAmount(servings)) + " " + this.product.getUnitSuffix() +" "+ this.product.getName();
    }
}
