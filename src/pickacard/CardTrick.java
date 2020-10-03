package pickacard;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Joshua Dumlao
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random ran = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(ran.nextInt(12) +1);
            c.setSuit(Card.SUITS[ran.nextInt(3)]);
            magicHand[i] = c;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the suit for your card:");
        for(int i=0;i<Card.SUITS.length; i++)
        {
            System.out.println(i + ": " + Card.SUITS[i]);
        }
        int suit = sc.nextInt();
        
        System.out.println("Please enter the value of the card you wish to create");
        int val = sc.nextInt();
        
        Card playersCard = new Card();
        playersCard.setSuit(Card.SUITS[suit]);
        playersCard.setValue(val);
        
        boolean found = false;
        for(Card c: magicHand)
        {
            if((c.getSuit().equals(playersCard.getSuit())) && (c.getValue()==(playersCard.getValue())))
            {
                found=true;
                break;
            }
        }//end for
        if(found)
            {
                System.out.println("You win! Your lucky card is in the hand");
            }
        else
            {
                System.out.println("I'm sorry, your card was not in the lucky hand");
            }

      // I edit directly on github
    }

}
