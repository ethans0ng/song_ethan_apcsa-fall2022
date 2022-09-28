package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy buyan = new Toy();
		out.println(buyan);
		buyan.setCount(5);
		out.println(buyan);
		buyan.setName("gi joe");
		out.println(buyan.getName());
		out.println(buyan.getCount());
		out.println(buyan.getClass());
	}
}