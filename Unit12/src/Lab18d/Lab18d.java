package Lab18d;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;


import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit12\\src\\lab18d.dat"));

		int size = file.nextInt();
		Word[] mywords = new Word[size];
		
		file.nextLine();
		
		for (int i = 0; i < size; i++){
			mywords[i] = new Word(file.next());
		}
		
		for (int j = 0; j < size; j++) {
			for (int h = 0; h < size - 1; h++) {
				if (mywords[h].compareTo(mywords[h + 1]) == 1) {
					Word templocation = mywords[h];
					mywords[h] = mywords[h + 1];
					mywords[h + 1] = templocation;		
					}
				}
			}
	
		String result = " ";
		for (int k = 0; k < size; k++) {
			System.out.println(mywords[k]);
		}
		System.out.print(result);		
	}
}