package Unit04;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a whole number :: ");
		int number = keyboard.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number));
		
		
		System.out.println("\n5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		System.out.println("7 is odd :: " + NumberVerify.isOdd(7));
		System.out.println("7 is even :: " + NumberVerify.isEven(7));		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("9 is even :: " + NumberVerify.isEven(9));		System.out.println("13 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("9 is even :: " + NumberVerify.isEven(9));		System.out.println("8 is odd :: " + NumberVerify.isOdd(8));
		System.out.println("10 is even :: " + NumberVerify.isEven(10));
		//add in more test cases
	}
}