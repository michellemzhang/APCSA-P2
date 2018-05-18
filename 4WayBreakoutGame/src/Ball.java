//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;

import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	//add other Ball constructors

	public Ball(int x, int y) {
		super(x, y);
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
	
	public Ball(int x, int y, int w, int h, Color a) {
		super(x, y, w, h, a);
	}
	
	public Ball(int x, int y, int w, int h, Color a, int thexs, int theys) {
		super(x, y, w, h, a);
		setXSpeed(thexs);
		setYSpeed(theys);
	}
	
	//add the set methods
	
	public void setXSpeed(int xspeed) {
		xSpeed = xspeed;
	}
	
	public void setYSpeed(int yspeed) {
		ySpeed = yspeed;
	}
   
   public void moveAndDraw(Graphics window)
   {
   	  draw(window, Color.WHITE);
      setX(getX()+xSpeed);
      setY(getY() + ySpeed);
      draw(window, this.getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball myball = (Ball) obj;
		if (myball.getX() == this.getX() && myball.getY() == this.getY() 
				&& myball.getWidth() == this.getWidth() 
				&& myball.getHeight() == this.getHeight() && myball.getColor() == this.getColor()
				&& myball.getXSpeed() == this.getXSpeed() && myball.getYSpeed() == this.getYSpeed()) {
			return true;
		}
		return false;
	}  
	
	//add the get methods

	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	@Override
	public boolean didCollideLeft(Object obj) {
		Tile tl = (Tile) obj;
		if (getX() > tl.getX() && getX() <= tl.getX() + tl.getWidth() 
		&& (getY() >= tl.getY() && getY() + getHeight() <= tl.getY() + tl.getHeight())){
			return true;
		}
		else{
			return false;
		}		
	}
	
	public boolean didCollideRight(Object obj) {	
		Tile tr = (Tile) obj;
		if (getX() < tr.getX() && getX() + getWidth() >= tr.getX() 
			&& (getY() >= tr.getY() && getY() + getHeight() <= tr.getY() + tr.getHeight())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean didCollideTop(Object obj) {
		Tile tt = (Tile) obj;
		if (getY() < tt.getY() + tt.getHeight() && getY() + getHeight() >= tt.getY() 
			&& (getX() >= tt.getX() && getX() + getWidth() <= tt.getX() + tt.getWidth())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean didCollideBottom(Object obj) {
		Tile tb = (Tile) obj;
		if (getY() <= tb.getY() + tb.getHeight() && getY() + getHeight() > tb.getY()
			&& (getX() >= tb.getX() && getX() + getWidth() <= tb.getX() + tb.getWidth()))
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	
	//add a toString() method
	
	public String toString() {
		return this.getX() + " " + this.getY() + " " + this.getWidth() 
		+ " " + this.getHeight() + " " + this.getColor() 
		+ " " +  xSpeed + " " + ySpeed;
	}
}