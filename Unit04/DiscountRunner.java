package Unit04;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Song
//Date - 08/23/22
//Class - APCSA
//Lab  - DiscountRunner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		System.out.printf("Bill after discount :: %.2f\n", Discount.getDiscountedBill(amt));		
	}
}