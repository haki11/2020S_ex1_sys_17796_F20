package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author MuZhang
 */
public class CardTrick {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
      
         for (int i = 0; i < magicHand.length; i++) {
              Card c = new Card();
            //c.setValue(insert call to random number generator here)
               c.setValue((int)(Math.random() * 13 + 1));
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //it is a String
               c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
               magicHand[i] = c;
               System.out.println(c.getValue() + c.getSuit());
        }
        
          Card luckyCard = new Card();    
        luckyCard.setValue(12);  
        luckyCard.setSuit(Card.SUITS[0]);
         
        //find the luckyCard whether in magicHand[i].
          boolean luckyCardfound = false;
        for(Card c: magicHand)
        {
            if((c.getSuit().equals(luckyCard.getSuit())) && (c.getValue()==luckyCard.getValue()))
            {
                luckyCardfound = true;
                break;
            }
        }
        if(luckyCardfound)
            {
                System.out.println("You win!");
            }
        else
            {
                System.out.println("you lose.");
            }
         
         /* I want to replace the code as follow with my luckycard object
        //insert code to ask the user for Card value and suit, create their card
       
        //ask user to input the value and suit of the lucky card
         System.out.println("please enter the value of your card");
         int valuePick = sc.nextInt();
         System.out.println("please enter the suit of your card");
         String suitPick = sc.nextLine();
        
         System.out.println("your card's value is: "+ valuePick);
          System.out.println("your card's suit is: "+ suitPick);
         
       
        //Then report the result and match magicHand[i] here.
         Card c = new Card();
        if(valuePick == c.getValue() && suitPick.equals(c.getSuit())){
            System.out.println("your card is in the magic hand of random cards");}
        else{
            System.out.println("your card is not in the magic hand of random cards");
        }*/
      
    }

}
