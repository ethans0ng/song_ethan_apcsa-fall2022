package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if(num>0) {
			if(num%2==0) return 1 + countEvenDigits(num/10);
			else return 0 + countEvenDigits(num/10);
		}
		else return 0;
	}
}