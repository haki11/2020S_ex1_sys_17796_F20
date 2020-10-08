package pickacard;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Bezawit Abebe
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
            Scanner input = new Scanner(System.in);
            
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            magicHand[i]=c;           
        }

      // code asking the user for Card value and suit, create their card
      System.out.println("Please Enter the Card Value(choose a number between 1-13): ");
      int value = input.nextInt();
      Card user = new Card();
      user.setValue(value);
      input.nextLine();
      
      System.out.println("Enter the Suit (0-Hearts, 1-Diamonds, 2-Spades, 3-Clubs) : ");
      int suitval= input.nextInt();
      user.setSuit(Card.SUITS[suitval]);
      
      Card lucky = new Card();
      lucky.setValue(3);
      lucky.setSuit(Card.SUITS[3]);
      
      //search Magic Hand
      
      int luck = 0;
      for (Card magicCard: magicHand){
          if (magicCard.getValue() == lucky.getValue() && magicCard.getSuit() == lucky.getSuit()){
              luck= 1;          
          } else{
              luck= 0;
          }
      }
      
      //report result 
      if(luck == 0){
          System.out.println("Sorry! This card is not in the Magic Hand.");
      } else {
          System.out.println("Congrats! This card is in the Magic Hand!");
      }
      
      // Confirms card value entered isn't in Magic Hand, print out Magic Hand Magic Hand array
      
      System.out.println(Arrays.deepToString(magicHand));
      
         
      
    }

}
