package Unit09_2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 09/21/22

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = -1;
		int even = -1;
		for(int i=0; i<ray.size(); i++) {
			if(ray.get(i)%2==1) {
				odd=i;
				break;
			}
		}
		if(odd==-1) {
			return -1;
		}
		for(int i=odd; i<ray.size(); i++) {
			if(ray.get(i)%2==0) {
				even = i;
			}
		}
		if(even==-1) {
			return -1;
		}
		return even-odd;
	}
}