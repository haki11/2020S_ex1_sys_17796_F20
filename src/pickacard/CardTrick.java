package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Semaj Primm
 * @date 4 October, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            // Initalizes Random() object 
            Random r = new Random();
            
            // Sets card value to random number between 1-13
            c.setValue(r.nextInt(13)+1);
            
            // Sets card suit to a suit witha random index
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            
            // Appends card to magicHand array
            magicHand[i] = c;
            
        }
        
        // Asks for and collects user input for card value
        /*System.out.print("Pick a card value: ");
        int cardValue = scan1.nextInt();
        
        // Asks for and collects user input for card suit
        System.out.print("Pick a card suit: ");
        String cardSuit = scan2.nextLine();
        
        // Prints out the card user enters
        System.out.println(cardValue + " " + cardSuit);
        
        // Boolean flag for is user card is found in magicHands
        boolean foundCard = false;*/
        
        // Looks for user card in magicHands array
        for(Card c : magicHand){
            // Sets flag to true if user card is found in magicHands
            /*if(c.getValue() == cardValue && c.getSuit().equals(cardSuit)){
                foundCard = true;
            }*/
            if(c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())){
                foundCard = true;
            }
        }
        
        // Prints out message based on if user card found in magicHands
        if(foundCard){
            System.out.println("Found it!");
        } else{
            System.out.println("Sorry, didn't find it.");
        }
        
    }

}
