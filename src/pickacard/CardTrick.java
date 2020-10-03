package pickacard;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Fareeha Mirza
 * @date 02-10-2020
 */
public class CardTrick {

//    public static int randomCardVal(){
//        int val = (int) (1 + (int)(Math.random() * 13));
//        return val;
//    }
    
    public static void main(String[] args) {
        boolean check = false;
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random()* 13)+ 1);   //set value to a random number from 1 to 13
            c.setSuit(Card.SUITS[(int) (Math.random()*4)]); //set value to a random number from 0 to 3
            // I am adding more code to work with on the assignment
            
            magicHand[i] = c;
        }

//         Scanner input = new Scanner (System.in);
//         System.out.println("Enter a card number from 1 to 13");
//         int value = input.nextInt();
//         System.out.print("Enter a suit number between 0-3(integer) (0 = hearts, 1 = diamonds, 2 = spades, and 3 = clubs): ");
//         int suit = input.nextInt();
//         Card b = new Card();
        
//         b.setValue(value);
//         b.setSuit(Card.SUITS[(int)(suit)]);
        
        // I edit directly on github
        
        Card luckyCard = new Card();    //create a lucky card
        luckyCard.setValue(2);  //set the value to 2
        luckyCard.setSuit(Card.SUITS[1]);   //set the suit to 1
              
        System.out.println("your lucky card is: " + luckyCard.getValue() + " of " + luckyCard.getSuit());   //show the lucky card
        
        for (Card c : magicHand){   //loop through the magic hand
            if ((luckyCard.getValue() == c.getValue()) && (luckyCard.getSuit() == c.getSuit())){
                check = true;   //if the lucky card is in the magic hand set the boolean to true
            }
        }
        
        if (check){ //if the boolean is true show winning message
            System.out.println("WINNER Your lucky card is in the magic hand!");
        }
        else {  //otherwise show a losing message
            System.out.println("You lost... Your lucky card is not in the magic hand...");
        }
        
        System.out.println("\nThe magic hand:");
        
        for (Card c : magicHand) {
            System.out.println(c.getValue() + " of " + c.getSuit());    //show the magic hand
        }


    }

}
