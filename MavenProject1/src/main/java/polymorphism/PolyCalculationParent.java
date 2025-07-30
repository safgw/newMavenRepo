package polymorphism;

public class PolyCalculationParent 
{
	
	void calOverloading(int a)
	{
		System.out.println("Sum of single number is "+a);
	}
	
	void calOverloading(int a,int b)
	{
		this.calOverloading(5);
		int s = a+b;
		System.out.println("Sum of two numbers is "+s);
	}
	
	
}
