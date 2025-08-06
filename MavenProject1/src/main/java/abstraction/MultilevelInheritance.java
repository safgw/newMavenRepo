package abstraction;

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		Perimeter cir = new Circle();
		Perimeter sqr = new Square();
		cir.perimeter(2);
		sqr.perimeter(2);
	}
}

abstract class Perimeter
{
	abstract void perimeter(int r);	
}

class Circle extends Perimeter 
{
	@Override
	void perimeter(int r) 
	{		
		System.out.println("Perimeter of circle is "+2*3.14*r);
	}		
}

class Square extends Perimeter
{
	@Override
	void perimeter(int r) 
	{
		System.out.println("Perimeter of circle is "+4*r);
	}		

}
