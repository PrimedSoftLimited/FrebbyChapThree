/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapThree;

/**
 *
 * @author Frebby
 */
public class EventDemo {
    public static void main(String[] args){
        
    Event event = new Event();
    event.setGuestNum(34);
    event.setEventNum("M66");
    System.out.println(event.getGuestNum());
    System.out.println(event.getEventNum());
    CarlysEventPriceWithMethods.motto();
    
    
    
            }
}
