package Unit05;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song
//Date - 08/24/22
//Class - APCSA
//Lab  - WordsCompareRunner

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(in);
	   out.print("Enter in word one please :: \n");
	   String wordOne = keyboard.next();
	   out.print("Enter in word one please :: \n");
	   String wordTwo = keyboard.next();
	   
	   WordsCompare buyan = new WordsCompare(wordOne, wordTwo);
	   buyan.compare();
	   out.print(buyan.toString());
   }
}