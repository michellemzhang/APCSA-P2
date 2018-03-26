//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit14\\src\\lab24d.dat"));
		
		TicTacToe mytest = new TicTacToe();
		char mat[][] = new char[3][3];
		
		int size = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < size; i++) {
			String string = file.nextLine();
			mytest = new TicTacToe(string);
			System.out.print(mytest);
	}
}
}



