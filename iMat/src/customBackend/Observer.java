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
public class Observer {
    private static Observer observable = new Observer();
    
    private Observable theObserver;
    
    public static Observer getInstance(){
        return observable;
    }
    
    public void setObserver(Observable observer){
        this.theObserver = observer;
    }
    
    public Observable getObserver(){
        return this.theObserver;
    }
}
