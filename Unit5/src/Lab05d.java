//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);  
		
		out.print("Enter a letter :: ");
		char letterone = keyboard.next().charAt(0);
		CharacterAnalyzer testone = new CharacterAnalyzer(letterone);
		out.println(testone); 
		
		out.print("Enter a letter :: ");
		char lettertwo = keyboard.next().charAt(0);
		CharacterAnalyzer testtwo = new CharacterAnalyzer(lettertwo);
		out.println(testtwo); 
		
		out.print("Enter a letter :: ");
		char letterthree = keyboard.next().charAt(0);
		CharacterAnalyzer testthree = new CharacterAnalyzer(letterthree);
		out.println(testthree); 
		
		out.print("Enter a letter :: ");
		char letterfour = keyboard.next().charAt(0);
		CharacterAnalyzer testfour = new CharacterAnalyzer(letterfour);
		out.println(testfour); 
		
		out.print("Enter a letter :: ");
		char letterfive = keyboard.next().charAt(0);
		CharacterAnalyzer testfive = new CharacterAnalyzer(letterfive);
		out.println(testfive);
		
		out.print("Enter a letter :: ");
		char lettersix = keyboard.next().charAt(0);
		CharacterAnalyzer testsix = new CharacterAnalyzer(lettersix);
		out.println(testsix);
		
		out.print("Enter a letter :: ");
		char letterseven = keyboard.next().charAt(0);
		CharacterAnalyzer testseven = new CharacterAnalyzer(letterseven);
		out.println(testseven);
		
		out.print("Enter a letter :: ");
		char lettereight = keyboard.next().charAt(0);
		CharacterAnalyzer testeight = new CharacterAnalyzer(lettereight);
		out.println(testeight);
	}
}