/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customBackend;

import java.util.List;
import java.util.ArrayList;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Order;
/**
 *
 * @author Erik
 */
public class Lists {
    
 private static Lists lists = new Lists();

    private Lists() {
        this.allLists = new ArrayList();

        allLists.add(new NamedList("All products",handler.getProducts()));
        allLists.add(new NamedList("Newest"));
        allLists.add(new NamedList("Recommended"));
        allLists.add(new NamedList("Favourite"));
        allLists.add(new NamedList("Created list"));
    }
    
    public static Lists getInstance(){
        return lists;
    }
    
    /*
        Returns all products in the IMatDataHandler
    */
    public List<Product> getAllProducts(){
        //allProducts.clear();
        
        return allProducts;
    }
    
    /*
        Returns the 10 newest products added in IMatDataHandler
    */
    public List<Product> getNewest(){
        newest.clear();
        for(int i = 1; i<11; i++){
            newest.add(allProducts.get(allProducts.size()-i));
        }
        return newest;
    }
    
    /*
        Adds 10 products to recommended list
    */
   public List<Product> getRecommended(){
        recommended.clear();
        if(favourite.size() != 0){
            for(int i = favourite.size(); i > 0; i--){
                if(recommended.size() > 9){
                    break;
                }
                try{
                    //Gets first element in the category of the last element in the favourite list
                    Product tmpProd = handler.getProducts(favourite.get(i-1).getCategory()).get(0);

                    int n = 1;
                    /*avoids adding the same element twice in the recommended list, or adding
                    * a favourited element in the recommended list
                    */
                    while(recommended.contains(tmpProd)||favourite.contains(tmpProd)){
                        tmpProd = handler.getProducts(favourite.get(i-1).getCategory()).get(n);
                        n++;
                    }
                    recommended.add(tmpProd);
                
                //if a list doesn't have sufficient elements, just skip it
                } catch (IndexOutOfBoundsException e){};
            }
        }
        int i = 0;
        while(recommended.size() < 10){
            if(!recommended.contains(allProducts.get(i))){
                recommended.add(allProducts.get(i));
            }
            i++;
        }
        return recommended.getList();
    }
    
   public boolean creatNewList(String listName){
       for(NamedList list : allLists){
            if(list.getName().equals(listName)){
                return false;
            }
        }
        allLists.add(new NamedList(listName));
        return true;
   }
   
    /*public void addToList(String listName){
        if()
    }
    
    private boolean listExists(String listName){
        for(List list : allLists){
            if()
        }
    }*/
    
    public List<NamedList> getList(String listName){
        for(NamedList list : allLists){
            if(list.getName().equals(listName)){
                return list;
            }
        }
        return null;
    }
    
    public List<Product> getFavourit(){
        return favourite;
    }
    
    public void addFavourite(Product p){
        handler.addFavorite(p);
        favourite.add(p);
        System.out.println("Added favourite");
    }
    
    public void removeFavourite(Product p){
        handler.removeFavorite(p);
        favourite.remove(p);
        System.out.println("Removed favourite");
    }
    
    private IMatDataHandler handler = IMatDataHandler.getInstance();

    private List<NamedList> allLists;
    private List<NamedList> allProducts = getList("All products");
    private List<NamedList> newest = getList("Newest");
    private List<NamedList> recommended = getList("Recommended");
    private List<NamedList> favourite = getList("Favourite");
    private List<NamedList> createdLists = getList("Created list");
}

