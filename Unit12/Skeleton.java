package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	public Skeleton(String a, int b) {
		name = a;
		size = b;
	}
	public int getHowBig() {
		return size;
	}

	public String getName() {
		return name;
	}

	public boolean isBigger(Monster other) {
		return size>other.getHowBig();
	}

	public boolean isSmaller(Monster other) {
		return size<other.getHowBig();
	}
	
	public boolean isEqual(Monster other) {
		return size==other.getHowBig();
	}

	public boolean namesTheSame(Monster other) {
		return name.equals(other.getName());
	}
	
	public String toString() {
		return name + " " + size;
	}
}