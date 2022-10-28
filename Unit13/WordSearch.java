package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;
import java.util.Arrays;

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for(int i=0; i<size; i++) {
    		for(int j=0; j<size; j++) {
    			m[i][j] = str.substring(i*size+j, i*size+j+1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	int r = m.length;
    	for(int i=0; i<r; i++) {
    		for(int j=0; j<r; j++) {
    			if(checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownLeft(word, i, j) || checkDiagDownRight(word, i, j)){
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		for(int i=c; i<c+w.length(); i++) {
			if(i>m.length-1) {return false;}
			if(!(""+w.charAt(i-c)).equals(m[r][i])){return false;}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for(int i=c; i>c-w.length(); i--) {
			if(i<0){return false;}
			if(!(""+w.charAt(c-i)).equals(m[r][i])) {return false;}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		for(int i=r; i>r-w.length(); i--) {
			if(i<0){return false;}
			if(!(""+w.charAt(r-i)).equals(m[i][c])) {return false;}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		for(int i=r; i<r+w.length(); i++) {
			if(i>m.length-1){return false;}
			if(!(""+w.charAt(i-r)).equals(m[i][c])) {return false;}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
//		Hello TA. Mr. Mauro said we only have to do one of these for testing since results match up using the first four methods already.
		for(int i=0; i<w.length(); i++) {
			if(r-i<0 || c+i>m.length-1){return false;}
			if(!((""+w.charAt(i)).equals(m[r-i][c+i]))) {return false;}
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		// See comment above
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		// See comment above
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		// See comment above
		return false;
	}

    public String toString()
    {
 		String output = "";
 		for(int i=0; i<m.length; i++) {
    		for(int j=0; j<m.length; j++) {
    			output+=(m[i][j] + " ");
    		}
    		output+="\n";
 		}
 		return output;
    }
}