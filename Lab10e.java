//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = ' ';

			System.out.print("Guessing game - how many numbers? ");
			GuessingGame myGuessingGame = new GuessingGame(keyboard.nextInt());
			myGuessingGame.playGame();
			System.out.println(myGuessingGame.toString());
			
			System.out.println("Do you want to play again? ");
			response = keyboard.next().charAt(0);
			
			while (response == 'y')
			{
				System.out.print("Guessing game - how many numbers? ");
				GuessingGame myGuessingGame1 = new GuessingGame(keyboard.nextInt());
				myGuessingGame1.playGame();
				System.out.println(myGuessingGame.toString());
				System.out.println("Do you want to play again? ");
				response = keyboard.next().charAt(0);
			}
		}
	}