   package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Shawn Pattullo
 * @modifiedby Shawn Pattullo 2020 - 10 - 04
 */

//import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            
            
            Card c = new Card();
            
            
            
            c.setValue((int)((Math.random()* 13)+ 1));  //c.setValue(insert call to random number generator here)
            
            c.setSuit(Card.SUITS [(int)(Math.random()* 4)]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])

            magicHand[i] = c;
            
         }
    
        
   /*Scanner in = new Scanner(System.in); // scanner created
        // user prompt for both card number and suit.
        System.out.print("Enter a number between 1-13(integer).This will be your"
          + " card number.. ex. 11 = JACK, 12 = QUEEN etc: ");
        int userCardNum = in.nextInt();
        
        
   
        System.out.print("Enter a number between 0-3(integer) (0 = HEARTS, "
           + "1 = DIAMONDS, 2 = SPADES, and 3 = CLUBS):  ");
        int userCardSuit = in.nextInt();
        
        Card b = new Card(); //create card
        
        b.setValue((int)(userCardNum)); //set value of card with user variable
        b.setSuit(Card.SUITS[(int)(userCardSuit)]);//set suit based off user variable
            
        System.out.println("your chosen card is: " + userCardNum + " of " + 
                Card.SUITS[userCardSuit]); //prints user's card

        System.out.println("The Magic Hand Consists of: ");
      */
       
       Card luckyCard = new Card(); //Creates lucky Card
       
       luckyCard.setValue(1); // Sets Value of luckyCard.
       luckyCard.setSuit(Card.SUITS[2]); // Sets Suit of luckyCard.
       System.out.println("Lucky Card within the Deck is: " + luckyCard.getValue() + " of " + luckyCard.getSuit()); // Print out of what the luckCard is.

       for (Card c : magicHand){ //print contents of magicHand
            System.out.println(c.getValue() + " of " + c.getSuit());
}
       /*for (Card c : magicHand) { //checks to see if user's card is within the content of magicHand
            if (b.getValue() == c.getValue() 
                && b.getSuit().equals(c.getSuit())){ 
                System.out.println("Your card is in the magic hand!");
            }else{
                System.out.println("your card was not one of the cards in the "
            + "magic hand");
            */
       for (Card c : magicHand) { //checks to see if Lucky card is within the content of magicHand
            if (luckyCard.getValue() == c.getValue() 
                && luckyCard.getSuit().equals(c.getSuit())){ 
                System.out.println("The Lucky Card is in the magic hand!");
            }else{
                System.out.println("The Lucky Card was not one of the cards in the "
            + "magic hand");
       
    }
}
}
}