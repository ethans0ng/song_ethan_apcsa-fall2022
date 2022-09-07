package Unit08;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 09/07/22

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for(int i=0; i<numArray.length-1; i++) {
			if(numArray[i]<=numArray[i+1]) {
				return false;
			}
		}
		return true;
	}	
}