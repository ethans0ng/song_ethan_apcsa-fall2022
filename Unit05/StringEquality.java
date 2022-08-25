package Unit05;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 08/24/22
//Class - APCSA
//Lab  - StringEquality

// I am not instantiating because in order to print all the test cases it forced me to use a static class. So I am not using constructor

import static java.lang.System.*;

public class StringEquality
{
	public static String Answer(String one, String two) {
		String wordOne = one; String wordTwo = two;	
		if(!wordOne.equals(wordTwo)) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		return wordOne + " has the same letters as " + wordTwo + "\n";
	}
		
}