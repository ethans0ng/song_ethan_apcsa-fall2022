package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name :: Ethan Song

import static java.lang.System.*;
import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter a sentence :: ");
		String number = keyboard.nextLine();
		out.print("\nEnter a letter to remove :: ");
		String davidli = keyboard.nextLine();
		char mauro = davidli.charAt(0);
		LetterRemover buyan = new LetterRemover(number, mauro);
		out.println(buyan);
						
	}
}