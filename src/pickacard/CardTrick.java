package pickacard;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Lee Cruz
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random num = new Random();

        for (int i = 0; i < magicHand.length; i++) {
           Card c = new Card();
            c.setValue(num.nextInt(13)+1); //(insert call to random number generator here)
            c.setSUITS(Card.SUITS[num.nextInt(4)]); //[insert call to random number between 0-3 here])
            
        } 
        
    }

}
