package Unit04;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a>b) {
			return Math.round(100*(a-b))/100;
		}
		else if (a<b) {
			return (double)(b-a);
		}
		else {
			return a*b;
		}
	}
}