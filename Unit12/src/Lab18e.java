//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit12\\src\\lab18e.dat"));

		int size = file.nextInt();
		Word[] mywords = new Word[size];
		
		file.nextLine();
	
		for (int i = 0; i < size; i++){
			mywords[i] = new Word(file.next());
		}
		
		for (int j = 0; j < size; j++) {
			for (int h = 0; h < size - 1; h++) {
			if (mywords[h].compareTo(mywords[h+1]) == 1) {
				Word templocation = mywords[h + 1];
				mywords[h + 1] = mywords[h];
				mywords[h] = templocation;		
				}
			}
		}
		
		String result = " ";
		for (int k = 0; k < size; k++) {
			result = result + mywords[k] + "\n";
		}
		System.out.print(result);
	}
}