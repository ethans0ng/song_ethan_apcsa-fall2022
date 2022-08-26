package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name :: Ethan Song

import static java.lang.System.*; 
import java.util.Scanner;

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter a number :: ");
		int number = keyboard.nextInt();
		
		Perfect buyan = new Perfect(number);
		out.println(buyan);
	}
}