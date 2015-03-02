/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customBackend;

/**
 *
 * @author Erik
 */
public interface Observable {
    public void update(String selectedItem);
    public void closeCartCard();
    public void addToSideMenu(String name);
}
