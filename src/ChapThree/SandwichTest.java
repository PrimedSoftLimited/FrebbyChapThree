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
public class SandwichTest {
    public static void main(String[] args){
        Sandwich newSandwich = new Sandwich();
      
        newSandwich.setMainIngredient("tuna");
        newSandwich.setBreadType("agege");
        newSandwich.setPrice(45);
                System.out.println(newSandwich.getMainIngredient());
                System.out.println(newSandwich.getBreadType());
                System.out.println(newSandwich.getPrice());
        
}
}