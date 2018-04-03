//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100, 150);
		setWidth(10);
		setHeight(10);
		setColor(Color.WHITE);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x , int y) {
		setPos(x, y);
	}
	
	public Block(int x, int y, int w, int h) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
	}
	
	public Block(int x, int y, int w, int h, Color z) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(z);
	}
	
	  //add the other set methods
   
   public void setPos(int x, int y) {
	   setX(x);
	   setY(y);
   }
   
   public void setX(int x) {
	   xPos = x;
   }

   public void setY(int y) {
	   yPos = y;
   }
   
   public void setWidth(int w) {
	   width = w;
   }
   
   public void setHeight(int h) {
	   height = h;
   }
   
   public void setColor(Color col)
   {
	   color = col;
   }

   public int getX() {
	   return xPos;
   }
   
   public int getY() {
	   return yPos;
   }
   
   public int getWidth() {
	   return width;
   }
   
   public int getHeight() {
	   return height;
   }
   
   public Color getColor() {
	   return color;
   }
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block myblock = (Block) obj;
		if (myblock.getX() == this.getX() && myblock.getY() == this.getY() && myblock.getHeight() == this.getHeight() && myblock.getWidth() == this.getWidth()) {
			return true;
		}
		return false;
	}   

   //add the other get methods
    public String toString() {
    	return xPos + " " + yPos + " " + width + " " + height + " " + color;

   //add a toString() method  - x , y , width, height, color
    }
}