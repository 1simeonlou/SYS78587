package cardgame;


public class Card {
   
        private Suit suit;
	private Value value;
        
        // public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
  
         public Card()
         {}
        public Card(Value value, Suit suit )
        {
            this.value=value;
            this.suit=suit;
        }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

   

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

   

	
}