package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	
	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
			pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		String old = pups[0].getName();
		int oldage = 0;
		for(int i=0; i<pups.length; i++) {
			if(pups[i].getAge()>oldage) {
				oldage = pups[i].getAge();
				old = pups[i].getName();
			}
		}
		return old;
	}

	public String getNameOfYoungest()
	{
		String young = pups[0].getName();
		int youngage = pups[0].getAge();
		for(int i=0; i<pups.length; i++) {
			if(pups[i].getAge()<youngage) {
				young = pups[i].getName();
				youngage = pups[i].getAge();
			}
		}
		return young;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}