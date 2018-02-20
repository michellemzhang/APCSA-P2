//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Prime myPrime = new Prime();
		myPrime.setPrime(24);
		myPrime.isPrime();
		System.out.println(myPrime.toString());	
		
		myPrime.setPrime(7);
		myPrime.isPrime();
		System.out.println(myPrime.toString());
		
		myPrime.setPrime(100);
		myPrime.isPrime();
		System.out.println(myPrime.toString());
		
		myPrime.setPrime(113);
		myPrime.isPrime();
		System.out.println(myPrime.toString());
		
		myPrime.setPrime(65535);
		myPrime.isPrime();
		System.out.println(myPrime.toString());
		
		myPrime.setPrime(2);
		myPrime.isPrime();
		System.out.println(myPrime.toString());
		
		myPrime.setPrime(7334);
		myPrime.isPrime();
		System.out.println(myPrime.toString());
		
		myPrime.setPrime(7919);
		myPrime.isPrime();
		System.out.println(myPrime.toString());
		
		myPrime.setPrime(1115125003);
		myPrime.isPrime();
		System.out.println(myPrime.toString());				
	}	
}