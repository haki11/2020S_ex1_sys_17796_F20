package pickacard;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Elmer Almeida 991507719
 * @date October 3 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        int cardMinValue = 1;
        int cardMaxValue = 13;
        int cardMinSuit = 0;
        int cardMaxSuit = 3;
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * ((cardMaxValue - cardMinValue) + cardMinValue)) + cardMinValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * ((cardMaxSuit - cardMinSuit) + cardMinSuit)) + cardMinSuit]);
            //System.out.print(c.getValue() + " ");
            //System.out.println(c.getSuit());
            // add the card created to the magic hand deck
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // get the card value from the user
        //System.out.print("Please enter your card value: ");
        //int userCardValue = out.nextInt();
        
        // Clean buffer
        //out.nextLine();
        
        // get the suit from the user
        //System.out.print("Please enter your card suit: ");
        //String userCardSuit = out.nextLine();
        
        // create user card
        //Card userCard = new Card();
        //userCard.setValue(userCardValue);
        //userCard.setSuit(userCardSuit);
        
        // create hard coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Hearts");
        
        // and search magicHand here
        boolean found = false;
        
        // loop through the magic hand deck
        for (int i = 0; i < magicHand.length; i++) {
            //System.out.print(magicHand[i].getValue() + " ");
            //System.out.println(magicHand[i].getSuit());
            // check if user card exists in magic deck
            // check if user card exists in magic hand
            //if (userCard.getValue() == magicHand[i].getValue() && userCard.getSuit().equals(magicHand[i].getSuit())) {
            //    found = true;
            //}
            // check if lucky card exists in magic hand
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
                found = true;
            }
        }
        
        //Then report the result here
        if (found) {
            System.out.println("\n*** Your card has been found in the Magic Hand Deck ***");
        } else {
            System.out.println("\nYour card has not been found in the Magic Hand Deck.");
        }
    }

}
