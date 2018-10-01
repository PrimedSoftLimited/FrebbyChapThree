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
public class PaintCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
    }
    static double wallAreaCalc(double width, double height){
         double perimeter = width * 4;
                double wallArea = perimeter * height;

        return wallArea;
    }
    static void numOfGallons(){
        
    }
}
