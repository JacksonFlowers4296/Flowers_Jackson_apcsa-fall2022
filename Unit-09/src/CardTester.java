/**
 * This is a class that tests the Card class.
 */
public class CardTester {


	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 * @param 
	 */
	
	public static void main(String[] args) {
		Card run = new Card("ace", "spades", 1);
		System.out.println(run.toString());
		
		Card run1 = new Card("king", "clubs", 12);
		System.out.println(run1.toString());
		
		Card run2 = new Card("eight", "hearts", 8);
		System.out.println(run2.toString());
	}
}
