package superKeyword;

public class SuperConstructorC extends SuperConstructorP{
	
	public SuperConstructorC()
	{
		super(2,3);
		System.out.println("From Child Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructorC obj = new SuperConstructorC();

	}

}
