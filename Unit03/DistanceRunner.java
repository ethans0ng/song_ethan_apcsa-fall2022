package Unit03;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Song
//Date - 8/22/22
//Class - APCSA
//Lab  - DistanceRunner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner{

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();

		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();	
		
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();	
		
		Distance buyan = new Distance(x1, x2, y1, y2);
		
		buyan.calcDistance();
		System.out.println(buyan.toString());
	}
}