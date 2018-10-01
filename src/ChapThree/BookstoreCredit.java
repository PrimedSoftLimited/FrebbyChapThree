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
public class BookstoreCredit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Name please: ");
        String name = input.nextLine();
        System.out.println("Greade point average please: ");
        double gradePointAverage = input.nextDouble();
        creditAward(name, gradePointAverage);
       
    }
    static void creditAward(String name, double average){
        double credit = average * 10;
        System.out.println(name + ", your grade point average is " + average + 
                ". And score after credit awarded is " + credit);
    }
}
