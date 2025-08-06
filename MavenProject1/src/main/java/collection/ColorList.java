package collection;

import java.util.ArrayList;
import java.util.*;

public class ColorList {

	public static void main(String[] args) {
		List<String> color = new ArrayList<String>();
		
		// 1. add();
		
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Black");
		System.out.println("1." +color);
		
		
		// 2. get();
		
		color.get(2);
		System.out.println("2." +color.get(2));
		
		
		// 3. remove();
		
		color.remove(1);	
		System.out.println("3." +color);		
		//System.out.println(color.remove(1)); // to see which one is removed

		
		// 4. set();  - Replace elements at the required position/index
		
		color.set(2, "White");
		System.out.println("4." +color);	
		
		
		// Add a duplicate color again. Because List allows duplicates.
		color.add("Green");
		System.out.println(color);	// output - [Red, Green, White, Green]
		
		
		// 5. indexOf();
		
		System.out.println("5." +color.indexOf("Green"));	// If there are duplicates, only the 1st element index will be displayed
		System.out.println(color);
		
		// 6. lastIndexOf(); // Not there for Set
		System.out.println("6." +color.lastIndexOf("Green"));	// If there are duplicates, to get the last element Index this method is used.

		// 7. contains();
		
		System.out.println("7." +color.contains("White"));
		System.out.println("7." +color.contains("Black"));
		
		// 8. isEmpty();
		
		List<String> color1 = new ArrayList<String>();
		System.out.println("8." +color.isEmpty());
		System.out.println("8." +color1.isEmpty());
		
		
		// 9. size();
		
		System.out.println("9." +color.size());
		System.out.println("9." +color1.size());
		
		
		// 10 clear();
		List<String> color2 = new ArrayList<String>();
		color2.add("Purple");
		color2.add("Amber");
		System.out.println("10." +color2);	
		color2.clear();
		System.out.println("10." +color2);
		

	}

}
