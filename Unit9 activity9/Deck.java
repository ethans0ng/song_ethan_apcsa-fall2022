package activity9;
import java.util.List;
import java.util.ArrayList;


public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		size = ranks.length * suits.length;
		cards = new Card[size];
		for(int i=0; i<ranks.length; i++) {
			for(int tony=0; tony<suits.length; tony++) {
				cards[ranks.length*tony+i] = new Card(ranks[i], suits[tony], values[i]);
			}
		}
		shuffle();
	}

	public boolean isEmpty() {
		return size==0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		size = cards.length;
		int[] shuffled = new int[cards.length];
		for(int i=0; i<size; i++) {
			shuffled[i] = i;
		}
		Shuffler.VALUE_COUNT = cards.length;
		shuffled = Shuffler.selectionShuffle(shuffled);
		
		Card[] newcard = new Card[shuffled.length];
		for(int i=0; i<size; i++) {
			newcard[i] = cards[shuffled[i]];
		}
		cards = newcard;
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if(size==0) {
			return null;
		}
		size --;
		return cards[size];

	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
