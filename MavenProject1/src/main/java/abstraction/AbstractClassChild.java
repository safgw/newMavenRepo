//Using the object of Child

package abstraction;

public class AbstractClassChild extends AbstractClass {

	public static void main(String[] args) {
		
		AbstractClassChild obj = new AbstractClassChild();
		obj.display();
		obj.sum();
		obj.multiply(2, 3);
		obj.diff(10, 6);

	}

	@Override // Inbuilt java implementation
	public void display() {
		System.out.println("This is the Abstarct method overridden from the Abstract Parent class");
	}

	@Override
	public void multiply(int x, int y) 
	{
		int product = x*y;
		System.out.println("Product from parameterised Abstract method is "+product);
		
	}
	
	public void diff(int x,int y)
	{
		int diff = x-y;
		System.out.println("Difference is "+diff);
	}

}
