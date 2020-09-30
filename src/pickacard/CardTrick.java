package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Noah McNabb
 * @date 30/09/20
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //initialize scanner for inputs
        
        Card[] magicHand = new Card[7];
        
        //Generate the random card objects to fill magicHand array
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            int randomVal = (int)(Math.random() * (13 - 1 +1) + 1);
            c.setValue(randomVal);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomSuit = (int)(Math.random() * (3 - 0 +1) + 0);
            c.setSuit(Card.SUITS[randomSuit]);
            
            magicHand[i] = c; // add generated card at [i] in magicHands
        }
        
        ////Prompt the user to select their card aswell as handle bad inputs
        //System.out.print("Pick a card, any card!\nEnter card value: ");
        //int userVal = input.nextInt();
        //while (userVal < 1 || userVal > 13) {
        //    System.out.print("Must enter a value between 1 and 13: ");
        //    userVal = input.nextInt();
        //}
        //System.out.print("Enter card suit (Hearts=0, Diamonds=1, Spades=2, Clubs=3): ");
        //int userSuit = input.nextInt();
        //while (userSuit < 0 || userSuit > 3) {
        //    System.out.print("Must enter a value between 0 and 3: ");
        //    userSuit = input.nextInt();
        // }
        
        ////Create the card object for the users chosen card
        //Card userCard = new Card();
        //userCard.setSuit(Card.SUITS[userSuit]);
        //userCard.setValue(userVal);
        
        //Create the luckyCard object and set is values
        Card luckyCard = new Card();
        luckyCard.setSuit(Card.SUITS[0]);
        luckyCard.setValue(4);
        
        //Search for the chosen card in magicHand and tell the user the results
        for (int i=0; i<magicHand.length; i++){
            if(luckyCard.getValue() == magicHand[i].getValue()){
                if (luckyCard.getSuit().equals(magicHand[i].getSuit())){
                    System.out.println("The lucky card " + luckyCard.toString() + " is in the magic hand!");
                    break;
                }
            } else {
                if (i == magicHand.length - 1){
                    System.out.println("The lucky card " + luckyCard.toString() + " is not in the magic hand.");
                }
            }
        }
        
//        //Print the magic hand for testing purposes
//        for (int i=0; i<magicHand.length; i++){
//            System.out.println(magicHand[i].toString());
//        }
//      
    }

}
