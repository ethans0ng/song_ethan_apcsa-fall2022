package Unit08;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 09/07/22

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int d1=-1,d2=-1;
		for(int i=0; i<ray.length; i++) {
			if(ray[i]%2==1) {
				d1 = i;
				break;
			}
		}
		
		if(d1==-1)
			return -1;
	
		
		for(int i=d1; i<ray.length; i++) {
			if(ray[i]%2==0) {
				d2 = i;
				break;
			}
		}
		
		if(d2==-1)
			return -1;
		
	return d2-d1;
	}
}