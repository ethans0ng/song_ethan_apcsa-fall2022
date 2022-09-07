package Unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ethan Song 

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		do {
		
			String player = "";
		
			out.print("type in your prompt [rock,paper,scissors] :: ");
			
			player = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors(player);		
			out.println(game);
			out.println("Play agian little man? [yes, no]");
			}
		while (keyboard.next().equals("yes"));
	}
}


