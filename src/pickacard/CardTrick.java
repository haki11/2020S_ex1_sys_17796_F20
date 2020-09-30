package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Anshul Marwaha
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.getRandomValue());
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            System.out.println(c.getSuit()+ " "+c.getValue());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any value in between 1-13");
        int cardNum=in.nextInt();
        System.out.println("Enter suit number 1 for Heart , 2 for Diamond , 3 for Spade  or 4 for Clubs");
       String suitNum=in.next();
        boolean card; 
        
         
             for(int j=0; j< magicHand.length; j++)
    {
            if(cardNum==(magicHand[j].getRandomValue())&&(suitNum.equals(magicHand[j].getRandomSuit()))){         
            
                System.out.println("match found"); 
            }
            
            else
            {
            System.out.println("No match found");
            }
    }
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Clubs");
        System.out.println(luckyCard.getSuit() + " " + luckyCard.getValue());
        for(int i = 0; i < magicHand.length; i++){
            if((luckyCard.getValue() == (magicHand[i].getValue()) 
                    && luckyCard.getSuit().equals(magicHand[i].getSuit()))){
                System.out.println(" Matched , You Won ");
            }
            else {
                System.out.println("Sorry, You Loose And Try Again");
            }
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
}
    
