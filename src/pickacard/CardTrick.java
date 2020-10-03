package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card
 *
 * 
 * @author Annal Deol
 * @date 10/2/2020
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] goldHand = new Card[7];
        String randomValue = null;
        int[] card = {1,2,3,4,5,6,7};
        final String[]  SUIT=  {"Hearts", "Diamonds", "Spades", "Clubs"};
        Iterable<Card> starCard1 = null;

        for (Card starCard1 : starCard1) {
            
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
            int numVal1 = card [(int)(Math.random()*card.length)];
            String suitVal1= SUIT[(int) (Math.random()*SUIT.length )];
            
            c.setValue(numVal1);
            c.setSuit(suitVal1);
            
            randomValue = numVal1 + " " + suitVal1;
            
            System.out.println(randomValue);
        }
        
        
    
    Scanner input = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter card of wish");
        
      String userVal=input.nextLine();
      if(randomValue.equalsIgnoreCase(userVal)) {
          System.out.println("Win");
      } else
     System.out.println("lose");
     
  
   

        //Then report the result here
    int cards=7;
    String suit="spades";
    String cardOfMyWish= starCard(card,suit);
    System.out.println("Card of my wish :"+cardOfMyWish);
}
     public static String starCard(int number,String suit) {
    Card c = new Card();
    int num =4;
    String suits = "hearts";
    String value = num+ " " + suits;
    return value;
}     

    private static String starCard(int[] card, String suit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


