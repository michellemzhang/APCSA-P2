//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   int size = s.length();
	   mat = new char[size][size];
	   
	   for (int r = 0; r < mat.length; r++){ 
			for (int c = 0; c < mat[r].length; c++){ 
					 mat[r][c] = ' ';
			}
	   }
	   
	   for (int i = 0; i < s.length(); i++){
		   size = s.length() - i - 1;
		   mat[0][i] = s.charAt(i);
		   mat[size][i] = s.charAt(i);
		   mat[i][i] = s.charAt(i);
		   mat[s.length() - 1][i] = s.charAt(i);
	   }	  
	}

	public String toString()
	{
		String output="";
		for (int r = 0; r < mat.length; r++){ 
			for (int c = 0; c < mat[r].length; c++){ 
					output += mat[r][c];
			}
			output += "\n";
		}
		
	return output+"\n\n";
	}
}