package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Aryan Patel
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random rand= new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
           
            c.setValue(rand.nextInt(13)+ 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            }
Scanner scan = new Scanner(System.in);
/*System.out.println("Select the Card of your choice. Note that Ace = 1, Jack =11, Queen =12, King = 13");
System.out.print("Select the card Number:");
int cNumber = scan.nextInt();
System.out.print("Select the Suit for your card. Clubs, Hearts, Spades, Diamonds: ");
String cType = scan.next();
*/
       
    Card luckyCard = new Card();
    luckyCard.setSuit("Spades");
    luckyCard.setValue(7);
    
    String cType = luckyCard.getSuit();
    int cNumber = luckyCard.getValue();
        
//if(cNumber > 14){
//  System.out.println("Please select the card from the Deck and not from Space.");
//}
for(int i = 0; i< Card.SUITS.length; i++){
    if(cType == Card.SUITS[i] && (cNumber > 1 && cNumber <14)){
        System.out.println("Selectable Card");
    }
}

System.out.println("If you don't get 'Selectable Card', you choose Unavailable card.");



    System.out.println("Your Card is " + cNumber + " of "+ cType);       
    
    /*System.out.println("The 7 cards are");
        for(int i = 0; i <magicHand.length; i++){
            System.out.println(" "+magicHand[i].getValue() + " of " + magicHand[i].getSuit()+ " ");
    }*/
        
        for(int i = 0; i< magicHand.length; i++){
            if((magicHand[i].getValue() == cNumber) && (magicHand[i].getSuit() == cType)){
                System.out.println("Congratulations! You card matched the card from Magic Hand");
            }
            }
        
        
    if(magicHand[magicHand.length - 1].getValue() != cNumber && magicHand[magicHand.length - 1].getSuit() != cType){
                System.out.println("Sorry, the card didn't match. Try Again!");
    
    
    }
    
}
}



