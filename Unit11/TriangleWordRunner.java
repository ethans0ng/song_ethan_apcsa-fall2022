package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do{
				out.print("\nEnter a word :: ");
				String word = keyboard.next();
	 			
				System.out.println(TriangleWord.printTriangle(word));

				System.out.print("\nDo you want to enter more sample input? Y || N  ");
				choice=keyboard.next();			
			}
			while(choice.equals("Y")||choice.equals("y"));
	}
}