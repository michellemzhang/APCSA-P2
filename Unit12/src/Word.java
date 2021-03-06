//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;

		for (int i = 0; i < word.length(); i++) {
			if (vowels.indexOf(word.charAt(i)) >= 0) {
				vowelCount++;
			}
		}
	return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		/* (this could also work)
		 * if (this.numVowels() == rhs.numVowels()){
			if ((int)word.charAt(0) > (int)rhs.toString().charAt(0)) {
				return 1;
			}
			else if ((int)word.charAt(0) == (int)rhs.toString().charAt(0)) {
				if ((int)word.charAt(1) > (int)rhs.toString().charAt(1)) {
					return 1;
				}
				else if ((int)word.charAt(1) == (int)rhs.toString().charAt(1)) {
					return 0;
					}
				else {
					return -1;
				}
				}
		} */
		
		if (this.numVowels() == rhs.numVowels()){
			if (word.compareTo(rhs.toString()) < 0){
				return -1;
			}
			else if (word.compareTo(rhs.toString()) > 0){
				return 1;
			}
			else{
				return 0;
			}
		}
		else if (this.numVowels() < rhs.numVowels()){
			return -1;
		}
		else if (this.numVowels() > rhs.numVowels()){
			return 1;
		}
		return 0;	
}
	public String toString()
	{
		return word;
	}
}