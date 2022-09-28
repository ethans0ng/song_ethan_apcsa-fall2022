package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String printWord(String word, int times)
	{
		String output = "";	
		for(int i=0; i<times; i++) {
			output=output+word+"\n";	
		}
		return output;
	}
}