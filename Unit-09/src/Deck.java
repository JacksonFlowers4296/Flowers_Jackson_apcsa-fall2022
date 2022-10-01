import java.util.ArrayList;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card>cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		cards = new ArrayList<Card>();
		int l = suits.length + ranks.length;
		
		
		
		
		for (int i = 0; i < suits.length; i++)
			
			for (int j = 0; j < values.length; j++)
			   
		      
		        {
		        cards.add(new Card(ranks[j], suits[i], values[j]));      
		        }
		       
		        
	}


	


	





	

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty(int l, int dealt) {
		if (l == dealt)
		{
			return true;
		}
		return false;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size(int l, int dealt) {
		int SIZE = l;
		return (size - dealt);
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	
		public void shuffle(int[] Deck) {
			/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
			int[] shuffled = new int[52];
			int j = 0;
			int l = 0;
			for(int i = 0; i < 52; i++)
					shuffled[i] = i;
					
			      
			for(int t = 0; t < 52; t++)
				
				   if (shuffled[t]%2 != 0)
				   {
					   Deck[t] = j + 26;
					   j++;
				   }
			   
			for(int v = 0; v < 52; v++)
				
				   if (shuffled[v]%2 == 0)
				   {
					   Deck[v] = l;
					   l++;
				   }
			
			
		}
	public Card deal() {
		int dealt = 0;
		int b = 0;
		int place = 0;
		if(b == 0)
		{
			return cards.get(place);
		}
		if(b == 0)
		{
			dealt++;
		}
		if(b == 0)
		{
			place++;
		}
		return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
