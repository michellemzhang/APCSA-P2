//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int correct, numberofguesses, guess;
	private double wronganswers, percentage;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
	
		correct = (int)(upperBound*Math.random() +1);
		do{
			System.out.println("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			numberofguesses++;
			
			if (guess != correct)
			{
				 wronganswers++;
			}
		}
		while (guess != correct);
	}

	public String toString()
	{
		percentage = (wronganswers/numberofguesses) * 100;
		String output= "It took " + numberofguesses + " guesses " + "to guess " + correct + "." + "You guessed wrong "  + percentage +  " percent of the time.";
		return output;
	}
}