package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author David Oyedele 
 * Oct. 3rd, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 14));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            //new commit
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a random card and enter the card value and suit: ");
        String userCard;
        userCard = scan.nextLine();
        int found = -1;
        
        // and search magicHand here
        for (int i=0; i < magicHand.length; i++){
            if (magicHand[i].userCard.equals(userCard)){
                found = i;
            }
        }
        //Then report the result here
        if (found > 0){
            System.out.println("Your choosen card is not in the Magic Hand");
        }
        else{
            System.out.println("Your choosen card is in the Magic Hand");
        }
    }

}
