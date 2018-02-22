//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = " ";
	}

	public LetterRemover(String s)
	{
		sentence = s;
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int length = sentence.length();
		int loc = sentence.indexOf(lookFor);
		String cleaned = "";
	
		while (length >= 1)
		{
			if (loc >= 1)
			{
				cleaned = sentence.replaceAll(sentence.substring(loc, loc + 1), "");
				length = length - 1;
			}
			else
			{
				return sentence;
			}
		}
			
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}