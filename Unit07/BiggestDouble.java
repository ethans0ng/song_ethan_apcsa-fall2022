package Unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ethan Song

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	private double biggest;
	
	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
		if(a>b && a>c && a>d) {
			biggest = a;
		}
		else if(b>a && b>c && b>d) {
			biggest = b;
		}
		else if(c>a && c>b && c>d) {
			biggest = c;
		}
		else {
			biggest = d;
		}
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		return biggest;
	}

	public String toString()
	{
	   return one+" "+two+" "+three+" "+four;
	}
}