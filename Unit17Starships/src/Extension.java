import java.io.File;

import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Extension extends MovingThing
{
	private int speed;
	private Image image;


	public Extension()
	{
		this(0,0);
	}

	public Extension(int x, int y)
	{
		this(x, y, 10);
	}

	public Extension(int x, int y, int s)
	{
		super(x, y, 10, 10);
		setSpeed(s);
	}

	public Extension(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\zhangm6457\\Desktop\\APCSA-P2\\Unit17Starships\\src\\DeathStar.jpg"));
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

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	public void move(String direction)
	{
		if (direction.equals("RIGHT")) {
			setX(getX() + getSpeed());
		}
		if (direction.equals("LEFT")) {
			setX(getX() - getSpeed());
		}
		if (direction.equals("UP")) {
			setY(getY() + getSpeed());
		}
		if (direction.equals("DOWN")) {
			setY(getY() - getSpeed());
		}
	}
	
	public void addSize()
	{
		setWidth(getWidth() + 5);
		setHeight(getHeight() + 5);
	}
	
	public void minusSize()
	{
		setWidth(getWidth() - 5);
		setHeight(getHeight() - 5);
	}
	
	public String toString()
	{
		return super.toString() + getSpeed();
	}
}