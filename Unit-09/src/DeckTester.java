import java.util.ArrayList;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "jack ", "queen ", "king "};
		String[] suits = {" hearts", " clubs", " spades", " diamonds"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		ArrayList<Card>cards;
		cards = new ArrayList<Card>();
		Deck run = new Deck(ranks, suits, values);
		System.out.println(run.toString());
	}
}

