package Unit05;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 08/24/22
//Class - APCSA	
//Lab  - StringOddOrEven

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		return word.length() % 2 == 0;
	}

 	public String toString()
 	{
 		if(isEven()) {
 			return word + " is even.";
 		}
 		return word + " is odd.";
	}
}
