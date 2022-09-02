package Unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ethan Song

import static java.lang.System.*;

public class Triples
{
	private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private boolean greatestCommonFactor(int a, int b, int c)
	{
		int gcf=1;
		for(int i=1; i<=a || i<=b || i<=c; i++) {
			if(a%i==0 && b%i==0 && c%i==0) {
				gcf = i;
			}
		}
		return gcf==1;
		
	/* Notice requirements were:  Second, if a is odd, b must be even
	 * if a is even then b must be odd, and c must be odd for either a / b combination.   
	 * Lastly, the greatest common factor of a, b, and, c must be no greater than 1.   
	 *  
	 *  If gcf(a,b,c) = 1, then it is a primitive Pythag triple. Primitive pythag triples always have to be 2 odd and 1 even.
	 *  O, O, E is not possible through basic math (O must be 4x+1 or 4x+3, and even must be in form 2x = > take modulo 4 = > contradiction)
	 *  Therefore must be OEO or EOO => requirements are useless as long as gcf=1
	 */
	}

	public String toString()
	{
		String output="";
		for(int a=1; a<=number; a++) {
			for(int b=a+1; b<=number; b++) {
				for(int c=b+1; c<=number; c++) {
					if(a*a+b*b==c*c && greatestCommonFactor(a,b,c)){
						 output = output + a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		return output+"\n";
	}
}