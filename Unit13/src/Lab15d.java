//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner myscanner = new Scanner(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit13\\src\\lab15d.dat"));
		int number = myscanner.nextInt();
		myscanner.nextLine();
		for (int i = 0; i < number; i++) {
			FancyWords test = new FancyWords(myscanner.nextLine());
			System.out.println(test);
		}
	}
}