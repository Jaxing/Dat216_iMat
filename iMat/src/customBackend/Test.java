/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customBackend;

import java.util.List;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;
/**
 *
 * @author Erik
 */
public class Test {
     public static void main(String args[]){
        
        Lists lists = Lists.getInstance();
        List<Product> allProducts = lists.getAllProducts();
        
        List<Product> recommended = lists.getRecommended();
        
        System.out.println(allProducts.get(allProducts.size() -1).getCategory());
    }
}
