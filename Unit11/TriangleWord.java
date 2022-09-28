package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String printTriangle(String word)
	{
		String output="";
		for(int i=1; i<word.length()+1; i++) {
			for(int j=0; j<i; j++) {
				output = output + word.substring(0, i);
			}
			output+="\n";
		}
	return output;
	}
}