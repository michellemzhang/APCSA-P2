//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		myGrades = new Grades();
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{

		setName(name);
		this.myGrades = new Grades(gradeList);

	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	}	
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return myGrades.getSum() / myGrades.getNumGrades();
	}

	public double getAverageMinusLow()
	{
		double withoutlow = myGrades.getSum() - myGrades.getLowGrade();
		return withoutlow / (myGrades.getNumGrades() - 1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();	
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();
	}
	
	public int compareTo(Student param) {
		if (getAverage()> param.getAverage()) {
			return 1;
		}
		else if (getAverage() < param.getAverage()) {
			return -1;
		}
		return 0;
	}
	
	public String toString()
	{
		return myName + " = " + myGrades.toString();
	}	
}