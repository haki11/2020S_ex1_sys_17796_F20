package pickacard;
//Krista Powell
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Random rnd = new Random();
      Scanner scan = new Scanner(System.in);
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(rnd.nextInt(13) + 1);
         c.setSuit(Card.SUITS[rnd.nextInt(3)]);
         magicHand[i] = c;
//Testing outcome:
//System.out.println(c.getValue() + " of " + c.getSuit());
      }

//User must pick a card. Number and suit
      System.out.println("Pick a card, Any card!");
      System.out.println("Pick a number from 1-13");
      int cardPickValue = scan.nextInt();
      System.out.println("pick a suit: Hearts, Diamond, Clubs or Spades");
      String cardPickSuit = scan.next();



// and search magicHand here
      for (Card pickedCard : magicHand) {

//Results: 

         System.out.println(pickedCard.getValue() + " of " + pickedCard.getSuit());
      }
      String userCard = "you chose " + cardPickValue + " of " + cardPickSuit;
      System.out.println(userCard);
   }


}
