//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		
		Scanner keyboard = new Scanner (System.in);
		
		int a, b, c; 
		
		Quadratic test = new Quadratic();
		
		System.out.print("Enter a :: ");
		a = keyboard.nextInt();
		
		System.out.print("Enter b :: ");
		b = keyboard.nextInt();
		
		System.out.print("Enter c :: ");
		c = keyboard.nextInt();
		
		test.setEquation(a, b, c);
		test.calcRoots();
		test.print();
		
		System.out.print("Enter a :: ");
		a = keyboard.nextInt();
		
		System.out.print("Enter b :: ");
		b = keyboard.nextInt();
		
		System.out.print("Enter c :: ");
		c = keyboard.nextInt();
		
		test.setEquation(a, b, c);
		test.calcRoots();
		test.print();
		
		System.out.print("Enter a :: ");
		a = keyboard.nextInt();
		
		System.out.print("Enter b :: ");
		b = keyboard.nextInt();
		
		System.out.print("Enter c :: ");
		c = keyboard.nextInt();
		
		test.setEquation(a, b, c);
		test.calcRoots();
		test.print();
		
   	//add test cases
   	
  		
	}
}