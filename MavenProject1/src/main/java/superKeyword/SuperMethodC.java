package superKeyword;

public class SuperMethodC extends SuperMethodP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodC obj = new SuperMethodC();
		obj.display();
		

	}
	
	public void display()
	{
		int sum = 5;
		System.out.println("Hello");
		//this.sum();
		super.sum(1,2);
		
	}

}
