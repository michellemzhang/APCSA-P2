/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		String upperCase = sample.toUpperCase();
		System.out.println("sample.toUpperCase() = " + upperCase);
		System.out.println("After to UpperCase(), sample = " + sample);
		
		System.out.println(sample.length());
		
		System.out.println(sample.charAt(0));
		
		System.out.println(sample.substring(0,10));
		
		System.out.println(sample.replaceAll("a", ""));
		
		int whereisit = sample.lastIndexOf("brown");
		System.out.println("sample.lastIndexOf(\"brown\") = " + whereisit);
	}

}
