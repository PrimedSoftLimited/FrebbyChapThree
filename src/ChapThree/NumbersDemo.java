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
public class NumbersDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int varOne = 6;
        int varTwo = 9;
        displayTwiceTheNumber(varOne);
        displayTwiceTheNumber(varTwo);
        displayNumberPlusFive(varOne);
        displayNumberPlusFive(varTwo);
        displayNumberSquared(varOne);
        displayNumberSquared(varTwo);
        
    }
    public static void displayTwiceTheNumber(int value){
        System.out.println(value + "\n" + value);
    }
    public static void displayNumberPlusFive(int value){
        System.out.println(value + 5);
    }
    public static void displayNumberSquared(int value){
        System.out.println(value * value);
    }
}
