/*
 // Encapsulation
 //Child is BookChild
  
  8. Write a Java program to create a class called “Book” with private instance variables title, author, and price.
  Provide public getter and setter methods to access and modify these variables. 
  Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.
 */
//child is BookChild

package sample;

public class Book {
	
	private String title;
	private String author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	
	public double applyDiscount(int percentage)
	{
		return this.price-this.price*percentage/100;
	}

}
