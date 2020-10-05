package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        
        Card luckCard = new Card()

        int index = 0;
        for (int card = 0; card < magicHand.length; card++) {

            //c.setValue(insert call to random number generator here)
            int rank = (int) (Math.random() * 13) + 1;

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //new liner
            // I edit directly on github
            int i = (int) (Math.random() * 4);
            String suit = Card.SUITS[i];
            magicHand[index] = new Card();
            magicHand[index].setSuit(suit);
            magicHand[index].setValue(rank);
            index++;
        }

        printDeck(magicHand);
        
        //prompt user input for card rank and suit
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Pick a card value (1 -13): ");
//         int userValue = sc.nextInt();
//         System.out.print("Pick a card suit: ");
//         String userSuit = sc.next().toUpperCase();
        
        //compare user entered value with values of cards in magicHand
//         boolean found = false;
//         for (int i = 0; i < 7; i++) {
//             if (magicHand[i].getSuit().toUpperCase().equals(userSuit) 
//                     && magicHand[i].getValue() == userValue) {
//                 found = true;
//                 break;
//             }
//         }
        
//         if (found) {
//             System.out.println("Your selected card is in the Magic Hand");
//         } else {
//             System.out.println("Your selected card is not in the Magic Hand");
//         }
        
        
        boolean found = false;
        for (int i = 0; i < 7; i++) {
            if (magicHand[i].getSuit().equals(luckyCard.getSuit())
                    && magicHand[i].getValue() == luckyCard.getValue()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You hit the lucky card!");
        } else {
            System.out.println("You did not get the lucky card");
        }
        
    }

    public static void printDeck(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i].getValue() + " of " + cards[i].getSuit());
        }
    }

}
