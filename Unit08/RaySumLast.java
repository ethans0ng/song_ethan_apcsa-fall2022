package Unit08;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 09/07/22

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum=-1;
		for(int i=0; i<ray.length; i++) {
			if(ray[i]>ray[ray.length-1]) {
				sum+=ray[i];
			}
		}
		if(sum==-1) {
			return sum;
		}
		return sum+1;
	}
}