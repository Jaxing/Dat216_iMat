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
    
    private static Profile instance = new Profile();
    
    private Profile(){
        
    }
    
    public static Profile getInstance(){
        return instance;
    }
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
    
    public void setCreditCard(String s){
        creditCard.setCardNumber(s);
        creditCard.setCardType("visa");
    }
    
    public void setValidDate(int mm,int yy){
        creditCard.setValidMonth(mm);
        creditCard.setValidYear(yy);
    }
    
    public void setCCV(int ccv){
        creditCard.setVerificationCode(ccv);
    }
    
    public String getCreditCard(){
        return creditCard.getCardNumber();
    }
    
    public String getCardType(){
        return creditCard.getCardType();
    }
    
    public int getValideMonth(){
        return creditCard.getValidMonth();
    }
    
    public int getValideYear(){
        return creditCard.getValidYear();
    }
    
    public int getCCV(){
        return creditCard.getVerificationCode();
    }
    
    public String getAddress(){
        return customer.getAddress();
    }
    
    public String getEmail(){
        return customer.getEmail();
    }
    
    public String getFirstName(){
        return customer.getFirstName();
    }
    
    public String getLastName(){
        return customer.getLastName();
    }
    
    public String getPostCode(){
        return customer.getPostCode();
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
    CreditCard creditCard = handler.getCreditCard();
}
