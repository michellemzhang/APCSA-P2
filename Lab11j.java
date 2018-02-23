//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11j
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   System.out.print("Enter a number");
	   Triples myTriples = new Triples(keyboard.nextInt());
	   System.out.print(myTriples);
	}
}