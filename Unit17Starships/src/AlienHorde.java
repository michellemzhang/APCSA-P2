//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private Image image;

	public AlienHorde(int size)
	{
		int x = 50;
		int y = 50;
		aliens = new ArrayList<Alien>();
		for (int i = 0; i < size; i++)
		{
			aliens.add(new Alien(x, y, 40, 40, 2));
			x+= 50;
			if (x == 700)
			{
				x = 50; 
				y += 50;
			}
		}
		try
		{
			image = ImageIO.read(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit17Starships\\src\\alien.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("Alien Constructor Problem");
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{ 
		for (int i = 0; i < aliens.size(); i++)
		{
			window.drawImage(image, aliens.get(i).getX(), aliens.get(i).getY(), aliens.get(i).getWidth(), aliens.get(i).getHeight(), null);
		}
	}

	public void moveEmAll()
	{
		for (int i=0; i < aliens.size(); i++) {
			aliens.get(i).setX(aliens.get(i).getX() + aliens.get(i).getSpeed());
			if (aliens.get(i).getX()>740)
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			if (aliens.get(i).getX()<0)
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i=0; i<shots.size(); i++)
		{
			for (int j=0; j<aliens.size(); j++)
			{
				if (shots.get(i).getX() >= aliens.get(j).getX()
						&& shots.get(i).getX() <= aliens.get(j).getX() + 45 
						&& shots.get(i).getY() <= aliens.get(j).getY() + 70)
				{
					shots.remove(i);
					aliens.remove(j);
					if (shots.size()==0) break;
				}
			}
		}
	}
	
	public boolean gameIsWon()
	{
		if (aliens.size()==0)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return " ";
	}
		
}