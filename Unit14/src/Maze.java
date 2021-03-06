//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private int count;
   private int thesize;
   private boolean exitfound;
   
	public Maze()
	{
		count = 0;
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		Scanner theline = new Scanner(line);
		thesize = size;
		maze = new int[thesize][thesize];
		int counter = 0;
		for (int r = 0; r < maze.length; r++) {
			for (int c = 0; c < maze[r].length; c++){
					maze[r][c] = theline.nextInt();
					counter++;
				}
		}
	}

	public boolean hasExitPath(int r, int c)
	{	
		if (maze[r][c] == 1){
			count++;
			maze[r][c] = '0';
			if (c == thesize - 1) {
				exitfound = true;
			}
			
			if (r > 0){
				hasExitPath(r-1, c);
			}
			if (r < thesize - 1){
				hasExitPath(r+1, c);
			}
			if (c > 0){
				hasExitPath(r, c-1);
			}
			if (c < thesize - 1){
				hasExitPath(r, c+1);
			}
		}
		return exitfound;
	}
	
	public int getCount()
	{
		return count;
	}

	public String toString()
	{
		String output="";
		for (int r = 0; r < maze.length; r++){ 
			for (int c = 0; c < maze[r].length; c++){ 
					output += maze[r][c];
			}
			output += "\n";
		}
		
		if (hasExitPath(0,0) == true) {
			output += " exit found - " + getCount() + " STEPS";
		}
		else{
			output += " exit not found";
		}
		
		count = 0;
		
		return output;
	}
}