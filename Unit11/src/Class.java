//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;


import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	private ArrayList<Class> myclass = new ArrayList<Class>(); //not sure if I need this
	private ArrayList<Double> averages = new ArrayList<Double>();
	
	public Class()
	{
		name="";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String nam, int stuCount)
	{
		name = nam;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public void sort() {
		
		Collections.sort(studentList);		
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.size();i++) {
			classAverage = classAverage + studentList.get(i).getAverage();
		}
		return classAverage / studentList.size();
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();	
	}	

	public double getStudentAverage(String stuName)
	{
		for (int i = 0; i < studentList.size(); i++) {
			if (stuName.equals(studentList.get(i).getName())) {
				return studentList.get(i).getAverage();			
			}		
		}
		return 0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		return studentList.get(studentList.size()-1).getName();	
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		return studentList.get(0).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getAverage() < failingGrade) {
				output = output + " " + studentList.get(i).getName();
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i = 0; i < studentList.size(); i++) {
			output = output + studentList.get(i) + "\t" + String.format("%.2f",getStudentAverage(i)) + "\n";
		}
	return output;
}
}