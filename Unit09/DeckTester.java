package Unit09;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println(new Deck(new String[] {"1", "2", "3", "4", "5"}, new String[] {"Clubs", "Diamond", "Spades", "Hearts"}, new int[]{1,2,3,4,5}));
		Deck x = new Deck(new String[] {"1", "2", "3", "4", "5", "6","7","8","9","10","11","12","13"}, new String[] {"Clubs", "Diamond", "Spades", "Hearts"}, new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
		x.shuffle();
		x.deal();
		System.out.print(x);
	}
}
