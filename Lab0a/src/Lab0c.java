//© A+ Computer Science  -  www.apluscompsci.com
//Name - Michelle Zhang
//Date - 02/06/18
//Class - APCSA Period 2
//Lab  - Lab0c

import static java.lang.System.*;
import java.util.Scanner;

public class Lab0c
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		byte byteOne, byteTwo; 
		long longOne, longTwo; 
		int intTotal = 0;
		double doubleTotal = 0.0; 


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		intTotal = intOne + intTwo;

		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();
		
		doubleTotal = doubleOne + doubleTwo; 
		
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
		
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();
		
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter a short:: ");
		shortTwo = keyboard.nextShort();
		
		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();
		
		System.out.print("Enter a byte :: ");
		byteTwo = keyboard.nextByte();
		
		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();
		
		System.out.print("Enter a long :: ");
		longTwo = keyboard.nextLong();
		
		
		
		System.out.println("integer one = " + intOne);
		System.out.println("integer two = " + intTwo);
		System.out.println("double one = " + doubleOne);
		System.out.println("double two = " + doubleTwo);
		System.out.println("float one = "+ floatOne);
		System.out.println("float two = " + floatTwo);
		System.out.println("short one = " + shortOne);
		System.out.println("short two = " + shortTwo);
		System.out.println("byte one = " + byteOne);
		System.out.println("byte two = " + byteTwo);
		System.out.println("long one = " + longOne);
		System.out.println("long two = " + longTwo);
		System.out.println("intOne + intTwo = " + intTotal);
		System.out.println("doubleOne + doubleTwo = " + doubleTotal);
				
	}
}