//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );  
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(100, 100, 50, 50);
				
   }

   public void upperBody( Graphics window )
   {

	   window.fillRect(100, 25, 50, 25);
   }

   public void lowerBody( Graphics window )
   {
	   window.fillOval(75, -25, 25, 25);
	   window.fillOval(125, -25, 25, 25);
   }
}