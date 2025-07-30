package interfaceExample;

public class Interface1Child implements Interface1{

	public static void main(String[] args) 
	{
		Interface1 obj = new Interface1Child();   // Reference
		//Interface1Child obj = new Interface1Child();  / /Child Object

		obj.sum();
		obj.display();

	}

	@Override
	public void sum() {
		System.out.println("..Sum...");		
	}

	@Override
	public void display() {
		System.out.println("..Display...");		
		
	}

	
	
}
