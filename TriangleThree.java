//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle(0, " ");
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(count, let);
	}

	public void setTriangle( int sz, String let )
	{
		size = sz;
		letter = let;
	}
	public String getLetter()
	{
		String output = "";
		int outer;
		int spaces;
		int inner;
		
		for (outer = 1; outer <= size; outer++)
		{
			for(spaces = 1; spaces <= (size - outer) ; spaces++)
			{
				output = output + " ";
			}
			
			for(inner = 1; inner <= outer; inner++)
			{
				output = output + letter;
			}
			
			output = output + "\n";		
		}
		return output;
	}

	public String toString()
	{
		String output= getLetter();
		return output+"\n";
	}
}