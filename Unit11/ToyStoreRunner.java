package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore buyan = new ToyStore();
		buyan.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		out.println(buyan);
	}
}