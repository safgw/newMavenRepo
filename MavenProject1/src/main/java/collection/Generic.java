package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Generic {

	public static void main(String[] args) {
			List<String> s = new ArrayList();
			
		// or 	ArrayList<String> s = new ArrayList();
			s.add("Hello "); // string
			s.add("How ");//float
			s.add("are ");
			s.add("you?");
			System.out.println(s);

		/*
			
			List<String> s= new LinkedList<String>();		
			s.add("Hello "); // string
			s.add("How ");//float
			s.add("are ");
			s.add("you?");
			System.out.println(s);
			*/
			
			
					
			Set<Integer> s1 = new HashSet<Integer>();		
			s1.add(1); // string
			s1.add(2);//float
			s1.add(3);
			s1.add(4);
			s1.add(5);
			s1.add(6);
			s1.add(7);
			System.out.println(s1);
			
						  
			Set<Integer> s2 = new TreeSet<Integer>();		
			s2.add(10);
			s2.add(20);
			s2.add(30);
			s2.add(40);
			s2.add(50);		
			System.out.println(s2);
			
			


	}

}
