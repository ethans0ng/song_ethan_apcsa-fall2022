package Unit05;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 08/24/22
//Class - APCSA
//Lab  - StringEqualityRunner

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		out.println(StringEquality.Answer("hello", "goodbye"));
		out.println(StringEquality.Answer("one", "two"));
		out.println(StringEquality.Answer("three", "four"));
		out.println(StringEquality.Answer("TCEA", "UIL"));
		out.println(StringEquality.Answer("State", "Champions"));
		out.println(StringEquality.Answer("ABC", "ABC"));
		out.println(StringEquality.Answer("ABC", "CBA"));
		out.println(StringEquality.Answer("Same", "Same"));
		out.println(StringEquality.Answer("Ethan", "Song"));
	}
}