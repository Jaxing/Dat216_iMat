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
public class EventHandler {
    private static EventHandler observable = new EventHandler();
    
    private EventListener theObserver;
    
    public static EventHandler getInstance(){
        return observable;
    }
    
    public void setObserver(EventListener observer){
        this.theObserver = observer;
    }
    
    public EventListener getObserver(){
        return this.theObserver;
    }
}
