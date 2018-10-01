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
public class MetricConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number of choice for conversion");
        double var = input.nextDouble();
        inchesToCm(var);
        gallonsToLitres(var);
    }
    
    static void inchesToCm(double inch){
        double CM = 2.54;
        double conversion = inch * CM;
        System.out.println(inch + " inches converts to " + conversion + "cm");
    }
    static void gallonsToLitres(double gallons){
        double LITRES = 3.7854;
        double conversion = gallons * LITRES;
        System.out.println(gallons + " inches converts to " + conversion +
                "litres");

    }
}
