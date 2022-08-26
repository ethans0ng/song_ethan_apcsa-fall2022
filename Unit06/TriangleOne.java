package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name :: Ethan Song

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
		
	}

	public String toString()
	{
		String newstring = "test";
		String print = "";
		int i = 0;
		while(newstring.length()>=1) {
			newstring = word.substring(0,word.length()-i);
			i++;
			print += newstring + "\n";
		}
		return print;
	}
}