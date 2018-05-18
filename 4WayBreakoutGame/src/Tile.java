import java.awt.Color;

import java.awt.Graphics;

public class Tile extends Block
{
	public Tile(int x, int y)
	{
		super(x, y);
	}
	
	public Tile(int x, int y, int w, int h, Color c)
	{
		super(x, y, w, h, c);
	}
}
