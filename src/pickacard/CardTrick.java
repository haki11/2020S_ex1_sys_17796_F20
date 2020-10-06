package pickacard;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Hassan Naveed
 * Date: 10/05/20
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " " + card.getSuit());
        }
    
        /*Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter a card number between 1 & 13");
        int urChoice = inp.nextInt();
        
        System.out.println("Enter a Suit For that Card:");
        String urSuit = inp.next();*/
        
        /*if(Arrays.asList(magicHand).contains(urChoice))
            if (Arrays.asList(magicHand).contains(urSuit))
                System.out.println("Correct Choice!!!");
            
            else {
                System.out.println("Wrong Choice");
            }*/
            
        // Created a luckyCard with hard coded suits and values
        Card luckyCard = new Card();
        String suit = "Clubs";
        int value = 2;
        luckyCard.setSuit(suit);
        luckyCard.setValue(value);
        
        System.out.println("");
        
        //validation here
        boolean inHand = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(luckyCard.getSuit()) && magicHand[i].getValue() == luckyCard.getValue()) {
                inHand = true;
            }
        }
        if (inHand) {
            System.out.println("it's in hand");
        } else {
            System.out.println("not in hand");
        }
    }
    
}
