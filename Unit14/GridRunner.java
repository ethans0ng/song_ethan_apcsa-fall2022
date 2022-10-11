package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid buyan = new Grid(10, 10, new String[] {"a", "b", "c", "x", "y", "z"});
		System.out.println(buyan);
		System.out.println(buyan.findMax(new String[] {"a", "b", "c", "x", "y", "z"}));
	}
}