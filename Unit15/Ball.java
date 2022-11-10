package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(400,300);
		xSpeed = (Math.random() > 0.5) ? -3 : 3;
		ySpeed = (Math.random() > 0.5) ? -1 : 1;
	}
	
	public Ball(int x, int y){
		super(x,y);
	}
	public Ball(int x, int y, int xS, int yS) {
		super(x,y);
		xSpeed = xS;
		ySpeed = yS;
	}
	public Ball(int x, int y, int radius) {
		super(x,y,2 * radius, 2 * radius);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int radius, int xS, int yS) {
		super(x,y,2 * radius, 2 * radius);
		xSpeed = xS;
		ySpeed = yS;
	}
	public Ball(int x, int y, int radius, int xS, int yS, Color color) {
		super(x,y,2 * radius, 2 * radius, color);
		xSpeed = xS;
		ySpeed = yS;
	}

	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	public void setYSpeed(int yS) {
		ySpeed = yS;
	}
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location

	   
	  draw(window, new Color(255,255,255));
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
		//setY
      draw(window);
		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball obj1 = (Ball) obj;
		return toString.equals(obj1.toString());
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
   //add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
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
}
