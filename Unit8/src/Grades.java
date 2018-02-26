//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	private double[] nums;
	
	public Grades(int numberofgrades)
	{
		nums  = new double[numberofgrades];
	}

	public void setGrades()
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Enter the grade: ");
			double answer = keyboard.nextDouble();
			nums[i] = answer;
		}
	}

	private double getSum()
	{
		double sum=0.0;
		
		for (int i = 0; i < nums.length; i++)
		{
			sum = sum + nums[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;

		average = getSum() / nums.length;

		return average;
	}


	public String toString()
	{
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("grade " + i + " :: "+ nums[i]);
		}
		
		return "Average =  " + getAverage();
	}
}