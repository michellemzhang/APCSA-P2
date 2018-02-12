//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	private int cut; 

	public Name()
	{
		name = "";	
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	    name = s;
   }

	public String getFirst()
	{
		cut = name.lastIndexOf(" ");
		return name.substring(0, cut);
	}

	public String getLast()
	{
		return name.substring(cut + 1);
	}

 	public String toString()
 	{
 		return name;
	}
}