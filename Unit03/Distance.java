package Unit03;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Ethan Song
//Date - 8/22/22
//Class - APCSA
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = getDistance();
	}
	
	public double getDistance()
	{
		return Math.sqrt(Math.pow(((double)xOne-xTwo),2) + Math.pow(((double)yOne-yTwo),2));
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance == "  + (Math.floor(distance*1000)/1000);
	}
}