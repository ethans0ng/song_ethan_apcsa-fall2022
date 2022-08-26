package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name :: Ethan Song

import static java.lang.System.*;
import java.util.Scanner;

public class Perfect
{
   private int number;

	public Perfect(int perfect) {
		setNumber(perfect);
	}

	public void setNumber(int perfect) {
		number=perfect;
	}

	public boolean isPerfect()
	{
		int i = 1;
		int sum = 0;
		while(i<number) {
			if(i>number/2) {
				break;
			}
			else if(number%i == 0) {
				sum += i;
			}
			i++;
		}
		return sum == number;
	}

	public String toString()
 	{
 		if(isPerfect()) {
 			return number + " is perfect.";
 		}
 		return number + " is not perfect.";
	}
	
}