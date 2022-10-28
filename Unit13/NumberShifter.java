package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] buyan = new int[size];
		for(int i=0; i<size; i++) {
			buyan[i] = (int)(Math.random()*10)+1;
		}
		return buyan;
	}
	public static int[] shiftEm(int[] array)
	{
		int counter=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]==7) {
				int temp = array[counter];
				array[counter] = 7;
				array[i] = temp;
				counter++;
			}
		}
		return array;
	}
}