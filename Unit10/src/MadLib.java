//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String story;
	

	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
	}

	public MadLib(String fileName)
	{
		this();
		loadVerbs();
		loadNouns();
		loadAdjectives();
		
		try{				
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine()){
				story = file.nextLine();				
			}
			file.close();
		}
		
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit10\\src\\nouns.dat"));
			while (file.hasNext())
			{
				nouns.add(file.next());
			}
			file.close();
				
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit10\\src\\verbs.dat"));
			while (file.hasNext());
			{
				verbs.add(file.next());
			}
			file.close();
	}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit10\\src\\adjectives.dat"));
			while (file.hasNext());
			{
				adjectives.add(file.next());
			}	
			file.close();
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		int randomnumber = (int)((Math.random()*verbs.size()) + 1);	
		return verbs.get(randomnumber);

	}
	
	public String getRandomNoun()
	{
		int randomnumber = (int)((Math.random()*nouns.size()) + 1);		
		return nouns.get(randomnumber);
	}
	
	public String getRandomAdjective()
	{
		int randomnumber = (int)((Math.random()*adjectives.size()) + 1);
		return adjectives.get(randomnumber);
	}		

	public String toString()
	{
		int r =story.length();
		for(int i = 0; i< r; i++){
			if (story.charAt(i) == '#')
			{
				
				story = story.substring(0, i) + getRandomNoun() + story.substring(i+1);
				r =story.length();
			}
			
			else if (story.charAt(i) == '@')
			{
				
				story = story.substring(0, i) + getRandomVerb() + story.substring(i+1);
				r =story.length();
			}
			else if (story.charAt(i) == '&')
			{
				story = story.substring(0, i) + getRandomAdjective() + story.substring(i+1);
				r =story.length();
			}		
		}
			
	return story;
	
	}
}