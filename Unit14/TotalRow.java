package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.*;
import java.util.Arrays;

public class TotalRow
{
    public static String getRowTotals( int[][] m )
    {
    	int[] totals = new int[m.length];
    	for(int i=0; i<m.length; i++) {
    		int sum=0;
    		for(int j=0; j<m[i].length; j++) {
    			sum+=m[i][j];
    		}
    		totals[i]=sum;
    	}
    	return "Row totals are :: " + Arrays.toString(totals);
    }
}
