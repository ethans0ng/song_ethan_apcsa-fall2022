package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private List<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for( String name: toys.split( " " )) {
			Toy t = getThatToy(name);
			if(t==null) {
				toyList.add(new Toy(name));
			}
			else
				t.setCount(t.getCount()+1);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy t: toyList) {
  			if(t.getName().equals( nm ))
  				return t;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
  		int max = Integer.MIN_VALUE;
  		for( Toy t: toyList) {
  			if(max<t.getCount()) {
  				max = t.getCount();
  				name = t.getName();
  			}
  		}
  		return name;
  	}  
  
  	public List<String> sortToysByCount()
  	{
  		int steven = toyList.size();
  		List<Toy> temp = toyList;
  		List<String> sorted = new ArrayList<String>();
  		String name = "";
  		for(int i=0; i<steven; i++) {
  			int max = Integer.MIN_VALUE;
  			int place = 0;
	  		for (int j=0; j<temp.size();j++) {
	  			Toy t = temp.get(j);
	  			if(max<t.getCount()) {
	  				max = t.getCount();
	  				name = t.getName();
	  				place = j;
	  			}
	  		}
	  		temp.remove(place);
	  		sorted.add(max+ " " + name);
  		}
  		return sorted;
  	}  
  	  
	public String toString()
	{
	   return "" + toyList + "\nmax == " + getMostFrequentToy() + " toy\n\n" + sortToysByCount();   
	}
}