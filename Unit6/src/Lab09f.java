//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover myLetterRemover = new LetterRemover("I am Sam I am");
		myLetterRemover.setRemover("I am Sam I am", 'a');
		System.out.println(myLetterRemover.toString());	
		
		
		myLetterRemover.setRemover("hihihihihi", 'i');
		System.out.println(myLetterRemover.toString());	
		
		
		myLetterRemover.setRemover("abababababa", 'b');
		System.out.println(myLetterRemover.toString());	
		
		
		myLetterRemover.setRemover("xcxcxcx", 'c');
		System.out.println(myLetterRemover.toString());	
		
		
		myLetterRemover.setRemover("hellothere", 'e');
		System.out.println(myLetterRemover.toString());	
		
	}
}