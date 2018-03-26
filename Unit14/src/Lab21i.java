//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit14\\src\\lab21i.dat"));
		int size = 0;
		String nextString = " ";
		while (file.hasNextInt()) {
			
			size = file.nextInt();
			file.nextLine();
			nextString = file.nextLine();
			Maze test = new Maze(size, nextString);
			System.out.println(test);
			System.out.println();
		}
	}
}