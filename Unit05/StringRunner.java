package Unit05;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 08/24/22
//Class - APCSA
//Lab  - StringRunner

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter a word :: ");
		String word = keyboard.next();
		
		StringOddOrEven buyan = new StringOddOrEven(word);
		out.println(buyan);
	}
}