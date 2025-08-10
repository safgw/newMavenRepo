/*
 Udemy
Selenium WebDriver with Java -Basics to Advanced+Frameworks
Modifying and Analyzing an ArrayList
ArrayList Manipulation:

In the main function, modify the ArrayList a to contain the elements "apple", "banana", "cherry", "mango", "apple" (with duplicates).

Print the ArrayList after these additions.

Element Removal:

Remove the first occurrence of "apple" from the ArrayList.

Print the ArrayList after the removal.

Element Search:

Check if the ArrayList contains the element "orange".

Print a message indicating whether "orange" is found or not.

Size and Content Check:

Print the size of the ArrayList.

Use a loop to iterate through the ArrayList and print the index and value of each element.
 */


package coreJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples1 {
    
    public static void main(String[] args) {

        
        List<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        System.out.println("First List: "+a);
        
        a.remove("apple");
     
        System.out.println("First occurance of 'apple' removed: "+a);
        
        a.contains("orange");
        System.out.println("'Orange' is not found in the list: "+a);
        
        System.out.println("The size of the ArrayList is: "+a.size());
        
        for(int i=0; i<a.size();i++)
        {
            
            System.out.println("The index of "+a.get(i)+" is "+i);
        }
            
        
    }

}