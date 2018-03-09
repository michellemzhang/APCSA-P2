//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		fileName = fName;
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		for (int i = 0; i < values.length; i++)
		{
			letters.add(values[i]);
		}
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File(fileName));
		String letter = "";
		
		for (int i = 0; i < letters.size(); i++)
		{
			int counter = 0;
			while (file.hasNext())
			{
				 letter = file.next();
				 for (int j = 0; j < letter.length(); j++)
				 {
					 if (letter.charAt(j) == letters.get(i))
					 {
						 counter++;				
					 }
				 }			
			}
		count.add(counter);
		file.close();
		file = new Scanner(new File(fileName));
		}
	}

	public char mostFrequent()
	{
		int maxcount = count.get(0);
		char maxletter = letters.get(0);
		for (int i = 0; i < count.size(); i++)
		{
			if (count.get(i) > maxcount)
			{
				maxcount = count.get(i);
				maxletter = letters.get(i);
			}
		}
		return maxletter;
	}

	public char leastFrequent()
	{
		int mincount = count.get(0);
		char minletter = letters.get(0);
		for (int i = 1; i < count.size(); i++ )
		{
			if (count.get(i) < mincount)
			{
				mincount = count.get(i);
				minletter = letters.get(i);
			}
		}
		return minletter;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}