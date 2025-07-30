/*
1. Reverse a string without using inbuilt methods.
2. Check if a string is a palindrome.
3. Remove duplicates from an ArrayList.
4. Find the second highest number in an array.
5. Count the frequency of characters in a string.
6. Difference between `==` and `.equals()` in Java.
7. Sort a HashMap by its values.
*/

//1. Reverse a string and check if its a palindrome without using inbuilt methods.



package sample;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.nextLine();
		
		char[] chars = word.toCharArray();    // CONVERT TO CHAR ARRAY
		
		String reversed = "";                 //INITIALIZE EMPTY STRING
		
		for(int i=chars.length-1; i>=0; i--)
		{
			System.out.println(chars[i]);
			reversed+= chars[i];              //ADDITION OF ARRAY TO THE REVERSED STRING
		}
		
		
		System.out.println("Reverse is "+reversed);
		
		if(word.equalsIgnoreCase(reversed.toString()))  // To check Palindrome, compare with the TO STRINGed version of reveresed
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its NOT Palindrome");
		}
		
//		2. Check if a string is a palindrome using inbuilt methods.

		System.out.println("Enter a String");
		String word1 = sc.nextLine();
		StringBuffer word2 = new StringBuffer(word1);	// bcoz reverse method not applicable for StringMethods	
		
		System.out.println(word1);
		System.out.println(word2);
		
		if(word1.equalsIgnoreCase(word2.reverse().toString()))
		{		
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its NOT Palindrome");
		}
	

	}

}
