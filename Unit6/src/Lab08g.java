//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats myLoopStats = new LoopStats();
		myLoopStats.setNums(1, 5);
		System.out.println(myLoopStats.toString());
		System.out.println("total " + myLoopStats.getTotal());
		System.out.println("even count " + myLoopStats.getEvenCount());
		System.out.println("odd count " + myLoopStats.getOddCount());
		
		myLoopStats.setNums(2, 8);
		System.out.println(myLoopStats.toString());
		System.out.println("total " + myLoopStats.getTotal());
		System.out.println("even count " + myLoopStats.getEvenCount());
		System.out.println("odd count " + myLoopStats.getOddCount());
		
		myLoopStats.setNums(5, 15);
		System.out.println(myLoopStats.toString());
		System.out.println("total " + myLoopStats.getTotal());
		System.out.println("even count " + myLoopStats.getEvenCount());
		System.out.println("odd count " + myLoopStats.getOddCount());					
	}
}