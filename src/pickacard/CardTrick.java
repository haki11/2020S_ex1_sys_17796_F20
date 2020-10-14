package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author
 * @date 4 October, 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        int valuex = 0;
        String suitx = null;
        Card[] magicHand = new Card[7];
        Scanner inputScan = new Scanner(System.in);
        Random rand = new Random();

        // Lucky Card logic
//        Card luckyCard = new Card();
//        luckyCard.setValue(7);
//        luckyCard.setSuit("Hearts");
        for (int i = 0; i < magicHand.length; i++) {
//        for (Card magicHand1 : magicHand) {
            Card c = new Card();
            int r;
            r = rand.nextInt(4);
            suitx = Card.SUITS[r];
            c.setSuit(suitx);
            r = rand.nextInt(13) + 1;
            c.setValue(r);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        boolean contLoop;

        Card cUser = new Card();
        do {
            contLoop = false;
            System.out.print("\nChoose a SUIT (1)Herats / (2)Diamonds / (3)Spades / (4)Clubs):\n");
            try {
                valuex = inputScan.nextInt();
                switch (valuex) {
                    case 1:
                        suitx = "Hearts";
                        break;
                    case 2:
                        suitx = "Diamonds";
                        break;
                    case 3:
                        suitx = "Spades";
                        break;
                    case 4:
                        suitx = "Clubs";
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Only 1-4. Try Again.");
                contLoop = true;
            }
            cUser.setSuit(suitx);
            inputScan = new Scanner(System.in);
        } while (contLoop);

        // Ask now for the card value 1 - 13
        do {
            contLoop = false;
            System.out.print("\nChoose a VALUE (1) to (13):\n");
            try {
                valuex = inputScan.nextInt();
                if (valuex < 1 || valuex > 13) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Only 1-13. Try Again.");
                contLoop = true;
            }
            cUser.setValue(valuex);
            inputScan = new Scanner(System.in);
        } while (contLoop);

        //Display the user selection
        System.out.println("Card you selected as below");
        System.out.print(cUser.getValue());
        System.out.print(" ");
        System.out.println(cUser.getSuit());
       
        System.out.println("*************************\n");
        
        // Boolean flag for is user card is found in magicHands
        boolean foundCard = false;

        System.out.println("Let's reveal the magic hand now");
        // Looks for user card in magicHands array
        for (Card magicCard : magicHand) {
            // Sets flag to true if user card is found in magicHands
            System.out.println(magicCard.getValue() + " " + magicCard.getSuit());
            if (magicCard.getValue() == cUser.getValue() && magicCard.getSuit().equals(cUser.getSuit())) {
                foundCard = true;
                break;
            }
        }
//                if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
//                    foundCard = true;
//                }

            // Prints out message based on if user card found in magicHands
            if (foundCard) {
                System.out.println("Found it!");
            } else {
                System.out.println("Sorry, didn't find it.");
            }
    }
}
