//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int counter = 0;
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++){
					mat[r][c] = game.charAt(counter);
					counter++;
 			}			
		}			
	}

	public String getWinner()
	{
		//horizontal win
				for (int r = 0; r < mat.length; r++){
						if (mat[r][0] == mat[r][1] && mat[r][1] == mat[r][2] && mat[r][0] == 'X'){
							return "X wins horizontally!";
						}
						if (mat[r][0] == mat[r][1] && mat[r][1] == mat[r][2] && mat[r][0] == 'O'){
							return "O wins horizontally!";
						}
				}

		//vertical win
			
			for (int c = 0; c < mat[0].length; c++){
					if (mat[0][c] == mat[1][c] &&  mat[1][c] == mat[2][c] && mat[1][c] == 'X') {
						return "X wins vertically!";
					}
					if (mat[0][c] == mat[1][c] &&  mat[1][c] == mat[2][c] && mat[1][c] == 'O') {
						return "O wins vertically!";
					}	
			}	
		

		//first diagonal
	
			if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2] && mat[0][0] == 'X') {
				return "X wins diagonally!";
			}
			if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2] && mat[0][0] == 'O') {
				return "O wins diagonally!";
			}
		
		//second diagonal
			
			if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0] && mat[0][2] == 'X') {
				return "X wins diagonally!";
			}
			if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0] && mat[0][2] == 'O') {
				return "O wins diagonally!";
			}
			
			return "cat's game - no winner!";
		}
			


	public String toString()
	{
		String output = " ";
		for (int r = 0; r < mat.length; r++){ 
			for (int c = 0; c < mat[r].length; c++){ 
					output += mat[r][c];
			}
			output += "\n";
		}
		output += getWinner();
		return output+"\n\n";
	}
}