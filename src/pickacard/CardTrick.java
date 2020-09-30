package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Naol Denko
 * @date September 29th 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();  
            c.setValue(c.randomNumber());
            c.setSuit(Card.SUITS[c.randomSuit()]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
