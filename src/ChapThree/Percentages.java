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
public class Percentages {
    public static void main(String[] args) {
        // TODO code application logic here
        double varOne = 20;
        double varTwo = 20;
        computePercent(varOne, varTwo);
}
    static void computePercent(double valueOne, double valueTwo){
        double total = valueOne + valueTwo;
        double percentage = (valueOne * 100)/ total;
        System.out.println(valueOne + " is " + (int)percentage +
                "% of " + valueTwo);
        
    }
}
