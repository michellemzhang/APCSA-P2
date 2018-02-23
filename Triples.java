//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;
   private String output;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int greatest = 0;
		if (a > b && a > c)
		{
			greatest = a;
		}
		if (b > c && b > a)
		{
			greatest = b;
		}
		else
		{
			greatest = c;
		}
		for (int i = 1; i < greatest; i++)
		{
			if (a%1 == 0 && b%1 == 0 && c%1 == 0)
			{
				max = i;
			}
		}
		
		return max;
	}
	public String toString()
	{
		output="";
		for (int i =1; i < number; i++)
		{
			for (int j = 2; j < number; j++)
			{
				for (int k = 3; k < number; k+=2)
				{
					if ((double)k == Math.sqrt(((double)i * (double)i) + ((double)j * (double)j)) && greatestCommonFactor(i, j, k) == 1 && i < j && j < k)
					{
						output += i + " " + j + " " + k + "\n";
					}
				}
			}
		}
	
	return output;
	}
}