package Unit04;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Song
//Date - 08/23/22
//Class - APCSA
//Lab  - NumberVerify

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if(num%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isEven( int num )
	{
		if(num%2!=1) {
			return true;
		}
		else {
			return false;
		}
	}	
}