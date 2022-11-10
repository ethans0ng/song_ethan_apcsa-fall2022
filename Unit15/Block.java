package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
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
		xPos = 0;
		yPos = 0;
		width = 10;
		height = 10;
		color = Color.BLACK;

	}
	public Block(int x, int y) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	public Block(int x, int y, int iwidth) {
		xPos = x;
		yPos = y;
		width = iwidth;
		height = 10;
		color = Color.BLACK;
	}
	public Block(int x, int y, int iwidth, int iheight) {
		xPos = x;
		yPos = y;
		width = iwidth;
		height = iheight;
		color = Color.BLACK;
	}
	public Block(int x, int y, int iwidth, int iheight, Color icolor) {
		xPos = x;
		yPos = y;
		width = iwidth;
		height = iheight;
		color = icolor;
	}
	//add other Block constructors - x , y , width, height, color

   public void setColor(Color col)
   {
	   color = col;

   }

   public void draw(Graphics window)
   {
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
		Block obj1 = (Block) obj;
		return obj1.getX() == getX() && obj1.getY() == getY() && obj1.getHeight() == getHeight() && obj1.getWidth() == getWidth() && obj1.getColor().equals(getColor());
	}

	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
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

	public boolean didCollideLeft(Object obj) {
		Block obj1 = (Block) obj;
		return (getX() > obj1.getX()) && (getX() <= obj1.getX() + obj1.getWidth() && (getY()+getHeight() > obj1.getY() && getY() < obj1.getY() + obj1.getHeight())) ;

	}
	

	public boolean didCollideRight(Object obj) {
		Block obj1 = (Block) obj;
		
		return (getX() < obj1.getX()) && (getX() + getWidth() >= obj1.getX()  && (getY()+getHeight() > obj1.getY() && getY() < obj1.getY() + obj1.getHeight())) ;
	}
	

	public boolean didCollideTop(Object obj) {
		Block obj1 = (Block) obj;
		return (getY() < obj1.getY()) && (getY() + getHeight() >= obj1.getY() && (getX()+getWidth() > obj1.getX() && getX() < obj1.getX() + obj1.getWidth())) ;
	}
	

	public boolean didCollideBottom(Object obj) {
		Block obj1 = (Block) obj;
		return (getY() > obj1.getY()) && (getY() <= obj1.getY() + obj1.getHeight() && (getX()+getWidth() > obj1.getX() && getX() < obj1.getX() + obj1.getWidth())) ;
	}
   public String toString() {
	   return xPos + " " + yPos + " " + width + " " + height + "\n" + color;
   }
}
