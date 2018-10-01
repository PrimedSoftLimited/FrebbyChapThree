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
public class Event {
    public final static int PRICE_PER_GUEST = 35;
    public final static int LARGE_EVENT_CUT_OFF = 50;
    private String eventNum;
    private int guestNum;
    private double price;

    public void setEventNum(String eventNum) {
        this.eventNum = eventNum;
    }

    public void setGuestNum(int guestNum) {
        this.guestNum = guestNum;
    }

    public String getEventNum() {
        return eventNum;
    }

    public int getGuestNum() {
        return guestNum;
    }

    public double getPrice() {
        return price;
    }
    
    
}
