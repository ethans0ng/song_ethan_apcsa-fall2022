package Unit07;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Ethan Song

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		double pp = Math.random();
		if(pp*3<=1) {
			compChoice = "r";
		}
		else if(pp<=2) {
			compChoice = "p";
		}
		else {
			compChoice = "s";
		}
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals("rock") && compChoice.equals("r") || playChoice.equals("paper") && compChoice.equals("p") || playChoice.equals("scissors") && compChoice.equals("s")) {
			winner = "tie U noob!";
		}
		if(playChoice.equals("rock") && compChoice.equals("p") || playChoice.equals("paper") && compChoice.equals("s") || playChoice.equals("scissors") && compChoice.equals("r")) {
			winner = "Computer mauro wins:: " + compChoice + " crushes " + playChoice;
		}
		if(playChoice.equals("rock") && compChoice.equals("s") || playChoice.equals("paper") && compChoice.equals("r") || playChoice.equals("scissors") && compChoice.equals("p")) {
			winner = "Player wins:: " + playChoice + " beats " + compChoice;
		}
		return winner;
	}

	public String toString()
	{
		String output="";
		output +="player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}