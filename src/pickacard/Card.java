package pickacard;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * 
 * @author Annal Deol
 * @date 10/2/2020
 */
public class Card {

 private  String suit;
private int value;
    
    public static void main(String[] args) {
        Card[] magicffand = new Card[7];
        
    
    public static  final String[] SUIT ={"Hearts", "Diamonds", "Spades", "Clubs";
    

    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}
