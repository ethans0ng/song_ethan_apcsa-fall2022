package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name :: Ethan Song

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter in a word :: ");
		String word = keyboard.next();
		
		TriangleOne buyan = new TriangleOne(word);
		out.println(buyan);
	}
}