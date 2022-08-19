//� A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Song
//Date - 08/1922
//Class - APCSA
//Lab  - Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.print("**********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("\n\n");
   }
   
   public void printASmallBox()
   {	
	   out.println(" _");
	   out.print("|_|");
   }
 
   public void printABigBox()
   { 	
	   out.println("______________________________");
	   out.println("|                            |");
	   out.println("|                            |");
	   out.println("|                            |");
	   out.println("|                            |");
	   out.println("|                            |");	   
	   out.println("|                            |");
	   out.println("|                            |");
	   out.println("|____________________________|");
   }   
}
