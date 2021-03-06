/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test1 = new Card("jack", "clubs", 11);
		Card test2 = new Card("queen", "hearts", 12);
		Card test3 = new Card("king", "spades", 13);
		Card otherCard = new Card("king", "spades", 13);
				
		System.out.println(test1.suit());
		System.out.println(test1.rank());
		System.out.println(test1.pointValue());
		System.out.println(test1.matches(otherCard));
		System.out.println(test1.toString());
		
		System.out.println(test2.suit());
		System.out.println(test2.rank());
		System.out.println(test2.pointValue());
		System.out.println(test2.matches(otherCard));
		System.out.println(test2.toString());
		
		System.out.println(test3.suit());
		System.out.println(test3.rank());
		System.out.println(test3.pointValue());
		System.out.println(test3.matches(otherCard));
		System.out.println(test3.toString());
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
