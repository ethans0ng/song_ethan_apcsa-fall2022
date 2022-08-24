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
	private int distance, hours, minutes;
	private double mph;


	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		int timeMinutes = minutes + (60 * hours);
		float timeHours = timeMinutes/60.0f;
		mph = distance/timeHours;
	}
	
	public void print()
	{
		String d,h,m,mp;
		d = (""+distance);
		h = (""+hours);
		m = (""+minutes);
		rate = ("" + Math.floor(1000 * mph) / 1000);
		System.out.printf(d + " miles in " + h + (hours > 1 ? " hours and " : " hour and ") + m + (minutes > 1 ? " minutes = " : " minute = ") + rate + " MPH.");
	}
	
