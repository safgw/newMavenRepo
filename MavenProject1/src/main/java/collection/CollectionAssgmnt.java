/*
 ➢ Write a Java program to create a new array list, add some colors (string) and print out the collection.
 ➢ Write a Java program to retrieve an element (at a specified index) from a given array list. 
 ➢ Write a Java program to iterate through all elements in a array list. 
 ➢ Write a Java program to remove the third element from a array list. 
 ➢ Write a Java program to search an element in a array list.

 */


package collection;

import java.util.*;

public class CollectionAssgmnt {

	public static void main(String[] args) 
	{
		List<String> colors = new ArrayList<String>();
		colors.add("Indigo");
		colors.add("Purple");
		colors.add("Amber");
		colors.add("Silver");
		colors.add("Black");
		
		System.out.println("The colors are: "+colors);
		System.out.println("The color at the 2nd Index is: "+colors.get(2));
		
		for(String i:colors)
		{
			System.out.println(i);
		}
		
		colors.remove(3);
		System.out.println("The colors after removing the 3rd element is are: "+colors);		
		System.out.println("Is the color Black available in the list: "+colors.contains("Black"));				

	}

}
