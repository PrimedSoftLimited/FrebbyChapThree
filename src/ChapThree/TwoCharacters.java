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
public class TwoCharacters {
    public static void main(String[] args){
    MyCharacter puns = new MyCharacter();
    MyCharacter boss = new MyCharacter();
    puns.setEyesNum(4);
    puns.setLivesNum(5);
    puns.setColor("green");
    displayPuns(puns.getColor(), puns.getEyesNum(), puns.getLivesNum());
    
    boss.setColor("black");
    boss.setEyesNum(10);
    boss.setLivesNum(15);
        displayBoss(boss.getColor(), boss.getEyesNum(), boss.getLivesNum());

    
    
    }
    public static void displayPuns(String color, int eyes, int lives){
        System.out.println("Pun attributes; " + "Color: "+ color + " Eyes: " +
                eyes + "  Lives: " + lives );
    }
    public static void displayBoss(String color, int eyes, int lives){
       System.out.println("Boss attributes; " + "Color: "+
                color + " Eyes: " + eyes + " Lives: " + lives);
    }
}
