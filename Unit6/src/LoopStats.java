//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;
	private int total, evenCount, oddCount;

	public LoopStats()
	{
		start = 0;
		stop = 0;
	}

	public LoopStats(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public int getEvenCount()
	{
		evenCount=0;
		
		
		for (int i = start; i <= stop; i = i + 1)
		{
			if (i % 2 == 0)
			{
				evenCount = evenCount + 1;
			}
		}
		return evenCount;
	}

	public int getOddCount()
	{
		oddCount=0; 
		
		for (int i  = start; i <= stop; i = i + 1)
		{
			if (i % 2 != 0)
			{
				oddCount = oddCount + 1;
			}
		}
		return oddCount;
	}

	public int getTotal()
	{
		total=0;
		
		
		for (int i = start; i <= stop; i = i + 1)
		{
			total = total + i;
		}
		return total;
	}
	
	public String toString()
	{
		return start + " " + stop + "\n" + "odd count: " + getOddCount() + "\n" + "even Count: " + getEvenCount() + "\n" + "total: " + getTotal();
	}
}