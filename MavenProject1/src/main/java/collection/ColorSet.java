//Anything related to index cnnot be used in case of Set
package collection;

import java.util.*;

public class ColorSet {

	public static void main(String[] args) {
		Set<String> color3 = new HashSet<String>();
		color3.add("Indigo");
		color3.add("Golden");
		color3.add("Silver");
		color3.add("Brown");
		
		System.out.println(color3);
		
		Set<String> fruit = new HashSet<String>();
		fruit.add("Banana");
		fruit.add("Lemon");
		System.out.println(fruit); // [Lemon, Banana]
		 
		//1. addAll() - used to add the elements of a list/set to another list/set
				color3.addAll(fruit);
				System.out.println("1. "+color3); // [Brown, Pink, Yellow, Lemon, Banana]
				
		//2. containsAll() - used to check colo3 contains fruits
				System.out.println("2. "+color3.containsAll(fruit)); //true
				
		//3. removeAll() - used to remove the elements of a list from another list
				color3.removeAll(fruit);
				System.out.println("3. "+color3); // [Brown, Pink, Yellow]
				System.out.println("3. "+color3.containsAll(fruit)); //false

	}

}
