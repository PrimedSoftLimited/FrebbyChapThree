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
public class TestSandwich {
    public static void main(String[] args){
    Sandwich sandwich = new Sandwich();
    sandwich.setBreadType("Agege");
    sandwich.setPrice(46);
    System.out.println(sandwich.getBreadType());
        System.out.println(sandwich.getPrice());

}
}