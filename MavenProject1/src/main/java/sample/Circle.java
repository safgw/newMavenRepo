/*
 
https://www.w3resource.com/java-exercises/encapsulation/index.php
  
5. Write a Java program to create a class called Circle with a private instance variable radius. 
Provide public getter and setter methods to access and modify the radius variable. 
However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area
and perimeter based on the current radius value.

 */



package sample;
// Encapsulation
// Child is CircleChild
public class Circle 
{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calculateArea()
	{
		//double Area= 3.14*this.radius*this.radius;
		//System.out.println("Area is "+Area);
		return 3.14*this.radius*this.radius;
	}
		
	
	public double calculatePerimeter()
	{

		//double Perim= 2*3.14*this.radius;
		//System.out.println("Perimieter is "+Perim);
		return 2*3.14*this.radius;
	}
	
	
}
