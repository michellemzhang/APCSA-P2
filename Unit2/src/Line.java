//© A+ Computer Science  -  www.apluscompsci.com
//Name - Michelle Zhang
//Date - 02/07/18
//Class - APCSA Period 2
//Lab  - Line

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line()
	{	
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope = ((double)yTwo - yOne) / (xTwo - xOne);
	}

	public void print()
	{

		System.out.printf("The slope is: %.3f\n", slope);

	}
}