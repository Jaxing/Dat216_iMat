/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customBackend;

import cards.GroceryListCard;

/**
 *
 * @author Erik
 */
public interface EventListener {
    public void update(String selectedItem);
    public void grocerySubNodeSelected(String selectedItem);
    public void categorySubNodeSelected(String selectedItem);
    public void update();
    public void closeCartCard();
    public void addToSideMenu(String name);
    public void addGroceryCard(String name,GroceryListCard card);
    public void bannerClicked(int i);
}
