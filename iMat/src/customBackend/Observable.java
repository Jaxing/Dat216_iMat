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
public class Observable {
    private static Observable observable = new Observable();
    
    private void Observable(){};
    
    private Observer theObserver;
    
    public Observable getInstance(){
        return observable;
    }
    
    public void setObserver(Observer observer){
        this.theObserver = observer;
    }
    
    public Observer getObserver(){
        return this.theObserver;
    }
}
