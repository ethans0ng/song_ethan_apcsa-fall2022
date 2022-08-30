package Unit06;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name :: Ethan Song

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", 'a');
	}

	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String lookFor1 = "" + lookFor;
		int loc = sentence.indexOf(lookFor1);
		while(loc>-1){
			sentence = sentence.substring(0,loc) + sentence.substring(loc+1,sentence.length());
			loc=sentence.indexOf(lookFor1);
		}
		return sentence;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}