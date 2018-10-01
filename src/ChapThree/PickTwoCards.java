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
public class PickTwoCards {

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();

        final int CARDS_IN_SUIT = 13;
        int random1 = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        int random2 = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        int random3 = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);

        char spades = card1.getSpades();
        char diamonds = card2.getDiamonds();
        char clubs = card3.getClubs();

        System.out.println(spades + " for Spades. Random is: " + random1);
        System.out.println(diamonds + " for Diamonds. Random is: " + random2);
        System.out.println(clubs + " for Clubs. Random is: " + random3);
    }
}
