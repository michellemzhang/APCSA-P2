/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String [] ranks1 = {"A", "B", "C"};
		String [] suits1 = {"Giraffes", "Lions", "Sheep"};
		int [] values1 = {1,2,3};
		String [] suits2 = {"jack", "queen"};
		int [] values2 = {4,5,6};
		
		Deck test1 = new Deck(ranks1, suits1, values1);
		System.out.println(test1.isEmpty());
		System.out.println(test1.size());
		test1.shuffle();
		System.out.println(test1.deal());
		System.out.println(test1.toString());
		
		Deck test2 = new Deck(ranks1, suits2, values1);
		System.out.println(test2.isEmpty());
		System.out.println(test2.size());
		test2.shuffle();
		System.out.println(test2.deal());
		System.out.println(test2.toString());
		
		Deck test3 = new Deck(ranks1, suits2, values2);
		System.out.println(test3.isEmpty());
		System.out.println(test3.size());
		test3.shuffle();
		System.out.println(test3.deal());
		System.out.println(test3.toString());
		
		String [] newranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
		String [] newsuits = {"spades", "clubs", "hearts", "diamonds"};
		int [] newvalues = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] newdeck = new int[newranks.length * newvalues.length];
		Deck newtest = new Deck(newranks, newsuits, newvalues);
		System.out.println(newtest.isEmpty());
		System.out.println(newtest.size());
		test3.shuffle();
		System.out.println(newtest.deal());
		System.out.println(newtest.toString());
	} 
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
}

