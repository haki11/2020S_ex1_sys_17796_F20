package pickacard;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Haki sharifi
 * @author Paul Bonenfant
 * @modifier Beant kaur
 * student id=991567762
 */
import java.util.Scanner;


public class CardTrick {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Card[] magicHand = new Card[7];//new object for card created
        //c.setValue(insert call to random number generator here)
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)((Math.random()*3)+1)]);
            magicHand[i]=c;
            System.out.println(c.getValue()+" "+c.getSuit());
        }

        System.out.println("Enter a Card Value Between 1 and 13.");
        int val1 = input.nextInt();
        System.out.println("Enter a Card Suit(diamond,spade,heart,club)");
        String luckyCard = input.next();
        
        boolean output = false;
        for(int j=0; j<magicHand.length; j++){
            if(val1 == magicHand[j].getValue() && luckyCard.equalsIgnoreCase(magicHand[j].getSuit()))
            {   System.out.println("Great,You Win");
                output=true;
            }
        }
        
        if(output==false){
            System.out.println("oops,you loose");
        }
    }

}


