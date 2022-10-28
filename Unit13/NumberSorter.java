package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import static java.lang.System.*;

public class NumberSorter
{

	private static int getNumDigits(int number)
	{
		 int digits=1;
		 while(number>=10) {
			 digits++;
			 number=number/10;
		 }
		 return digits;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int divide10 = number;
		for(int i=0; i<getNumDigits(number); i++) {
			sorted[i] = divide10%10;
			divide10=divide10/10;
		}
		Arrays.sort(sorted);
		return sorted;
	}
}