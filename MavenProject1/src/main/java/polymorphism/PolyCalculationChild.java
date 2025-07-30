package polymorphism;

public class PolyCalculationChild extends PolyCalculationParent {

	public static void main(String[] args) 
	{
		PolyCalculationChild obj = new PolyCalculationChild();
		obj.calOverloading(5, 10, 15);
		

	}
	
	void calOverloading(int a,int b, int c)
	{
		super.calOverloading(5,10);
		int s = a+b+c;
		System.out.println("Sum of three numbers is "+s);
		this.calOverloading(200);
	}
	
	void calOverloading(int a)
	{
		super.calOverloading(100);
		System.out.println("Sum of single number in Child class is "+a);
	}
	
	

}
