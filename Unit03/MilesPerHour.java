package Unit03;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Song
//Date - 8/22/22
//Class - APCSA
//Lab  - MilesPerHour	

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	public double speed;
	public int distance, hours, minutes;
	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		speed = (double)dist/(hrs+mins/60); 
	}



	public void print()
	{
		out.println(distance + " miles in " + hours + " hour(s) and " + minutes + " minutes = " + speed + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}