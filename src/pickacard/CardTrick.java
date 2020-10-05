package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Kyle Gauthier
 */
public class CardTrick {

   public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        int suitNum = (int) ((Math.random() * ( 3 - 0 )) + 0);
        int cardNum = (int) ((Math.random() * ( 56 - 1 )) + 1);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(cardNum);
            c.setSuit(Card.SUITS[suitNum]);
            magicHand[i] = c;
        }
        
        System.out.println("Pick a card! 1 through 7");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println(magicHand[choice].toString());

    }

}
