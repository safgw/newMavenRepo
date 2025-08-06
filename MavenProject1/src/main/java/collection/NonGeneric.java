package collection;

import java.util.*; // Import everything in java.util
import java.util.ArrayList;
import java.util.List;


public class NonGeneric {

	public static void main(String[] args) {
		List s = new ArrayList();		
		s.add("Hello"); // string
		s.add(2.5f);//float
		s.add(5);
		s.add('J');
		s.add(true); // boolean		
		System.out.println(s);
		
		
		List s0 = new LinkedList();		
		s0.add("Hello"); // string
		s0.add(2.5f);//float
		s0.add(5);
		s0.add('J');
		s0.add(true); // boolean		
		System.out.println(s0);
		
		
				
		Set s1 = new HashSet();		
		s1.add("Hello"); // string
		s1.add(2.5f);//float
		s1.add(5);
		s1.add('J');
		s1.add(true); // boolean		
		System.out.println(s1);
		
		/*
		 //Treeset cannot be used for Non Generic format
		  
		Set s1 = new TreeSet();		
		s1.add("Hello"); // string
		s1.add(2.5f);//float
		s1.add(5);
		s1.add('J');
		s1.add(true); // boolean		
		System.out.println(s1);
		
		*/

	}

}
