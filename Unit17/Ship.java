//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   super(x,y);
	}

	public Ship(int x, int y, int s)
	{
	   super(x,y);
	   speed = s;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.print("Mr. Mauro!");
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
		if(direction.equals("LEFT")) {this.setX(this.getX()-speed);}
		if(direction.equals("RIGHT")) {this.setX(this.getX()+speed);}
		if(direction.equals("UP")) {this.setY(this.getY()-speed);}
		if(direction.equals("DOWN")) {this.setY(this.getY()+speed);}
		if(direction.equals("SPACE")) {}
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
