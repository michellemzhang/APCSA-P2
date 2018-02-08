//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int xOne, yOne, xTwo, yTwo; 
		
		Distance test = new Distance();
		
		System.out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		
		System.out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		
		System.out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		
		System.out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		test.print(); 
		
		System.out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		
		System.out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		
		System.out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		
		System.out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		test.print(); 
		
		System.out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		
		System.out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		
		System.out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		
		System.out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
		
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		test.print(); 
		
				
	}
}