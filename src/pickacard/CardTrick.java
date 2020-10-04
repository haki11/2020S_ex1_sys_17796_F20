package pickacard;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Semaj Primm
 * @date 4 October, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            // Initalizes r as 
            Random r = new Random();
            // Generates a random number between 1-13 inclusively
            int cardRandomValue = r.nextInt(13)+1;
            // Sets card value to random number
            c.setValue(cardRandomValue);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

      // I edit directly on github
    }

}
