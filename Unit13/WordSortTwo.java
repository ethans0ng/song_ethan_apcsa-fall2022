package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for(int i=0; i<wordRay.length; i++) {
			for(int j=i+1; j<wordRay.length; j++) {
				if(wordRay[i].charAt(0)>wordRay[j].charAt(0)) {
					String temp = wordRay[j];
					wordRay[j] = wordRay[i];
					wordRay[i] = temp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		sort();
		for(String word : wordRay) {
			output += word+"\n";
		}
		return output+"\n\n";
	}
}