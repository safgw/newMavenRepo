package superKeyword;

public class SuperVariableC1 extends SuperVariableP1 {

	String color = "..Black.";	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableC1 obj = new SuperVariableC1();
		obj.colorPrint();

	}
	
	
	public void colorPrint()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

}
