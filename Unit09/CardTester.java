package Unit09;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card steven = new Card("Ace", "Clubs", 0);
		Card mauro = new Card("4", "Diamonds", 5);
		Card buyan = new Card("Ace", "Clubs", 0);
		System.out.println(mauro);
		System.out.println(steven.matches(buyan));
	}
}
