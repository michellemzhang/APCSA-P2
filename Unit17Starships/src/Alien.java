//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;

import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x, y, 10, 10, 10);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y, 10, 10);
		setSpeed(s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit17Starships\\src\\alien.JPG"));
		}
		catch(Exception e)
		{
			System.out.print("Problem");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   //add code here
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
