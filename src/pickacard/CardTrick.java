package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Ahmed Hashmi
 * Modified: 9/30/2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        Random dice = new Random();
        int num;
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            num = dice.nextInt(13);
            
            //c.setValue(insert call to random number generator here)
            c.setValue(num);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[dice.nextInt(3)]);
            
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        
        /*
        System.out.println("Enter your guess for the value of the card (1-13): ");
        int userValue = input.nextInt();
        
        System.out.println("Enter your guess for the suit of the card (0-3): ");
        int userSuit = input.nextInt();
        */
        
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit(Card.SUITS[3]);
        
        /*
        Card userC = new Card();
        userC.setValue(userValue);
        userC.setSuit(Card.SUITS[userSuit]);
        */
        
        System.out.println("The lucky card value is: " + luckyCard.getValue());
        System.out.println("The lucky card suit is: " + luckyCard.getSuit());
        
        //  This just prints the magic hand
        for (Card c : magicHand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
        
        
        // and search magicHand here
        for (Card c : magicHand) {
            if (luckyCard.getValue() == c.getValue() && luckyCard.getSuit().equals(c.getSuit())) {
                System.out.println("The lucky card has a match in the magic hand! ");
                
            }
            else {
                //Then report the result here
                System.out.println("the lucky card did not have a matching card in the magic hand. ");
            }
        }
        
        
    }

}
