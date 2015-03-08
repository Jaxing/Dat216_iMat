/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customBackend;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Erik
 */
public class Lists {


    private static Lists instance = new Lists();
    
    private Lists() {
        this.allLists = new ArrayList();
        this.boughtLists = new NamedList("Bought Lists",new ArrayList<NamedList>());
        
        allLists.add(new NamedList("All products",handler.getProducts()));

        allLists.add(new NamedList("Newest",new ArrayList<Product>()));
        allLists.add(new NamedList("Recommended",new ArrayList<Product>()));
        allLists.add(new NamedList("Favourite",new ArrayList<Product>()));
        allLists.add(boughtLists);
        allProducts = getList("All products");
        newest = getList("Newest");
        recommended = getList("Recommended");
        favourite = getList("Favourite");

    }
    
    public static Lists getInstance(){

        return instance;
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
        while(recommended.size() < 10){
            Random intrand = new Random();
            if(!recommended.contains(allProducts.get(intrand.nextInt(100)))){
                recommended.add(allProducts.get(intrand.nextInt(100)));
            }
        }
        return recommended;
    }
   
   public List<Product> createNewList(String listName){
        if(!listExists(listName)){
            NamedList<Product> newList = new NamedList(listName, new ArrayList());
            allLists.add(newList);
            return newList;
        }
        return null;
   }
   
    public void addToList(String listName,List<Product> p){
        if(listExists(listName)){
            getList(listName).addAll(p);
        } else {
            createNewList(listName);
            
            getList(listName).addAll(p);
        }
    }
    
    
    
    private boolean listExists(String listName){
        for(NamedList list : allLists){
            if(list.getName().equals(listName)){
                return true;
            }
        }
        return false;
    }
    
    public List<Product> getList(String listName){
        for(NamedList list: allLists){
            //System.out.println(list.getName());
            if(list.getName().equals(listName)){
                
                return list;
            }
        }
        return null;
    }
    
    public List<Product> getFavourites(){
        return favourite;
    }
    
    public NamedList<NamedList> getBoughtLists(){
        return boughtLists;
    }
    
    public List<Product> search(String search){
        return handler.findProducts(search);
    }
    
    public void addFavourite(Product p){
        handler.addFavorite(p);
        favourite.add(p);
        
    }
    
    public void removeFavourite(Product p){
        handler.removeFavorite(p);
        favourite.remove(p);
        
    }
    
    public List<NamedList> getAllLists() {
        return allLists;
    }
    
    private IMatDataHandler handler = IMatDataHandler.getInstance();

    private List<NamedList> allLists;
    private List<Product> allProducts;
    private List<Product> newest;
    private List<Product> recommended;
    private List<Product> favourite;
    private NamedList<NamedList> boughtLists;
}

