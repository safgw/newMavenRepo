// 3 methods of Iterator used only Set because Index is not there

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String> name = new HashSet<String>();
		name.add("Java");
		name.add("Dev");
		name.add("SDET");	
		name.add("QA");
		name.add("PM");
		name.add("TPM");
		System.out.println(name);
		
		// USING ITERATOR methods
		
		/*  
		
		Iterator<String> i = name.iterator();
		while(i.hasNext()) // To ensure that its not empty
		{
			System.out.println(i.next());
		}
		i.remove();  // Removes the last element
		System.out.println(name); 

*/
		
		// USING FOR EACH LOOP

		
		for(String j: name)		
		
		{
			System.out.println(j);
			}
		
	}

}
