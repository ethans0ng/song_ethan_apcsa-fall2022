package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{	
		if(rhs.getSize()==getSize()) {
			for(int i=0; i<getSize(); i++) {
				if(word.charAt(i)==rhs.getWord().charAt(i)) {
					continue;
				}
				else if(word.charAt(i)>rhs.getWord().charAt(i)) {
					return 1;
				}
				else
					return -1;
			}
		}
		return rhs.getSize()==word.length() ? 0 : rhs.getSize() > getSize() ? -1 : 1;
	}

	public String getWord() {
		return this.word;
	}
	
	public int getSize() {
		return word.length();
	}
	
	public String toString()
	{
		return "";
	}
}