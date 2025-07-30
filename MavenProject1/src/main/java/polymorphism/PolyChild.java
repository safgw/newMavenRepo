package polymorphism;

public class PolyChild extends PolyParent{

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.sum(10, 5);
	}

	void sum(int a,int b)
	{
		int diff = a-b;
		System.out.println("Difference is "+diff);
		super.sum(2,1);
	}
}
