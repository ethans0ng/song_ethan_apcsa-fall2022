package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 1st monster's name :: ");
		String name1 = keyboard.next();
		
		System.out.print("Enter 1st monster's size :: ");
		int size1 = keyboard.nextInt();
		
		Skeleton s1 = new Skeleton(name1, size1);
		
		System.out.print("Enter 2nd monster's name :: ");
		String name2 = keyboard.next();
		
		System.out.print("Enter 2nd monster's name :: ");
		int size2 = keyboard.nextInt();
		
		Skeleton s2 = new Skeleton(name2, size2);
		
		System.out.println("\nMonster 1 - " + s1);
		System.out.println("Monster 2 - " + s2 + "\n");
		
		if(s1.isEqual(s2)) 
			System.out.println("Monster 1 is the same size as Monster 2. \n");
		
		else if(s1.isSmaller(s2)) 
			System.out.println("Monster 1 is smaller than Monster 2. \n");
		
		else
			System.out.println("Monster 1 is bigger than Monster 2. \n");
		
		if(s1.namesTheSame(s2))
			System.out.println("Monster 1 has the same name as Monster 2.");
		else
			System.out.println("Monster 1 does not have the same name as Monster 2. \n");
	}
}