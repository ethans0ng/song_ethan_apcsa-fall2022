package Unit09;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	public static int SHUFFLE_COUNT = 3;

	/**
	 * The number of values to shuffle.
	 */
	public static int VALUE_COUNT = 52;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values1 = perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values2 = selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	public static int[] perfectShuffle(int[] values) {
		int[] shuffled = new int[VALUE_COUNT];
		int k=0;
		for(int i=0; i<26; i++) {
			shuffled[k] = values[i];
			k+=2;
		}
		k=1;
		for(int i=26; i<52; i++) {
			shuffled[k]=values[i];
			k+=2;
		}
		return shuffled;
	}

	public static int[] selectionShuffle(int[] values) {
		int[] shuffled = values;
		for(int k=VALUE_COUNT-1; k>=0; k--) {
			int tonyqu = (int) Math.floor(Math.random()*(k+1));
			int buyan = shuffled[k];
			shuffled[k] = shuffled[tonyqu];
			shuffled[tonyqu]=buyan;
		}
		return shuffled;
	}
}
