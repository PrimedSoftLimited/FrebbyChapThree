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
public class NumbersDemo2 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int varOne = input.nextInt();
        int varTwo = input.nextInt();
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
