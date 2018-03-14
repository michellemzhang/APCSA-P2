//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;


import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
	    ArrayList<Class> myclass = new ArrayList<Class>(); // not sure if I need this
	    Class test = new Class();
	    ArrayList <Student> studentList = new ArrayList<Student>();
	    
	    out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));

		String classname = file.nextLine();
		int num = file.nextInt();
		file.nextLine();
		test = new Class(classname, num);

		
		for (int i = 0; i < num; i++) {
			String name = file.nextLine();
			String gradeList = file.nextLine();
			test.addStudent(i, new Student(name, gradeList));
			}
		
	out.println();
	out.println(test.toString());
	out.println("Failure List = " +  test.getFailureList(70));
	out.println("Highest Average = " +  test.getStudentWithHighestAverage());
	out.println("Lowest Average = " + test.getStudentWithLowestAverage());
	out.println("Class Average = " + test.getClassAverage());
	
	out.println();
	test.sort();
    out.println(test.toString());
	out.println("Failure List = " +  test.getFailureList(70));
	out.println("Highest Average = " +  test.getStudentWithHighestAverage());
	out.println("Lowest Average = " + test.getStudentWithLowestAverage());
	out.println("Class Average = " + test.getClassAverage());
	
   }
}		
