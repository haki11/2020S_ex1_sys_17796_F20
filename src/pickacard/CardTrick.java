package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Naol Denko
 * @date September 29th 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();  
            c.setValue(c.randomCardNumber());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        luckyCard.setSuit("Diamonds");
        
            
        // Users Enters A Card Number & Chooses A Card Suit
        // System.out.println ("Pick a card number between 1-10 or J = 11, Q = 12, K = 13");
        // int cardValue = input.nextInt();
        // System.out.println ("Pick a suit: Clubs, Diamonds, Spades, or Hearts");
        // String cardSuit = input.next();
       

        System.out.println ("Cards In The Hand");
        
        // Searches Magic Hand 
        for (Card card : magicHand) {
            System.out.println (card.getValue() + " of " + card.getSuit());
         }
           System.out.println ("Your card's number is: " + luckyCard.getValue() + " and your card's suit is: " + luckyCard.getSuit());
           
       for (Card cardCheck : magicHand) {
            if (luckyCard.getValue() == cardCheck.getValue() && luckyCard.getSuit() ==  cardCheck.getSuit()) {
                System.out.println ("Congrats, your card matched one of the cards in the hand!"); // Displayed If The User Guessed The Right Card
            }
            
            else {
                System.out.println ("No match.");
            }
      }
    }
}
