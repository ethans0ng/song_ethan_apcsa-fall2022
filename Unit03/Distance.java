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
		distance = Math.sqrt(Math.pow(((double)x1-x2),2) + Math.pow(((double)y1-y2),2));
	}

	
	public void print()
	{
		out.println("distance == " + distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}