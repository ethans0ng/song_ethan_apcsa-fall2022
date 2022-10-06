package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word[] neal = new Word[size];
		
		for(int i=0; i<size; i++) {
			neal[i]=new Word(file.nextLine());
		}
		

		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(neal[j].compareTo(neal[j+1])==1) {
                    Word temp = neal[j];
                    neal[j] = neal[j + 1];
                    neal[j + 1] = temp;
				}
			}
		}
		
		for(int i=0; i<size; i++) {
			out.println(neal[i].getWord());
		}




	}
}