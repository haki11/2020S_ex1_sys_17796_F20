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
            int suit, num;
            
            suit = (int) (Math.random()*3+1); // Suit = Spades, Diamonds, Hearts, Clubs
            num = (int) (Math.random()*12+1); // Number generator
            magicHand[i].setValue(num);
            magicHand[i].setSuit(Card.SUITS[suit]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

      System.out.println("Enter a card number: ");
      int cardNum = input.nextInt();
      System.out.println("Enter a card suit: ");
      String cardSuit = input.nextLine();
      
      boolean flag = false;
      
      for (int j = 0; j < magicHand.length; j++) {
          if (cardNum == magicHand[j].getValue() && cardSuit == magicHand[j].getSuit()){
              flag = true;
          }
          else {
              flag = false;
          }
      }
    }

}
