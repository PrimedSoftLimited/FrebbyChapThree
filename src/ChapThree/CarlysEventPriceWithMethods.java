/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapThree;

import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class CarlysEventPriceWithMethods {
    
    public static void main(String[] args){
        guestNum();
        motto();
        evaluate();
    }
    
    
    
    
    public static int guestNum(){
   Scanner input = new Scanner(System.in);
   int guest = input.nextInt();
        return guest;
    }
    public static void motto(){
        System.out.println("BLAH BLAH BLAH");
    }
    public static void evaluate(){
        double price = 35;
        double totalPrice = price * guestNum();
        System.out.println("Total Price " + totalPrice);
        if(price > 50){
            System.out.println("Large Event");
        }
        else
            System.out.println("Not large");
        
        
    }
}

