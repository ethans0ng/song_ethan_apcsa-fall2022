package Unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ethan Song

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		BiggestDouble ru = new BiggestDouble(14.51, 6.17, 71.8, 1.0);
		System.out.println(ru);
		System.out.println("biggest = " + ru.getBiggest() + "\n");
		
		BiggestDouble rua = new BiggestDouble(41.15, 816.7, 17.8, 19.0);
		System.out.println(rua);
		System.out.println("biggest = " + rua.getBiggest() + "\n");
		
		BiggestDouble rub = new BiggestDouble(884.5, 16.7, 7.8, 9.0);
		System.out.println(rub);
		System.out.println("biggest = " + rub.getBiggest() + "\n");
		
		BiggestDouble a = new BiggestDouble(4.5, -456.7, 677.8, 9.0);
		System.out.println(a);
		System.out.println("biggest = " + a.getBiggest() + "\n");
		
		BiggestDouble c = new BiggestDouble(4.5, 16.7, -7.8, -9.0);
		System.out.println(c);
		System.out.println("biggest = " + c.getBiggest() + "\n");
		
	}
}