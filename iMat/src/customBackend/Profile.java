/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customBackend;

import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.User;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.CreditCard;
/**
 *
 * @author Erik
 */
public class Profile {
    
    public String getPassword(){
        return user.getPassword();
    }
    
    public void setPassword(String s){
        user.setPassword(s);
    }
    
    public String getUsername(){
        return user.getUserName();
    }
    
    public void setUsername(String s){
        user.setUserName(s);
    }
    
    public void getAddress(){
        customer.getAddress();
    }
    
    public void getEmail(){
        customer.getEmail();
    }
    
    public void getFirstName(){
        customer.getFirstName();
    }
    
    public void getLastName(){
        customer.getLastName();
    }
    
    public void getPostCode(){
        customer.getPostCode();
    }
    
    public void setAddress(String address){
        customer.setAddress(address);
    }
    
    public void setEmail(String email){
        customer.setEmail(email);
    }
    
    public void setFirstName(String name){
        customer.setFirstName(name);
    }
    
    public void setLastName(String lastname){
        customer.setLastName(lastname);
    }
    
    public void setPostCode(String postCode){
        customer.setPostCode(postCode);
    }
    
    IMatDataHandler handler = IMatDataHandler.getInstance();
    User user = handler.getUser();
    Customer customer = handler.getCustomer();
}
