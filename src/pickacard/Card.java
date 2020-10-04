package pickacard;

import java.util.Random;
/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in Exercise 1. When you create your own branch,
 * add your name as an author.
 * @author dancye
 * @author Paul Bonenfant
 * @co-author Jeremiah Torralba
 */
public class Card {

   private Suit suit; //clubs, spades, diamonds, hearts
   private Value value;//1-13
   
    Card() {
    }
   
   public enum Suit {
           Hearts, Spades, Clubs, Diamonds;
   };
   
   public static Card.Suit genRandSuit() {
       Suit[] values = Suit.values();
       int length = values.length;
       int randIndex = new Random().nextInt(length);
       return values[randIndex];
   }
   
   public enum Value {
       Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);
        int val;
        private Value(int val) {
            this.val = val;
        }
        public static boolean contains(String v) {
        for(Value value:values())
           if (value.name().equals(v)) 
              return true;
        return false;
        }   
   };
   
   public static Card.Value genRandValue() {
       Value[] values = Value.values();
       int length = values.length;
       int randIndex = new Random().nextInt(length);
       return values[randIndex];
   }
      
   /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
   
}
