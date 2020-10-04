package pickacard;

import java.util.Scanner;
import static pickacard.Card.genRandSuit;
import static pickacard.Card.genRandValue;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @co-author Jeremiah Torralba
 */
public class CardTrick {
  
    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card c = new Card();  
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please pick and enter Card: 'Value of Suit'");
        System.out.println("");     
        String value = scanner.next();
        String suit = scanner.next();
        System.out.println("");        
        
         for (int i = 0; i < magicHand.length; i++) {         
            c.setValue(genRandValue());
            c.setSuit(genRandSuit());
            System.out.println(c.getValue() + " of " + c.getSuit());
         }   
        System.out.println(" ");
             
        if(genRandValue().contains(value)) {
            System.out.print("\nYour Card is " + value + " of " + suit);
        }
        
      // I edit directly on github
      // Task 6. luckyCard
      Card luckyCard = new Card();
      luckyCard.setValue(Ace);
      luckyCard.setSuit(Spades);
      System.out.print("\nLucky Card is " + luckyCard.getValue() + " of " + luckyCard.getSuit());
    }
    
    
    
 }
