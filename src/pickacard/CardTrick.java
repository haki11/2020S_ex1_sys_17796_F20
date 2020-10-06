package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * -------------------------
 * @author Saima Ishaq
 * Date: October 5, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < magicHand.length; i++) {
            //Card c = new Card();
            magicHand[i] = new Card();            
            int suit = (int) (Math.random()*3+1); // Suit generator (Spades, Diamonds, Hearts, Clubs)
            int num = (int) (Math.random()*12+1); // Number generator (1-13)
           
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i].setValue(num);
            magicHand[i].setSuit(Card.SUITS[suit]);
        }

      System.out.println("Enter a card number: ");
      int cardNum = input.nextInt();
      System.out.println("Enter a card suit: ");
      String cardSuit = input.nextLine();
      
      boolean flag = false;
      
        for (Card magicHand1 : magicHand) {
            if (cardNum == magicHand1.getValue() && cardSuit.equals(magicHand1.getSuit())) {
                flag = true;
            } else {
                flag = false;
            }
        }
      
        for (Card magicHand1 : magicHand) {
            System.out.println("Card number " + magicHand1.getValue() + " card suit " + magicHand1.getSuit());
        }
      
      if (flag = true) {
          System.out.println("Your cards match! :)");
      }
      else if (flag = false) {
          System.out.println("Your cards don't match! :(");
      }
      
      Card match = new Card();
      match.setValue(7);
      match.setSuit("Hearts");
      
      System.out.println("Your card: " + match.getValue() + " Suit: " + match.getSuit());
    }

}
