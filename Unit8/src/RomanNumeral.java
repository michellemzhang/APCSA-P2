//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.awt.List;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom; 
	}

	public Integer getNumber()
	{
		number = 0;
		int locate;
	
		for (int i = 0; i < LETTERS.length; i++)
		{
			locate = roman.indexOf(LETTERS[i]);
			
			while (locate == 0 && roman.indexOf(LETTERS[i]) == 0)
			{
				number += NUMBERS[i];
				
				if (LETTERS[i].length() == 2)
				{
					roman = roman.substring(2);
				}
				else
				{
					roman = roman.substring(1);		
				}
			}
		}
		return number;
	}

	public String toString()
	{
		String roman = " ";
		int baseten = number;
		while (baseten >= 1000)
		{
			roman += "M";
			baseten -= 1000;
		}
		while (baseten >= 900)
		{
			roman += "CM";
			baseten -= 900;
		}
		while (baseten >= 500)
		{
			roman += "D";
			baseten -= 500;
		}
		while (baseten >= 400)
		{
			roman += "CD";
			baseten -= 400;
		}
		while (baseten >= 100)
		{
			roman += "C";
			baseten -= 100;
		}
		while (baseten >= 90)
		{
			roman += "XC";
			baseten -= 90;
		}
		while (baseten >= 50)
		{
			roman += "L";
			baseten -= 50;
		}
		while (baseten >= 40)
		{
			roman += "XL";
			baseten -= 40;
		}
		while (baseten >= 10)
		{
			roman += "X";
			baseten -= 10;
		}
		while (baseten >= 9)
		{
			roman += "IX";
			baseten -= 9;
		}
		while (baseten >= 5)
		{
			roman += "V";
			baseten -= 5;
		}
		while (baseten >= 4)
		{
			roman += "IV";
			baseten -= 4;
		}
		while (baseten >= 1)
		{
			roman += "I";
			baseten -= 1;
		}

		return roman; 
	}
}