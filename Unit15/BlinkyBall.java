package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {

	   super(x,y);

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {

	   super(x,y,wid/2);

   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {

	   super(x,y,wid/2,xSpd,ySpd);

   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x,y,wid/2,xSpd,ySpd,col);


   }

   public Color randomColor()
   {
 		return new Color((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256));
   }

   public void moveAndDraw(Graphics window)
   {
	   	//draw a white ball at old ball location

		   
		  draw(window, new Color(255,255,255));
	      setX(getX()+getXSpeed());
	      setY(getY()+getYSpeed());
			//setY
	      draw(window, randomColor());
			//draw the ball at its new location
	   }
}
