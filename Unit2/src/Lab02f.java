//� A+ Computer Science  -  www.apluscompsci.com
//Name - Michelle Zhang
//Date - 02/07/18
//Class - APCSA Period 2
//Lab  - Lab02f

public class Lab02f
{
	public static void main( String[] args )
   {
		Line test = new Line();
		
		test.setCoordinates(1, 9, 14, 2);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(1, 7, 18, 3);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(4, 5, 3, 4);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(5, 6, 1, 3);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(3, 9, 0, 3);
		test.calculateSlope();
		test.print();		
	}
}