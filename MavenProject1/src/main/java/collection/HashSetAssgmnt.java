
/*
 * Set and HashSet[methods]
 *  ➢ Write a Java program to create a new Set, add some colors (string) and print out the collection. 
 */



package collection;

import java.util.*;

public class HashSetAssgmnt {

	public static void main(String[] args)
	{
		
		HashSet<String> colors = new HashSet<String>();
		colors.add("Indigo");
		colors.add("Purple");
		colors.add("Amber");
		colors.add("Silver");
		colors.add("Black");
		System.out.println("The colors are: "+colors);
		
		Iterator<String> iterator = colors.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}
}
