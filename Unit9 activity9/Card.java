package activity9;

public class Card {

	private String suit;
	private String rank;
	private int pointValue;


	public Card() {
		setCard("Ace", "Club", 0);
	}
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		setCard(cardRank, cardSuit, cardPointValue);
	}
	public void setCard(String pp, String steven, int buyan) {
		rank = pp;
		suit = steven;
		pointValue = buyan;
	}
	
	public String suit() {
		return suit;
   }
	public String rank() {
		return rank;
	}
	public int pointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		return (otherCard.suit().equals(suit) && otherCard.rank().equals(rank));
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
