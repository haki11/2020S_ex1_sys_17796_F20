package pickacard;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Gabriel Espinoza 
 * @date: Oct 4 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        Random random = new Random();
        Card c = new Card();
        
        for (int i = 0; i < magicHand.length; i++) {

            c.setValue(1 + random.nextInt(14));
            c.setSuit(Card.SUITS[0 + random.nextInt(3)]);

        }

        System.out.println("Hello User\nWhat is the card value you want?");
        int userValue = input.nextInt();

        System.out.println("What is the suit you want?");
        String userSuit = input.next();

        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);

        System.out.println(userCard.getValue());
        System.out.println(userCard.getSuit());

        if (userCard.getValue() == c.getValue() && userCard.getSuit().equals(c.getSuit())) {
            System.out.println("The cards are the same!\nYOU WIN");
        } else {
            System.out.println("The cards are not the same!\nYOU LOSE");
        }

    }

}
