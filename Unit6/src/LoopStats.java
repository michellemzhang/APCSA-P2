//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;
	private int total;

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
		int evenCount=0;
		int run;
		
		for (run = start; run <= stop; run = run + 1)
		{
			if (run % 2 == 0)
			{
				evenCount = evenCount + 1;
			}
		}
		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		int run; 
		
		for (run = start; run <= stop; run = run + 1)
		{
			if (run % 2 != 0)
			{
				oddCount = oddCount + 1;
			}
		}
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		int run; 
		
		for (run = start; run <= stop; run = run + 1)
		{
			total = total + run;
		}
		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}