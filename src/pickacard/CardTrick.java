package pickacard;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Ahmad Bustani
 */

public class CardTrick {

    public static void main(String[] args) {
    Card[] magicHand = new Card[7];
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    
    for(int i = 0; i < magicHand.length; i++) {
      Card c = new Card();
      c.setValue(random.nextInt(14)); 
      c.setSuit(Card.SUITS[random.nextInt(4)]);
      System.out.printf("Card: %d of %s \n", c.getValue(), c.getSuit());
    }
    
    // lucky card
    Card luckyCard = new Card();
    System.out.println("Enter a card number: ");
    luckyCard.setValue(scan.nextInt());
    scan.nextLine();
    System.out.println("Enter a card suit: ");
    luckyCard.setSuit(scan.nextLine());
    
    System.out.printf("Your card is: %d of %s \n", luckyCard.getValue(), luckyCard.getSuit());
 
    

  }
}