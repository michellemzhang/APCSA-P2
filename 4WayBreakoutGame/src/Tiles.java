import java.awt.Color;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;


import javax.imageio.ImageIO;

public class Tiles extends Block
{
	
	private List<Tile> tiles;
	private List<Tile> tiles1;
	
	
	public Tiles()
	{
		tiles = new ArrayList<Tile>();		
		
		//top tiles first layer
		int topx = 0; 				
		for (topx = 110; topx < 690; topx = topx + 108)
		{
			tiles.add(new Tile(topx, 0, 108, 40, Color.green));
			topx += 10;
		}
		
		//top tiles second layer
		for (topx = 110; topx < 690; topx = topx + 108)
		{
			tiles.add(new Tile(topx, 50, 108, 40,  Color.yellow));	
			topx += 10;
		}
		
		//bottom tiles first layer
		int bottomx = 0; 
		for (bottomx = 110; bottomx < 690; bottomx = bottomx + 108)
		{
			tiles.add(new Tile(bottomx, 500, 108, 40, Color.green));	
			bottomx += 10;
		}
	
		//bottom tiles second layer
		
		for (bottomx = 110; bottomx < 690; bottomx = bottomx + 108)
		{
			tiles.add(new Tile(bottomx, 450, 108, 40, Color.yellow));	
			bottomx += 10;
		}
		
		//left tiles first layer
		int lefty = 0; 
		for (lefty = 100; lefty < 450; lefty = lefty + 60)
		{			
			tiles.add(new Tile(0, lefty, 40, 60, Color.green));		
			lefty += 10;
		}
		
		//left tiles second layer 
		for (lefty = 100; lefty < 450; lefty = lefty + 60)
		{
			tiles.add(new Tile(50, lefty, 40, 60, Color.yellow));		
			lefty += 10;
		}
	
		//right tiles first layer
		int righty = 0;	
		for (righty = 100; righty < 450; righty = righty + 60)
		{
			tiles.add(new Tile(740, righty, 40, 60, Color.green));	
			righty += 10;
		}
		
		//right tiles second layer		
		for (righty = 100; righty < 450; righty = righty + 60)
		{
			tiles.add(new Tile(690, righty, 40, 60, Color.yellow));	
			righty += 10;
		}
	}
	
	public void drawEmAll(Graphics window)
	{
		for (Tile a: tiles)
		{
			a.draw(window);
		}
	}
	
	public List<Tile> getTiles()
	{
		return tiles;
	}

	public void remove(Tile x) 
	{
		tiles.remove(x);		
	}

	public int size() {
		return tiles.size();
	}
}
