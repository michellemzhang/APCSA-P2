//© A+ Computer Science  -  www.apluscompsci.com
//Name - Michelle Zhang
//Date - 02/07/18
//Class - APCSA Period 2
//Lab  - Circle 

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = Math.PI * (radius * radius);
	}

	public void print( )
	{
		System.out.printf("The area is: %.2f \n\n", area);
	}
}