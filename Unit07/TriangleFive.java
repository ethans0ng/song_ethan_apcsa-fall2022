package Unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ethan Song

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('a');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public void changeLetter(char c) {
		c+=1;
		if(c>90 && c<95) {
			c-=26;
		}
		if(c>122) {
			c-=26;
		}
		letter = c;
	}
	
	public String toString()
	{
		char setCar=letter;
		String output="";
		for(int c=0; c<amount; c++) {
			letter = setCar;
			for(int i=amount; i>c; i--) {
				
				for(int k=i; k>0; k--) {
					output += letter;
				}
				output+=" ";
				changeLetter(letter);
			}
			output+="\n";
		}
		return output;
	}
}