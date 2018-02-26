import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
 
public class Lab14d
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many grades?");
		int numberofgrades = keyboard.nextInt();
		
		Grades test = new Grades(numberofgrades);
		test.setGrades();
		test.getAverage();
		System.out.println(test.toString());	
	}
}